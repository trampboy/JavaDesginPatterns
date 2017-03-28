package com.buer.javadesignpatterns.mediator;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public class Client {
    public static void main(String[] args){
        ConcreteMediator concreteMediator = new ConcreteMediator();
        Lender lenderA = new Lender(concreteMediator);
        lenderA.setName("求租者A");
        concreteMediator.registerLender(lenderA);
        Lender lenderB = new Lender(concreteMediator);
        lenderB.setName("求租者B");
        concreteMediator.registerLender(lenderB);
        Lessor lessorA = new Lessor(concreteMediator);
        lessorA.setName("出租者A");
        concreteMediator.registerLessor(lessorA);
        Lessor lessorB = new Lessor(concreteMediator);
        lessorB.setName("出租者B");
        concreteMediator.registerLessor(lessorB);

        lenderA.publishMess("房客A要租房子");
        lenderB.publishMess("房客B要租房子");
        lessorA.publishMess("房东A要出租房子");
        lessorB.publishMess("房东B要出租房子");
    }
}
