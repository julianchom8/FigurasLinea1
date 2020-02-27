/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figuras1;

import com.mycompany.figuras1.ventanas.CuadradoV;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Cuadrado extends figuras {
    
    public Cuadrado(){
        
    }
    
    CuadradoV v = new CuadradoV();
    Graphics2D g2D;
    int posX[]={v.getLado1(),v.getLado2()};
    int posy[]={v.getLado3(),v.getLado4()};
    

    public void paintComponent(Graphics g) {
        g2D=(Graphics2D)g;
        g2D.setStroke(new BasicStroke(5));
        g2D.setColor(Color.red);
        g2D.fillPolygon(posX,posy,2);
     
    }

}
