package GenerarObjetos;


import javax.swing.JFileChooser;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Informacion.java
 *
 * Created on 02-16-2012, 09:44:50 PM
 */
/**
 *
 * @author NIGHTMARE
 */
public class Informacion extends javax.swing.JFrame {
    Lista_User ventana;
    Usuario usuarios[];
    int cant;
    String u;
    public Informacion() {
        initComponents();
        iniciar();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        cmbSexo = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Información");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 40, 160, 20);

        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 120, 60, 14);

        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 90, 60, 14);

        jLabel4.setText(" Dirección:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 150, 60, 14);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(220, 90, 90, 20);

        txtApellido.setNextFocusableComponent(txtDireccion);
        getContentPane().add(txtApellido);
        txtApellido.setBounds(220, 120, 90, 20);

        txtDireccion.setNextFocusableComponent(cmbSexo);
        getContentPane().add(txtDireccion);
        txtDireccion.setBounds(220, 150, 90, 20);

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino", " " }));
        cmbSexo.setNextFocusableComponent(jButton2);
        getContentPane().add(cmbSexo);
        cmbSexo.setBounds(180, 190, 100, 30);

        jButton2.setText("Imagen");
        jButton2.setNextFocusableComponent(jButton1);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 250, 90, 30);

        jButton1.setText("Guardar");
        jButton1.setNextFocusableComponent(jButton3);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 250, 90, 30);

        jButton3.setText("Ver");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(360, 120, 80, 30);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-500)/2, (screenSize.height-400)/2, 500, 400);
    }// </editor-fold>//GEN-END:initComponents

private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
    JFileChooser elegir=new JFileChooser();
    elegir.setDialogTitle("Elige una imagen");
    elegir.setFileSelectionMode(JFileChooser.FILES_ONLY);
    int var=elegir.showOpenDialog(this);
    if(var==0){
        u=elegir.getSelectedFile().getAbsolutePath();
    }
}//GEN-LAST:event_jButton2MouseClicked

private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    if(cant<5){
        String n=this.txtNombre.getText();
        String a=this.txtApellido.getText();
        String d=this.txtDireccion.getText();
        char s=(this.cmbSexo.getSelectedIndex()==0?'M':'F');
        this.usuarios[cant++]=new Usuario(n,a,d,u,s);
        
    }
}//GEN-LAST:event_jButton1MouseClicked

private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
    
    this.ventana=new Lista_User(this.usuarios,cant);
    this.ventana.setVisible(true);
}//GEN-LAST:event_jButton3MouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Informacion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
        this.usuarios=new Usuario[5];
        cant=0;
        u="";
    }
}
