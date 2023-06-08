/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//(int)(Math.random()*(300-100+1)+100);   
package com.mycompany.p7p3d;
import java.util.Scanner;

public class Jugador {
    Scanner n = new Scanner(System.in);
    public String nombre;
    public int clave;
    public int miJugada[][];
    
    public Jugador(){
        nombre="";
        clave=0;
        miJugada = new int[4][2];
    }

    public void jugadas(){
        System.out.println("Inserte su nombre: ");
        nombre = n.nextLine();
        
        System.out.println("El jugador "+nombre+" esta participando");
        clave=(int)(Math.random()*(999+1));    
        for (int i = 0; i < 4; i++) {
            System.out.println("Jugada No. "+(i+1));
            for (int j = 0; j < 2; j++) {
                if(j==0){
                    System.out.println("Inserte un número del 1 al 6");
                    do{
                        miJugada[i][j] = n.nextInt();
                    }while(miJugada[i][j]>6);
                }
                if(j==1){
                    System.out.println("Inserte el operador del 1 al 3");
                    do{
                        miJugada[i][j] = n.nextInt();
                    }while(miJugada[i][j]>3);
                }           
            }      
        }
    }
    
}
