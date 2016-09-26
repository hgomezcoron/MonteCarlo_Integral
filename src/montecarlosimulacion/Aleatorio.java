/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlosimulacion;

import java.util.Scanner;

/**
 *
 * @author Cperez
 */
public class Aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int select = 0;
//        C_Mixto obj = new C_Mixto();
        C_Multiplicativo obj1 = new C_Multiplicativo();
        
            //Try catch para evitar que el programa termine si hay un error
            try {
                System.out.println("Elige opción:"
                        + "\n1.- C.Multiplicativo\n"
                        + "0.- Salir");
                //Recoger una variable por consola
                select = leer.nextInt();
            } catch (Exception e) {
                System.out.println("Uoop! Error!");
            }
            
              switch (select) {

//                    case 1: 
//                        System.out.println("ingrese a" + "= Constante multiplicativa.");
//                        int a = leer.nextInt();
//                        System.out.println("ingrese c" + "= Constante aditiva.");
//                        int c = leer.nextInt();
//                        System.out.println("ingrese mod" + "= La magnitud del módulo.");
//                        int mod = leer.nextInt();
//                        System.out.println("ingrese X0" + "= La semilla.");
//                        int xn = leer.nextInt();
//                        System.out.println("el resultado es\n" );
//                        obj.Mixto(a,c,xn,mod);
//                        
//                        break;
                                       
                    case 1:
                        System.out.println("ingrese a" + "= Constante multiplicativa.");
                        int A = leer.nextInt();
                        System.out.println("ingrese mod" + "= La magnitud del módulo.");
                        int Mod = leer.nextInt();
                        System.out.println("ingrese X0" + "= La semilla.");
                        int Xn = leer.nextInt();
                        System.out.println("el resultado es\n" );
                        obj1.Multiplicativo(A, Xn, Mod);
                        break;
                    default:
                        System.out.println("Número no reconocido");
                        break;
                }

                System.out.println("\n"); //Mostrar un salto de línea en Java

            } 
    }


