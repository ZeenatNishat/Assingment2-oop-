/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class SeriesPrinter {
    public void printSeries(int n){
        for(int i=0; i<=0; i++)
        {
            System.out.print(i+"");
        }
        System.out.println("");
    }
    public void printSeries(int startIndex, int endIndex){
        for(int i=startIndex; i<=endIndex; i++)
        {
            System.out.print(i+"");
            
        }
        System.out.println("");
    }
    public void printSeries(int startIndex, int endIndex, int interval){
        for(int i=startIndex; i<=endIndex; i+=interval)
        {
            System.out.print(i+"");
        }
        System.out.println("");
    }
    
    
    
    
}
