/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package formularios;

import controladorDAO.CursoAcademicoDaoImp;
import entidades.CursoAcademico;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author juudi
 */
public class frmCursoAcademico extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmCursoAcademico
     */
    public frmCursoAcademico() {
        initComponents();
          txtId.setVisible(false);
        //Establecer diseño de la tabla
        configTabla();
        cargaTabla();
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

        jpcampos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtInicio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCursos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpcampos.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Inicio");

        jLabel2.setText("Fin");

        jLabel3.setText("Descripcion");

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

        javax.swing.GroupLayout jpcamposLayout = new javax.swing.GroupLayout(jpcampos);
        jpcampos.setLayout(jpcamposLayout);
        jpcamposLayout.setHorizontalGroup(
            jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpcamposLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpcamposLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnAgregar)
                        .addGap(37, 37, 37)
                        .addComponent(btnActualizar))
                    .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jpcamposLayout.createSequentialGroup()
                                .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jpcamposLayout.setVerticalGroup(
            jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpcamposLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jpcampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 290, 220));

        jtCursos.setBackground(new java.awt.Color(204, 204, 255));
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
        jLabel4.setText("CURSOS ACADEMICOS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 510, 42));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 6, -1, -1));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configTabla(){
        String col[]={"ID","INICIO","FIN","DESCRIPCION"};
        
        DefaultTableModel modelo=new DefaultTableModel(col,0);
        jtCursos.setModel(modelo);
        jtCursos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
    }
    
    private void cargaTabla(){
        DefaultTableModel modelo=(DefaultTableModel)jtCursos.getModel();
        
        CursoAcademicoDaoImp cursoaca=CursoAcademicoDaoImp.getInstance();
        String[] fila=new String[4];
        
        modelo.setNumRows(0);
        try{
            List<CursoAcademico> lst=cursoaca.getAll();
            
            for( CursoAcademico curso :lst){
                fila[0]=""+curso.getId();
                fila[1]=""+curso.getYearinicio();
                fila[2]=""+curso.getYearfin();
                fila[3]=""+curso.getDescripcion();
                modelo.addRow(fila);
            }
            //selecciono la primera fila
           jtCursos.setRowSelectionInterval(0,0); 
           
        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        }
    }
    
    private CursoAcademico getCampos(){
        CursoAcademico c=new CursoAcademico();
        c.setYearinicio(Integer.parseInt(txtInicio.getText()));
        c.setYearfin(Integer.parseInt(txtFin.getText()));
        c.setDescripcion(txtDescripcion.getText());
        c.setId(Integer.parseInt(txtId.getText()));
        return c;        
    }
    
     private void setCampos(){
    
          //jtCursos.getValueAt(jtCursos.getSelectedRow(), 0)
          txtInicio.setText(jtCursos.getValueAt(jtCursos.getSelectedRow(), 1).toString());
          txtFin.setText(jtCursos.getValueAt(jtCursos.getSelectedRow(), 2).toString());
          txtDescripcion.setText(jtCursos.getValueAt(jtCursos.getSelectedRow(), 3).toString());
          txtId.setText(jtCursos.getValueAt(jtCursos.getSelectedRow(), 0).toString());
          
    }
     
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        //agregar un cursoacademico nuevo
        CursoAcademicoDaoImp cursoaca=CursoAcademicoDaoImp.getInstance();

        try{
            cursoaca.add(getCampos());
            JOptionPane.showMessageDialog(this, "Curso agregado correctamente");
            cargaTabla();

        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        CursoAcademicoDaoImp cursoaca=CursoAcademicoDaoImp.getInstance();

        try{
            cursoaca.update(getCampos());
            JOptionPane.showMessageDialog(this, "Curso actualizado correctamente");
            cargaTabla();
            int fila=jtCursos.getSelectedRow();
            jtCursos.setRowSelectionInterval(fila,fila);

        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

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

    private void jtCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCursosMouseClicked
        // TODO add your handling code here:
        setCampos();
    }//GEN-LAST:event_jtCursosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpcampos;
    private javax.swing.JTable jtCursos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFin;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtInicio;
    // End of variables declaration//GEN-END:variables
}