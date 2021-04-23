/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.realtorsexample;

import java.util.Scanner;

/**
 *
 * @author paul
 */
public class NewClass {
    
        public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         
        System.out.println("please enter mtching number for user type:\n 1: agent\n2: owner\n3: recptionist\n4: buyer");
        int j = sc.nextInt();
        System.out.println("please enter mtching number for task type:\n 1: add listing\n2: provide listing info\n3: update listing\n4: book showing\n5: buying a property");
        int t = sc.nextInt();
        UseCaseCode ucc = new UseCaseCode(j, t);
        
        if (ucc.checkAllowed() == true){
            System.out.println("you are allowed to do that");
        }else{
            System.out.println("you are not allowed to do that");
        }
        
        System.out.println("please enter mtching number to check conditions:\n 1: office\n2: agent\n3: new listing");
        int n = sc.nextInt();
        ClassDiagramCode cdc = new ClassDiagramCode(n);
        System.out.println(cdc.checkConditions());
    }
    
}
