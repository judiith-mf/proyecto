/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package formularios;

import controladorDAO.CursoAcademicoDaoImp;
import controladorDAO.CursoDaoImp;
import entidades.Curso;
import entidades.CursoAcademico;
import java.awt.event.KeyEvent;
import java.util.Enumeration;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author juudi
 */
public class frmCurso extends javax.swing.JInternalFrame {

    private String botonSelect="Curso 22-23";
    /**
     * Creates new form frmCurso
     */
    public frmCurso() {
        initComponents();
        txtId.setVisible(false);
        txtidcur.setVisible(false);  
        
        configTabla();
        cargaTabla();
        setCampos();
        generarRadioButton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpcampos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtObservaciones = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCursos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPRadioButton = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        txtidcur = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpcampos.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualiza");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel3.setText("Observaciones");

        javax.swing.GroupLayout jpcamposLayout = new javax.swing.GroupLayout(jpcampos);
        jpcampos.setLayout(jpcamposLayout);
        jpcamposLayout.setHorizontalGroup(
            jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpcamposLayout.createSequentialGroup()
                .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpcamposLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpcamposLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpcamposLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnAgregar)
                                .addGap(37, 37, 37)
                                .addComponent(btnActualizar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpcamposLayout.createSequentialGroup()
                                .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)))))
                .addContainerGap())
        );
        jpcamposLayout.setVerticalGroup(
            jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpcamposLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jpcampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 290, 210));

        jtCursos.setBackground(new java.awt.Color(255, 204, 255));
        jtCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Inicio", "Fin", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCursosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCursos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 348, 210));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 255));
        jLabel4.setText("CURSOS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 190, 42));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 170, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Buscar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jPRadioButton.setBackground(new java.awt.Color(255, 229, 255));

        btnAceptar.setText("Aceptar");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPRadioButtonLayout = new javax.swing.GroupLayout(jPRadioButton);
        jPRadioButton.setLayout(jPRadioButtonLayout);
        jPRadioButtonLayout.setHorizontalGroup(
            jPRadioButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRadioButtonLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(35, 35, 35))
        );
        jPRadioButtonLayout.setVerticalGroup(
            jPRadioButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRadioButtonLayout.createSequentialGroup()
                .addContainerGap(327, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 160, 370));
        getContentPane().add(txtidcur, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 




    private void generarRadioButton(){
        CursoAcademicoDaoImp controladorcurso = CursoAcademicoDaoImp.getInstance();
        int y=20;
        
        try {
            //ButtonGroup bgCursos=new ButtonGroup();
            List<CursoAcademico> lst=controladorcurso.getAll();
            JRadioButton jr;
            
            for(CursoAcademico c : lst){
                
                jr=new JRadioButton(c.getDescripcion()+"",true);
                jr.setBounds(10, y, 100, 20);
                jr.setText(c.getDescripcion());
                jr.setName(c.getDescripcion()+"");
                
                buttonGroup1.add(jr);
                //jPRadioButton.add(jr, 1);
                jPRadioButton.add(jr);
                
                
                // Imprimir información de depuración
                //System.out.println("Radio button: " + jr.getName() + ", seleccionado: " + jr.isSelected());
                y+=20;
            }
            
            
       // jPRadioButton.setVisible(true);

            
        } catch (Exception e) {
            System.out.println("eror"+e.getMessage());
        
        }
        
    }
    
    private void configTabla(){
        String col[]={"ID","CODIGO","NOMBRE","OBSERVACIONES","IDCURSOACADEMICO"};
        
        DefaultTableModel modelo=new DefaultTableModel(col,0);
        jtCursos.setModel(modelo);
        jtCursos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
    }
    
     private void cargaTabla(){
        DefaultTableModel modelo=(DefaultTableModel)jtCursos.getModel();
        
        CursoDaoImp curs=CursoDaoImp.getInstance();
        String[] fila=new String[5];
        
        modelo.setNumRows(0);
        try{
            java.util.List<Curso> lst=curs.getAll();
            
            for(Curso cursos : lst){
                
                fila[0]=""+cursos.getId();
                fila[1]=""+cursos.getCodigo();
                fila[2]=""+cursos.getNombre();
                fila[3]=""+cursos.getObservaciones();
                fila[4]=""+cursos.getIdcursoacademico();
                modelo.addRow(fila);
            }
            //selecciono la primera fila
           jtCursos.setRowSelectionInterval(0,0); 
           
        }catch(Exception e){
            System.out.println("Error al cargar tabla:"+e.getMessage());
        }
    }
     
     private Curso getCampos(){
        Curso c=new Curso();
        c.setId(Integer.parseInt(txtId.getText()));
        c.setCodigo(txtCodigo.getText());
        c.setNombre(txtNombre.getText());
        c.setObservaciones(txtObservaciones.getText());
        c.setIdcursoacademico(Integer.parseInt(txtidcur.getText()));
        
        return c;        
    }
    
      private void setCampos(){
        txtId.setText(jtCursos.getValueAt(jtCursos.getSelectedRow(), 0).toString());
        txtCodigo.setText(jtCursos.getValueAt(jtCursos.getSelectedRow(), 1).toString());
        txtNombre.setText(jtCursos.getValueAt(jtCursos.getSelectedRow(), 2).toString());
        txtObservaciones.setText(jtCursos.getValueAt(jtCursos.getSelectedRow(), 3).toString());
        txtidcur.setText(jtCursos.getValueAt(jtCursos.getSelectedRow(), 4).toString());
          
    }
     
     
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        //agregar un cursoacademico nuevo
        CursoDaoImp curs=CursoDaoImp.getInstance();

        try{
            curs.add(getCampos());
            JOptionPane.showMessageDialog(this, "Curso agregado correctamente");
            cargaTabla();

        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        CursoDaoImp curs=CursoDaoImp.getInstance();

        try{
            curs.update(getCampos());
            JOptionPane.showMessageDialog(this, "Curso actualizado correctamente");
            cargaTabla();
            int fila=jtCursos.getSelectedRow();
            jtCursos.setRowSelectionInterval(fila,fila);

        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jtCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCursosMouseClicked
        // TODO add your handling code here:
        setCampos();
    }//GEN-LAST:event_jtCursosMouseClicked

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            DefaultTableModel modelo=(DefaultTableModel) jtCursos.getModel();
            TableRowSorter<TableModel> trSorter = new TableRowSorter<TableModel>(modelo);

            jtCursos.setRowSorter(trSorter);

            if (txtBuscar.getText().length()==0) {
                trSorter.setRowFilter(null);
            }else{

                trSorter.setRowFilter(RowFilter.regexFilter(txtBuscar.getText().trim()));
            }

        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
       for (Enumeration<AbstractButton> buttons = buttonGroup1.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                botonSelect=button.getText();
                System.out.println(button.getText());
            }
        }
        cargaTabla();
    }//GEN-LAST:event_btnAceptarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPRadioButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpcampos;
    private javax.swing.JTable jtCursos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtidcur;
    // End of variables declaration//GEN-END:variables
}