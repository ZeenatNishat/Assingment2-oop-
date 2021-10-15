/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Phone {
    String display;
    int battery, price;
    Phone(){
        display = "5.5 Inch";
        battery = 5400;
        price = 20000;
        
        
    }
    Phone(int battery,int price, String display){
        this.display = display;
        this.battery = battery;
        this.price = price;
    }
    
    
}
