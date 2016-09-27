/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlosimulacion;

import java.text.DecimalFormat;

/**
 *
 * @author Hans Gomez
 */
public class C_Multiplicativo {
    //int a=3;
    //int xn=17;
    //int mod=100;
    
    double Xi[] = new double[20000];
    double Yi [] = new double [20000];
    boolean booleano[] = new boolean[20000];
    DecimalFormat df = new DecimalFormat("0.0000"); 
    
    public void Multiplicativo(int a, int X0, int mod) {
        double X1=(double)X0/100;
        if (X0 > 0 && a > 0 && mod > 0) {
           
            if (a != X0) {
              System.out.println("    "+"X2"+"     "+"Y");
                for (int i = 1; i <= mod; i++) {
                    
                    X0 = (X0 * a) % mod;
                    double convertir = (double) X0 / mod;
                    Xi[i] = Math.pow(convertir, 2);
                    
                    X0 = (X0 * a) % mod;
                    convertir = (double) X0 / mod;
                    Yi[i] = convertir;
                    
                    if(Yi[i]<Xi[i]){
                        booleano[i]=true;
                        //se agrega a los puntos debajo de la curva
                    }else{
                        booleano[i]=false;
                        //se agrega a los puntos encima de la curva

                    }
                    if (X1 !=convertir){
                           
//                           if(i%2==0){
//                               Xi[i]=convertir;
//                           }
//                           else{
//                               Yi[i]=convertir;
//                           }
                        
                        System.out.println("  "+df.format(Xi[i])+"   "+Yi[i]+ "  "+booleano[i]);
                       
                       }else{
                           System.out.println("No tiene periodo maximo");
                           break;
                       }
                }
               
                }else {
            System.out.println("IGUALDAD");
        
            }
        
        } else {
            System.out.println("LOS VALORES TIENEN QUE SER MAYOR A 0");
}
}
    
}



//  0.51   0.53
//  0.59   0.77
//  0.31   0.93
//  0.79   0.37
//  0.11   0.33
//  0.99   0.97
//  0.91   0.73
//  0.19   0.57
//  0.71   0.13