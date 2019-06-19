/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.examen06rqc;

import java.util.Scanner;

/**
 *
 * @author Rodolfo Quispe Conza 
 */
public class EXAMENQC {
    
    public void imprimir(int[][] matriz){
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz1[j] + "\t");
            }
            System.out.println("");
        }
    }
    
     public int[][]EXAMEN06RQC(int dimen, int NumInit){
          System.out.println("Ejercicio 6: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
               for (int j = 0; j < matriz.length ; j++) {
                  if ( j<i+1){
                      matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[i][j]=-1;
                }   
              }contador=0;
          }
          return matriz;
     } 
     public int[][]EXAMEN09RQC(int dimen, int NumInit){
          System.out.println("Ejercicio 9: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
               for (int j = 0; j < matriz.length ; j++) {
                  if (j>=dimen-(i+1)){
                      matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
          return matriz;
     }    
    
     public int[][]EXAMEN012RQC(int dimen, int NumInit){
          System.out.println("Ejercicio 12: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
              for (int j = matriz[0].length-1; j>=0; j--) {
                  if (j>=i){
                      matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
          return matriz;
     }
    public int[][]EXAMEN026RQC(int dimen, int NumInit){
         System.out.println("Ejercicio 26: ");
         int[][] matriz=new int[dimen][dimen];
          int contador=0;
          for (int i = 0; i< matriz.length ; i ++) {
                if(contador%2==0){
                    for (int j = matriz[0].length-1; j>=0; j--) { 
                    matriz[i][j]=NumInit; 
                    NumInit++;
                    contador++;
         }
         }else{
               for (int j = 0; j< matriz.length ; j ++) {
                matriz[i][j]=NumInit;
                NumInit++;
                contador++;
                }
            } 
            } contador=0;         
    return matriz;
    }
    public int[][]EXAMEN030RQC(int dimen, int NumInit){
     System.out.println("Ejercicio 30: ");
        int[][] matriz=new int[dimen][dimen];
        for (int c = 0; c < dimen/2; c++) {
             for (int ldx = c;ldx < dimen-c-1; ldx++) {
                matriz[ldx][dimen-1-c]= NumInit;
                NumInit++;   
            }
             for (int lix = dimen-c-1;lix > c; lix--) {
                matriz[dimen-1-c][lix]= NumInit;
                NumInit++;
            }
           for (int lxx = dimen-c-1;lxx > c; lxx--) {
                matriz[lxx][c]= NumInit;
                NumInit++;  
           }
            for (int lsx = c; lsx < dimen-c-1; lsx++) {
                matriz[c][lsx]= NumInit;
             NumInit++;   
            }
        }
            if(dimen%2!=0){
                matriz[dimen/2][dimen/2]=NumInit;
            }
        
        return matriz;
    }
    public static void main(String[] args) {
               Scanner o=new Scanner(System.in);
               EXAMENQC or=new EXAMENQC();
               System.out.println("Ingrese la dimencion de la matriz: ");
               int din=o.nextInt();
               System.out.println("Ingrese el numero de inicio: ");
               int ini=o.nextInt();
               System.out.println("\n");
              
               or.imprimir(or.EXAMEN06RQC(din, ini));
               or.imprimir(or.EXAMEN09RQC(din, ini));
               or.imprimir(or.EXAMEN012RQC(din, ini));
               or.imprimir(or.EXAMEN026RQC(din, ini));
               or.imprimir(or.EXAMEN030RQC(din, ini));
              
    }
    
}

