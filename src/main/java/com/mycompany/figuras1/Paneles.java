
package com.mycompany.figuras1;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class Paneles extends JPanel{
    // Boton para cambiar el color de linea
    private JButton btnColorLinea;
    //  Boton para cambiar el color de fondo
    private JButton btnColorFondo;
    //  Etiqueta que imprime el area
    private JLabel etiquetaArea;
    //  Etiqueta que imprime el perimetro
    private JLabel etiquetaPerimetro;
    //  Etiqueta que imprime la altura
    private JLabel etiquetaAltura;
    //  Guarda la interfaz
    private Interfaz interfaz;
    
    public Paneles(Interfaz interfaz){
        //  Configuracion de panel
        this.interfaz = interfaz;
        setLayout(new GridLayout(5, 1));
        setBackground(Color.WHITE);
        
        agregarBoton();
        agregarEtiqueta();
    }
    
    
    public void agregarBoton(){
        btnColorLinea = new JButton("Cambiar Lineas");
        btnColorLinea.setActionCommand("COLOR_LINEA");
        //btnColorLinea.addActionListener(this);
        add(btnColorLinea);
        
        btnColorFondo = new JButton("Cambiar Fondo");
        btnColorFondo.setActionCommand("COLOR_FONDO");
       // btnColorFondo.addActionListener(this);
        add(btnColorFondo);
    }
     public void agregarEtiqueta(){
        etiquetaArea = new JLabel("Area: ");
        add(etiquetaArea);
        
        etiquetaPerimetro = new JLabel("Perimetro: ");
        add(etiquetaPerimetro);

        etiquetaAltura = new JLabel("");
        add(etiquetaAltura);
    }
    
    
}
