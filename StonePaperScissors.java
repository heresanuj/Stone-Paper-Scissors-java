package com.javabasics;
import java.util.Random;
import java.util.Scanner;
public class CWH_01_Task_Stone_Paper_Scissors {
    public static void main(String[] args) {
        //Task 1. Stone Paper Scissor Game
        //with one trail only
        Scanner sc=new Scanner(System.in);//input by user
        Random r=new Random();//input by computer
        System.out.println("Enter your Choice:");
        System.out.println("0=Rock,1=Paper,2=Scissors");
        int user=sc.nextInt();//input accessed by user
        int computer=r.nextInt(3);//accessed by computer
        //Display choices//
        if(user==0){
            System.out.println("You Entered Rock");
        } else if (user==1){
            System.out.println("You Entered Paper");
        }
        else if(user==2){
            System.out.println("You Entered Scissor");
        }
        else{
            System.out.println("Invalid Output");
        }
        //display computer choices
        if(computer==0){
            System.out.println("computer Entered Rock");
        }
        else if(computer==1){
            System.out.println("computer Entered Paper");
        }
        else if(computer==2){
            System.out.println("computer entered Scissors");
        }
//Game logic//
        if(user==computer){
            System.out.println("Draw");
        }
        else if((user==0&&computer==2)||(user==1&&computer==0)||(user==2&&computer==1)){
            System.out.println("User wins");
        }
        else{
            System.out.println("Comp Wins");
        }

    }
}
