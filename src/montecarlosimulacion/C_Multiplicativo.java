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
    boolean booleano1[] = new boolean[20000];
    DecimalFormat df = new DecimalFormat("0.0000"); 
    DecimalFormat dy = new DecimalFormat("0.00"); 
    private double coeficienteA,coeficienteB,coeficienteC ;
    private double exponencialX;
    private double intervalo1,intervalo2; 
    private double valorX;

    public double getCoeficienteA() {
        return coeficienteA;
    }

    public void setCoeficienteA(double coeficienteA) {
        this.coeficienteA = coeficienteA;
    }

    public double getCoeficienteB() {
        return coeficienteB;
    }

    public void setCoeficienteB(double coeficienteB) {
        this.coeficienteB = coeficienteB;
    }

    public double getCoeficienteC() {
        return coeficienteC;
    }

    public void setCoeficienteC(double coeficienteC) {
        this.coeficienteC = coeficienteC;
    }

    public double getExponencialX() {
        return exponencialX;
    }

    public void setExponencialX(double exponencialX) {
        this.exponencialX = exponencialX;
    }

    public double getIntervalo1() {
        return intervalo1;
    }

    public void setIntervalo1(double intervalo1) {
        this.intervalo1 = intervalo1;
    }

    public double getIntervalo2() {
        return intervalo2;
    }

    public void setIntervalo2(double intervalo2) {
        this.intervalo2 = intervalo2;
    }
    
    public void Multiplicativo(int a, int X0, int mod) {
        
        double X1=(double)X0/mod;
        if (X0 > 0 && a > 0 && mod > 0) {
           
            if (a != X0) {
              System.out.println("    "+"X"+"     "+"Y"+"  Función x"+"  y < Función");
                for (int i = 1; i <= mod; i++) {
                    
                    X0 = (X0 * a) % mod;
                    double convertir1 = (double) X0 / mod;
                    Xi[i] = convertir1;
                    
                    valorX = (double) Xi[i];
                    double x_funcion= Math.pow(valorX, exponencialX) * (coeficienteA) + (coeficienteB*valorX) + coeficienteC;
                    
                    X0 = (X0 * a) % mod;
                    double convertir2 = (double) X0 / mod;
                    Yi[i] = convertir2;
                    
                    if(Yi[i]<x_funcion){
                        booleano[i]=true;
                        //se agrega a los puntos debajo de la curva
                    }else{
                        booleano[i]=false;
                        //se agrega a los puntos encima de la curva

                    }
                    if (X1 != convertir1&&X1 != convertir2){
                                                  
                        System.out.println("  "+dy.format(Xi[i])+"   "+dy.format(Yi[i])+ "  "+df.format(x_funcion) + "  "+booleano[i]);
                    } else {
                                
                        // se encuentra la semilla
                        
                        double valorR = (double) convertir1;
                        
                        double x_funcion1 = Math.pow(valorR, exponencialX) * (coeficienteA) + (coeficienteB * valorR) + coeficienteC;
                        
                        if (Yi[i] < x_funcion1) {
                            booleano1[i] = true;
                            //se agrega a los puntos debajo de la curva
                        } else {
                            booleano1[i] = false;
                            //se agrega a los puntos encima de la curva

                        }
                        System.out.println("  " + convertir1 + "   " + convertir2 + "  " + x_funcion1 + "  " + booleano1[i]);    
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