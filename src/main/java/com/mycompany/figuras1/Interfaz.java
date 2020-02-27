/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figuras1;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author usuario
 */
public class Interfaz extends JFrame{
    /**
     * Constructor de la clase
     */
    public Interfaz(){
        crearVentana();
    }
    /**
     * Metodo para crear la ventana
     */
     public void crearVentana(){
        setTitle("Figuras");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setLayout(new BorderLayout());
    }
}
