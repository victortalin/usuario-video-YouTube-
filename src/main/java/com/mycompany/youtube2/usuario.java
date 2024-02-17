/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtube2;

/**
 *
 * @author vtali
 */
public class usuario {
public String nombre;
    public video videoSubido;

    public usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public video getVideoSubido() {
        return videoSubido;
    }

    public void subirVideo(video videoSubido) {
        this.videoSubido = videoSubido;
    }
    
    public void mostrarInfoUsuario(){
        System.out.println("Usuario: "+ nombre );
        if(videoSubido !=null){
            System.out.println("Último video subido: " +videoSubido.getTitulo ());
        }else{
            System.out.println("Aún no se han subido videos");
        }
    }    
}
