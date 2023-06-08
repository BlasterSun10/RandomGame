/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p7p3d;
import java.util.ArrayList;

public class Lanzar {
    public int dado1;
    public int dado2;
    public boolean v;
    public boolean c;
    public int cont;
    public int ganadores;
    ArrayList<Jugador> jlz = new ArrayList<>();
    
    public Lanzar(){
        dado1=0;
        dado2=0;
        v = false;
        c = false;
        cont=0;
        ganadores=0;
    }
    
    
    
    public void tiradas(){
        Jugador p = new Jugador();
        p.jugadas();
        dado1=(int)(Math.random()*(6-1+1)+1);  
        dado2=(int)(Math.random()*(3-1+1)+1); 
        System.out.println("Dado 1: "+dado1);
        System.out.println("Dado 2: "+dado2);
        for (int i = 0; i < 4; i++) {
            System.out.println("------------------------------------");
            System.out.println("Jugada "+(i+1));
            System.out.println("Tu jugada: ");
            for (int j = 0; j < 2; j++) {
                System.out.print(p.miJugada[i][j]+"\n");            
                if (j==0){
                    if (p.miJugada[i][j]==dado1) {
                        v = true;
                    }
                }
                if (j==1){
                    if (v) {
                        if (p.miJugada[i][j]==dado2) {
                            System.out.println("Ganador");  
                            cont ++;
                        }else{
                            v=false;
                        }
                    }          
                }       
            }
        }
        ganadores ++ ;
        jlz.add(p);
        
    }
    
  
    
}
