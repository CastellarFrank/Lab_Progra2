/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Lista_User.java
 *
 * Created on 02-17-2012, 08:38:52 AM
 */
package GenerarObjetos;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author NIGHTMARE
 */
public class Lista_User extends javax.swing.JFrame {

    Usuario usuarios[];
    int cantidad;
    Container principal;
    Container contenedores[][];
    Object objetos[][];
    
    /** Creates new form Lista_User */
    public Lista_User(Usuario users[],int cant) {
        initComponents();
        this.usuarios=users;
        this.cantidad=cant;
        iniciar();
        addListener();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-500)/2, (screenSize.height-400)/2, 500, 400);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
        this.principal=new Container();
        this.contenedores=new Container[cantidad][2];
        this.objetos=new Object[cantidad][5];
        crearObjetos();
    }

    private void crearObjetos() {
        this.principal.setBounds(0,0,200,500);
        principal.setLayout(new BoxLayout(this.principal,BoxLayout.PAGE_AXIS));
        for(int i=0;i<this.cantidad;i++){
            this.contenedores[i][0]=new Container();
            this.contenedores[i][0].setSize(90,100);
            this.contenedores[i][0].setLayout(new BoxLayout(this.contenedores[i][0],BoxLayout.LINE_AXIS));
            this.contenedores[i][1]=new Container();
            this.contenedores[i][1].setSize(110, 100);
            this.contenedores[i][1].setLayout(new BoxLayout(this.contenedores[i][1],BoxLayout.PAGE_AXIS));
            this.objetos[i][0]=new JLabel();
            configurarImagen(i);
            this.objetos[i][1]=new JLabel(this.usuarios[i].nombre);
            this.objetos[i][2]=new JLabel(this.usuarios[i].apellido);
            this.objetos[i][3]=new JLabel(this.usuarios[i].direccion);
            this.objetos[i][4]=new JLabel((usuarios[i].sexo=='M'?"Masculino":"Femenino"));
            colocarObjetos(i);
        }
        JScrollPane scroll=new JScrollPane();
        scroll.setViewportView(principal);
        scroll.setSize(200,300);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBorder(null);
        this.getContentPane().add(scroll);
    }

    private void configurarImagen(int i) {
        ImageIcon icon=new ImageIcon(this.usuarios[i].url);
        ImageIcon image=new ImageIcon(icon.getImage().getScaledInstance(90, 100, Image.SCALE_DEFAULT));
        ((JLabel)this.objetos[i][0]).setIcon(image);
    }
    //Termino la clase en configurar la imagen del primer label (Label Image)

    private void colocarObjetos(int i) {
        this.contenedores[i][0].add(((JLabel)this.objetos[i][0]));
        this.contenedores[i][0].add(Box.createRigidArea(new Dimension(10,0)));
        this.contenedores[i][1].add(((JLabel)this.objetos[i][1]));
        this.contenedores[i][1].add(Box.createRigidArea(new Dimension(0,5)));
        this.contenedores[i][1].add(((JLabel)this.objetos[i][2]));
        this.contenedores[i][1].add(Box.createRigidArea(new Dimension(0,5)));
        this.contenedores[i][1].add(((JLabel)this.objetos[i][3]));
        this.contenedores[i][1].add(Box.createRigidArea(new Dimension(0,5)));
        this.contenedores[i][1].add(((JLabel)this.objetos[i][4]));
        this.contenedores[i][0].add(this.contenedores[i][1]);
        this.contenedores[i][0].add(Box.createRigidArea(new Dimension(10,0)));
        this.principal.add(this.contenedores[i][0]);
        this.principal.add(Box.createRigidArea(new Dimension(0,10)));
    }

    private void tirarMensaje(){
        JOptionPane.showMessageDialog(rootPane, "Probando boton","boton",JOptionPane.INFORMATION_MESSAGE);
    }
    private void addListener() {
        for(int i=0;i<this.cantidad;i++){
            ((JLabel)this.objetos[i][0]).addMouseListener(new java.awt.event.MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent evt){
                    tirarMensaje();
                }
            });
        }
    }
}
