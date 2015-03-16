package composite;

import java.util.Iterator;

/**
 * 组合模式
 * Created by TrampBoy on 2015/3/15.
 */
public class Client {
   public static void main(String[] args){
       MilitaryOffice militaryOffice = new MilitaryOffice("连长", 5000);
       MilitaryOffice militaryOffice1 = new MilitaryOffice("排长1", 4000);
       MilitaryOffice militaryOffice2 = new MilitaryOffice("排长2", 4000);
       militaryOffice.add(militaryOffice1);
       militaryOffice.add(militaryOffice2);
       MilitaryOffice militaryOffice3 = new MilitaryOffice("班长1", 2000);
       MilitaryOffice militaryOffice4 = new MilitaryOffice("班长2", 2000);
       militaryOffice1.add(militaryOffice3);
       militaryOffice1.add(militaryOffice4);
       MilitaryOffice militaryOffice5 = new MilitaryOffice("班长3", 2000);
       MilitaryOffice militaryOffice6 = new MilitaryOffice("班长4", 2000);
       militaryOffice2.add(militaryOffice5);
       militaryOffice2.add(militaryOffice6);
       for (int i = 1; i < 6 ; i++) {
           MilitarySolider militarySolider = new MilitarySolider("士兵" + i, 1000);
           militaryOffice3.add(militarySolider);
       }
       for (int i = 6 ; i < 11 ; i++) {
           MilitarySolider militarySolider = new MilitarySolider("士兵" + i, 1000);
           militaryOffice4.add(militarySolider);
       }
       for (int i = 11; i < 16 ; i++) {
           MilitarySolider militarySolider = new MilitarySolider("士兵" + i, 1000);
           militaryOffice5.add(militarySolider);
       }
       for (int i = 16 ; i < 21 ; i++) {
           MilitarySolider militarySolider = new MilitarySolider("士兵" + i, 1000);
           militaryOffice6.add(militarySolider);
       }
       computerMilitary(militaryOffice);
       computerMilitary(militaryOffice1);
       computerMilitary(militaryOffice6);

   }

    private static void computerMilitary(MilitaryPerson militaryPerson){
        System.out.println(militaryPerson.getName());
        System.out.println("整个团队花费："+computerSalary(militaryPerson));
    }

    private static double computerSalary(MilitaryPerson militaryPerson){
        double sum = 0;
        sum += militaryPerson.getSalary();
        if (!militaryPerson.isLeaf()) {
            Iterator<MilitaryPerson> iterator = militaryPerson.getAllChildren();
            while (iterator.hasNext()) {
                sum += computerSalary(iterator.next());
            }
        }
        return sum;
    }
}
