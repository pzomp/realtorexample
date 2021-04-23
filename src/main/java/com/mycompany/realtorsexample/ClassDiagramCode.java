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
public class ClassDiagramCode {
    
          enum Office {NAME, MANAGER, ID_NUMBER, ADDRESS, PHONE_NUMBER}
          enum Agent {NAME, OFFICE_PHONE, CELL_PHONE, ID_NUMBER}
          enum NewListing {STATUS_CODE, ADDRESS, OWNERS_NAME, OWNERS_PHONE_NUMBER, BUILD_DATE, SQUARE_FEET, NUMBER_OF_BEDROOMS, NUMBER_OF_BATHROOMS, ASKING_PRICE}
          private final int n;
          private String temp;
                public ClassDiagramCode(int n)
        {
                 this.n = n;
        }
                
               public String checkConditions(){
                          
            switch (n){   
                case 1:
                    if(n == 1){
                   for(Office o: Office.values())
                   {temp += o.toString(); temp += " ";}
                   
                        return "an office needs to have 1 or more agents and has the following traits:\n"+ temp;
                    }
                   
                case 2:
                    if(n == 2){
                   for(Agent a: Agent.values())
                   {temp += a.toString();}
                    
                        return "and agent can have 1 office and 0 or more listings and has the following traits:\n"+ temp;
                    }
                case 3: 
                    if(n == 3){
                   for(NewListing nl: NewListing.values())
                   {temp += nl.toString();}
                                            
                        return "a listing needs to have 1 agent and hsa the following traits:\n"+ temp;
                    } 
                }
              return "invalid entry";
            }
}
