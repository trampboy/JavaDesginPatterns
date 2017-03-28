package com.buer.javadesignpatterns.mediator;

import java.util.ArrayList;

/**
 * Created by TrampBoy on 2015/2/24.
 */
public class ConcreteMediator {
    ArrayList<Lender> lenders;
    ArrayList<Lessor> lessors;

    public ConcreteMediator() {
        lenders = new ArrayList<Lender>();
        lessors = new ArrayList<Lessor>();
    }

    public void registerLender(Lender lender){
        lenders.add(lender);
    }

    public void registerLessor(Lessor lessor){
        lessors.add(lessor);
    }

    public void deliverMess(User user, String mess){
        if (user instanceof Lender) {
            lessorReceiverMess(mess);
        } else if (user instanceof Lessor) {
            lenderReceiverMess(mess);
        }
    }

    private void lenderReceiverMess(String mess) {
        for (Lender lender : lenders) {
            lender.receiverMess(mess);
        }
    }

    private void lessorReceiverMess(String mess) {
        for (Lessor lessor : lessors ) {
            lessor.receiverMess(mess);
        }
    }

}
