package com.wellikson.introducaojunit5;

/**
 *
 * @author wellikson
 */
public class MathUtil {
    
    public static int mdc(int a , int b){
        
        if(b > 0 && a % b ==0){
            return b;
        }
        return -1;
    }
}
