/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtube2;

/**
 *
 * @author vtali
 */
public class visualizacion {
 private usuario espectador;
    private video video;

    public visualizacion(usuario espectador, video video) {
        this.espectador = espectador;
        this.video = video;
    }

    public usuario getEspectador() {
        return espectador;
    }

    public void setEspectador(usuario espectador) {
        this.espectador = espectador;
    }

    public video getVideo() {
        return video;
    }

    public void setVideo(video video) {
        this.video = video;
    }     
}
"comentario de preuba"