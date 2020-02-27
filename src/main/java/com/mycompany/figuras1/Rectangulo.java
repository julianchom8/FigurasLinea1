/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figuras1;

import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Rectangulo extends figuras_1{
     
    private int lado2;
    
    
    @Override
     public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(getLado1()== getLado2()){
       // getLado1();
        g.drawRect(20, 10, getLado1(), getLado1());
        }else{
            JOptionPane.showMessageDialog(null,"los lados no pueden ser iguales");
        }
    }
     
    @Override
    public void hallarArea(){
           
            setArea(getLado1()*getLado2());
           System.out.println(getArea()); 
        }
    @Override
    public void hallarPerimetro(){
        setPerimetro(getLado1()*2+getLado2()*2);
        System.out.println("El perimetro es "+getPerimetro());
    }

    /**
     * @return the lado2
     */
    public int getLado2() {
        return lado2;
    }

    /**
     * @param lado2 the lado2 to set
     */
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
}
