package com.ncit.service;

import com.ncit.entity.ArrivingCall;
import com.ncit.entity.CallSystem;

import java.util.List;

public class Simulator {

    public static void performSimulation(){

        int clock = CallSystem.getClock();

        //simulation starts
        while(true){
            clock++;
            CallSystem.setClock(clock);
            System.out.println("================================================================");
            System.out.println("\t\tCurrent time: "+ CallSystem.getClock());
            ArrivingCall arrivingCall = ArrivingCallHandler.createArrivingCall();
            CallSystem.getArrivingCallList().add(arrivingCall);
            ArrivingCallHandler.displayAllArrivingCalls(CallSystem.getArrivingCallList());
            System.out.println("================================================================\n");

            //To make each iteration visible for one second
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }

            //condition to stop simulation
            if(clock==20){
                break;
            }

        }
    }

}
