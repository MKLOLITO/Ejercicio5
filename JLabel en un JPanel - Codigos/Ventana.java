/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author raule
 */
public class Ventana extends JFrame {
    /*
     * Constructor básico de la ventana
     */
    public Ventana() throws HeadlessException {
        Dimension d = new Dimension(500, 500);
        this.setSize(d);
    }

    public Ventana(String title) throws HeadlessException, InterruptedException {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 500, 500);
        this.setLocationRelativeTo(null);

    }

  protected void iniciarPaneles() {
    JPanel contenedor = new JPanel();
    this.getContentPane().add(contenedor);
    contenedor.setBackground(Color.RED);
    
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    
    contenedor.add(panel1);
    contenedor.add(panel2);
    contenedor.add(panel3);
    
    panel1.setBackground(Color.RED);
    panel2.setBackground(Color.BLUE);
    panel3.setBackground(Color.GREEN);
    
    contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.X_AXIS));
}
}