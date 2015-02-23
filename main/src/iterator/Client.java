package iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public class Client {
    public static void main(String[] args){
        int num = 0;
        Collection<Money> set = new HashSet<Money>();
        initDate(set);
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Money money = (Money) iterator.next();
            if (!money.isTrue) {
                System.out.println( "是假钞");
            }
        }
    }
    private static void initDate(Collection<Money> set) {
        for (int i = 0;i < 20;i++) {
            if (i == 2 || i == 4) {
                set.add(new Money(100, false));
            } else {
                set.add(new Money(100, true));
            }
        }
    }
}
