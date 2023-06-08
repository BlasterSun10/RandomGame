/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.p7p3d;
import java.util.Scanner;

public class P7P3D {

    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        Jugador p = new Jugador();
        Lanzar l = new Lanzar();
        int c=1;
        
        System.out.println("BIENVENIDO");

        while (c!=0) {
            System.out.println("Presiona 1 para añadir jugador");
            c = j.nextInt();
            if(c==0){
                break;
            }
            l.tiradas();
        } 
        
        System.out.println("Jugadores: "+l.jlz.size());
        System.out.println("Ganadores: "+l.ganadores);
        System.out.println("Clave \tNombre \tJugadas \tGanadoras");
        for (int i = 0; i < l.jlz.size(); i++) {
            System.out.print(l.jlz.get(i).clave+"\t"+l.jlz.get(i).nombre+"\n");
            
        }
        
        
        

        
    }
}
