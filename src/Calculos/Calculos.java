/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculos;

import java.util.ArrayList;


/**
 *
 * @author Sergio M
 */
public class Calculos {
        
    public static Float get_mediaF(ArrayList <Float> v)
    {
        float result = 0;       
        for(int i = 0; i < v.size();i++)
        {
            result += v.get(i);  
        }       
        return result/v.size();        
    }
    
        public static Float get_mediaI(ArrayList <Integer> v)
    {
        float result = 0;       
        for(int i = 0; i < v.size();i++)
        {
            result += v.get(i);  
        }       
        return result/v.size();        
    }
    
}
