/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlosimulacion;

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
    
    public void Multiplicativo(int a, int X0, int mod) {
        double X1=(double)X0/100;
        if (X0 > 0 && a > 0 && mod > 0) {
           
            if (a != X0) {
              
                for (int i = 1; i <= mod; i++) {
                    
                    X0 = (X0 * a) % mod;
                    double convertir = (double) X0 / mod;
                    Xi[i] = convertir;
                    X0 = (X0 * a) % mod;
                    convertir = (double) X0 / mod;
                    Yi[i] = convertir;

                    if (X1 !=convertir){
                           
//                           if(i%2==0){
//                               Xi[i]=convertir;
//                           }
//                           else{
//                               Yi[i]=convertir;
//                           }
                       System.out.println("  "+Xi[i]+"   "+Yi[i]);
                       
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
