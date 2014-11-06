/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7ej4;

/**
 *
 * @author ddizoya
 */
public class CuentasPersonas {
    private float peso;
    private String nombre;
    
public void setPeso (float peso){
    this.peso = peso;
}

public float getPeso (){
    return peso;
}

public void setNombre (String nombre){
    this.nombre = nombre;
}

public String getNombre (){
    return nombre;
}
    

public void comparar(CuentasPersonas p1,CuentasPersonas p2){
    
    if(p1.peso > p2.peso){
        System.out.println("El peso de "+p1.nombre+" es superior.");
    } else {
        System.out.println("El peso de "+p2.nombre+" es superior.");
    }
}




}
