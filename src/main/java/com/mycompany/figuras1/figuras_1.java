/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figuras1;

import com.mycompany.figuras1.ventanas.CuadradoV;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class figuras_1 extends JPanel {

    private int area;
    private int perimetro;
    private int lado1;

   

    public void hallarArea() {
        CuadradoV datos = new CuadradoV();
        datos.parseoDatos();
        if (datos.getLado1() == datos.getLado2() && datos.getLado2() == datos.getLado3() && datos.getLado3() == datos.getLado4()) {
        
        }
    }

    public void hallarPerimetro() {
        setPerimetro(getLado1() * 4);
    }

    /**
     * @return the area
     */
    public int getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(int area) {
        this.area = area;
    }

    /**
     * @return the perimetro
     */
    public int getPerimetro() {
        return perimetro;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    /**
     * @return the lado1
     */
    public int getLado1() {
        return lado1;
    }

    /**
     * @param lado1 the lado1 to set
     */
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

}
