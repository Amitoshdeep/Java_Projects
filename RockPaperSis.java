/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projects;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author amito
 */
public class RockPaperSis {
    public static void main(String[]args){
     int a,b;  
     Random rnd=new Random();
     Scanner sc=new Scanner(System.in);
     int CP=0,UP=0;
     //UP for User Points and Comp
     a=1+rnd.nextInt(3);
     System.out.println("Round 1");
     System.out.print("Enter: 1 -> Rock 2 -> Paper, 3 -> Sissors: ");
     b=sc.nextInt();
     
     if(a==1 && b==3 || a==2 && b==1 || a==3 && b==2){
         System.out.println("Computer did: "+ a);
         System.out.println("Computer Wins!");
         CP=++CP;
         System.out.println("User Points: "+UP+"\n"+"Comp Points: "+CP);
     }
     else if (a==1 && b==2 || a==2 && b==3 || a==3 && b==1){
         System.out.println("Computer did: "+a);
         System.out.println("User Wins!");
         UP=++UP;
         System.out.println("User Points: "+UP+"\n"+"Comp Points: "+CP);
     }
     else{
         System.out.println("Its a Draw!");
         System.out.println("User Points: "+UP+"\n"+"Comp Points: "+CP);
     }
     //For Rounds
     int R=1;
     while(CP<5 && UP<5){
         a=1+rnd.nextInt(3);
         R=++R;
         System.out.println("Round"+R);
         System.out.print("Enter: 1 -> Rock 2 -> Paper, 3 -> Sissors: ");
         b=sc.nextInt();
         
         if(a==1 && b==3 || a==2 && b==1 || a==3 && b==2){
            System.out.println("Computer did: "+ a);
            System.out.println("Computer Wins!");
            CP=++CP;
            System.out.println("User Points: "+UP+"\n"+"Comp Points: "+CP);
        }
        else if (a==1 && b==2 || a==2 && b==3 || a==3 && b==1){
            System.out.println("Computer did: "+a);
            System.out.println("User Wins!");
            UP=++UP;
            System.out.println("User Points: "+UP+"\n"+"Comp Points: "+CP);
        }
        else{
            System.out.println("Its a Draw!");
            System.out.println("User Points: "+UP+"\n"+"Comp Points: "+CP);
        }
         
        }
     
    }
}
