package com.buer.javadesignpatterns.chainofresponsibility;

/**
 * Created by TrampBoy on 2015/2/23.
 */
public class Client {
    public static void main(String[] args){
        String name = "C";
        SurveyorA surveyorA = new SurveyorA();
        SurveyorB surveyorB = new SurveyorB();
        SurveyorC surveyorC = new SurveyorC();
        SurveyorD surveyorD = new SurveyorD();
        surveyorA.setNextHandler(surveyorB);
        surveyorB.setNextHandler(surveyorC);
        surveyorC.setNextHandler(surveyorD);
        surveyorA.handleRequest(name);
    }
}
