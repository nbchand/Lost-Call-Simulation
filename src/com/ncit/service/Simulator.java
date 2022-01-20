package com.ncit.service;

import com.ncit.entity.CallSystem;


public class Simulator {

    public static void performSimulation(){

        int clock = CallSystem.getClock();

        //simulation starts
        while(true){
            clock++;
            CallSystem.setClock(clock);
            System.out.println("================================================================");

            CallProcessor.completeOngoingCalls();

            CallProcessor.scheduleArrivingCalls();

            if(CallSystem.getClock()!=100){
                ArrivingCallHandler.updateArrivingCallList();
            }

            System.out.println("\nArriving calls at the time:");
            ArrivingCallHandler.displayAllArrivingCalls();

            System.out.println("\nOngoing calls at the time:");
            OngoingCallHandler.displayAllOngoingCalls();

            System.out.println("\n"+CallSystem.getCallCounter());

            System.out.println("\nCurrent time: "+ CallSystem.getClock());

            System.out.println("\n================================================================\n");

            //To make each iteration visible for one second
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }

            //condition to stop simulation
            if(clock==100){
                break;
            }

        }
    }

}
