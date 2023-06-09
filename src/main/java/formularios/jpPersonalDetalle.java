/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package formularios;

import controladorDAO.PersonalDaoImp;
import entidades.Alumno;
import entidades.Personal;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author juudi
 */
public class jpPersonalDetalle extends javax.swing.JPanel {

    public int id;
    public frmPersonal frmPer;
    
    /**
     * Creates new form jpPersonalDetalle
     */
    public jpPersonalDetalle() {
        initComponents();
    }

     public void CargaDetalle(int id){
        this.id=id;
        lblId.setText(""+id);
        setCampos();
        
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAp1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAp2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDir = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPobla = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtProvincia = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        btnRestablecer = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("PERSONAL");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, 42));

        jLabel2.setText("DNI");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 70, 20));
        add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 90, 30));

        jLabel3.setText("Nombre");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 70, 20));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 79, 30));

        jLabel4.setText("Apellido1");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, 20));
        add(txtAp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 70, 30));

        jLabel5.setText("Apellido2");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, 20));
        add(txtAp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 70, 30));

        jLabel6.setText("Tipo");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, 20));
        add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 100, 30));

        jLabel7.setText("Teléfono");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, 20));
        add(txtTelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 90, 30));

        jLabel8.setText("Email");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 60, 20));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 110, 30));

        jLabel9.setText("Direccion");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, 20));
        add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 120, 30));

        jLabel10.setText("Cp");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, 20));
        add(txtCp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 70, 30));

        jLabel11.setText("Poblacion");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, 20));
        add(txtPobla, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 70, 30));

        jLabel12.setText("Provincia");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, 20));
        add(txtProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 70, 30));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setForeground(new java.awt.Color(153, 255, 204));
        jPanel1.add(lblId);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 620, 270));

        btnRestablecer.setText("Restablecer datos");
        btnRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestablecerActionPerformed(evt);
            }
        });
        add(btnRestablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

     private void setCampos() {
    
        PersonalDaoImp controladorper = PersonalDaoImp.getInstance();
        try{
            Personal per=controladorper.getById(this.id);
            
            txtDni.setText(""+per.getDni());
            txtNombre.setText(""+per.getNombre());
            txtAp1.setText(""+per.getApellido1());
            txtAp2.setText(""+per.getApellido2());
            txtTelf.setText(""+per.getTelefono());
            txtEmail.setText(""+per.getEmail());
            txtDir.setText(""+per.getDireccion());
            txtCp.setText(""+per.getCp());
            txtPobla.setText(""+per.getPoblacion());
            txtProvincia.setText(""+per.getProvincia());
            txtTipo.setText(""+per.getTipo());
        }catch(Exception e){
                System.out.println("Erro cargando personal: "+e.getMessage());
        }
    }
    
     
     private Personal getCampos(){
         try {
            Personal per=new Personal();
            
            per.setId(id);
            per.setDni(""+txtDni.getText());
            per.setNombre(""+txtNombre.getText());
            per.setApellido1(""+txtAp1.getText());
            per.setApellido2(""+txtAp2.getText());
            per.setTelefono(""+txtTelf.getText());
            per.setEmail(""+txtEmail.getText());
            per.setDireccion(""+txtDir.getText());
            per.setCp(""+txtCp.getText());
            per.setPoblacion(""+txtPobla.getText());
            per.setTipo(Integer.parseInt(txtTipo.getText()));
            
            return per;
            
         } catch (Exception e) {
             return null;
         }
         
    }
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        PersonalDaoImp per=PersonalDaoImp.getInstance();

        if ((per.Existe(txtDni.getText()))==0) {

            try{
                per.add(getCampos());
                JOptionPane.showMessageDialog(this, "Personal añadido correctamente");
                frmPer.cargaTabla();

            }catch(Exception e){
                System.out.println(txtDni.getText());
                System.out.println("Error añadir:"+e.getMessage());
            }
        }else{
            try{
                per.update(getCampos());
                JOptionPane.showMessageDialog(this, "Personal actualizado correctamente");
                frmPer.cargaTabla();

            }catch(Exception e){
                System.out.println("Error update:"+e.getMessage());
            }
        }

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerActionPerformed
        try{

            txtDni.setText("");
            txtNombre.setText("");
            txtAp1.setText("");
            txtAp2.setText("");
            txtTipo.setText("");
            txtTelf.setText("");
            txtEmail.setText("");
            txtDir.setText("");
            txtCp.setText("");
            txtPobla.setText("");
            txtProvincia.setText("");
            txtTipo.setText("");

        }catch(Exception e){
            System.out.println("Erro cargando alumno: "+e.getMessage());
        }
    }//GEN-LAST:event_btnRestablecerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnRestablecer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblId;
    private javax.swing.JTextField txtAp1;
    private javax.swing.JTextField txtAp2;
    private javax.swing.JTextField txtCp;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPobla;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtTelf;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
