/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsaleguipkg;

/**
 *
 * @author Samantha
 */
public class LaptopClass extends ComputerClass{
    double Weight;
    
    public LaptopClass(){
        super();
        this.Weight = 0.0;
    }
    
    public void DisplayComputerInfo(){
        super.DisplayComputerInfo();
        System.out.println("Weight: " +this.Weight +"Kg");
    }
    
    public String getComputerInfo(){
        String sInfo = super.getComputerInfo();
        
        sInfo = sInfo +"Weight: " +this.Weight +"Kg";
        
        return sInfo;
    }
}
