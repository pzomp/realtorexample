/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.realtorsexample;

/**
 *
 * @author paul
 */
public class UseCaseCode {
    
        private final int job;
        private final int task;
    
            public UseCaseCode(int j, int t)
        {
           task = t;
           job = j;
           
        }
            
        public Boolean checkAllowed(){
            
            switch (job){
                
                case 1:
                    if(task == 1 || task == 2){
                        return true;
                    }
                   
                case 2:
                    if(task == 2 || task == 4){
                        return true;
                    }
                case 3: 
                    if(task == 3 || task == 4){
                        return true;
                    }
                case 4:
                    if(task == 5){
                        return true;
                    }
            }
            
            return false;
        } 
    
}
