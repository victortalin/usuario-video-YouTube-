/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.youtube2;

/**
 *
 * @author vtali
 */
public class Youtube2 {

    public static void main(String[] args) {
      usuario usuario= new usuario( "victor talin" )
        video video = new video("Aprendiendo java",2400,"https;//youtube.com");
        usuario.subirVideo(video);
        usuario.mostrarInfoUsuario();
    }
    }

