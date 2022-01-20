package com.ncit.service;

import com.ncit.entity.ArrivingCall;
import com.ncit.entity.CallSystem;

public class Simulator {

    public static void performSimulation(){

        int clock = CallSystem.getClock();

        //simulation starts
        while(true){
            clock++;
            CallSystem.setClock(clock);
            System.out.println("================================================================");
            System.out.println("\t\tCurrent time: "+ CallSystem.getClock());

            CallProcessor.scheduleArrivingCalls();

            if(CallSystem.getClock()!=100){
                ArrivingCall arrivingCall = ArrivingCallHandler.createArrivingCall();
                CallSystem.getArrivingCallList().add(arrivingCall);
            }
            ArrivingCallHandler.displayAllArrivingCalls(CallSystem.getArrivingCallList());
            System.out.println("================================================================\n");

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
