
package unicordoba.registro.ventana.prueba;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import unicordoba.registro.basededatos.controlador.UtencilioJpaController;
import unicordoba.registro.basededatos.controlador.exceptions.NonexistentEntityException;
//import unicordoba.registro.basededatos.controlador.TablaJpaController;

import unicordoba.registro.basededatos.entity.Utencilio;



//import javax.swing.JOptionPane;


/**
 *
 * @author Dimas De Avila
 */
public class VentanaUtencilio extends javax.swing.JInternalFrame {

   
    public VentanaUtencilio() {
        initComponents();
        bloquear();
        mostrar();
    }
    void limpiar(){
        idTextField.setText("");
        codigoTextField.setText(""); 
        descripcionTextField.setText(""); 
        estadoTextField.setText(""); 
        
    }
    void bloquear(){
        
        modificarButton.setEnabled(false);
        idLabel.setEnabled(false);
        idTextField.setEnabled(false);
    
    }
    void desbloquear(){
       
        modificarButton.setEnabled(true);
        idLabel.setEnabled(true);
        idTextField.setEnabled(true);
    
    }
    void bloquear2(){
        
        guardarButton.setEnabled(false);
        idLabel.setEnabled(false);
        idTextField.setEnabled(false);
    
    }
    
    
    void mostrar(){
        String[] titulos = {"id","codigo", "descripcion",  "estado"};
       String[] registros = new String[4];

       DefaultTableModel model = new DefaultTableModel(null, titulos);
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("R_CPU");
        UtencilioJpaController uencilioJpaController = new UtencilioJpaController(factory);
        java.util.List<Utencilio> list = uencilioJpaController.findUtencilioEntities();
        for (Utencilio utencilio : list) {
            //JOptionPane.showMessageDialog(rootPane, utencilio.getId() + ", " + utencilio.getDescripcion());
                registros[0] = utencilio.getId().toString();
                registros[1] = utencilio.getCodigo();
                registros[2] = utencilio.getDescripcion(); 
                registros[3] = utencilio.getEstado(); 
                

                model.addRow(registros);               
        }
        tblEstudiantes.setModel(model);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        modificarMenuItem = new javax.swing.JMenuItem();
        eliminarMenuItem = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        nuevoButton = new javax.swing.JButton();
        guardarButton = new javax.swing.JButton();
        modificarButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        buscarButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstudiantes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        estadoTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        descripcionTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();

        modificarMenuItem.setText("Modificar");
        modificarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarMenuItemActionPerformed(evt);
            }
        });
        jPopupMenu2.add(modificarMenuItem);

        eliminarMenuItem.setText("Eliminar");
        eliminarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMenuItemActionPerformed(evt);
            }
        });
        jPopupMenu2.add(eliminarMenuItem);

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Utencilio.");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        nuevoButton.setText("Nuevo");
        nuevoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoButtonActionPerformed(evt);
            }
        });

        guardarButton.setText("Guardar");
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });

        modificarButton.setText("Modificar");
        modificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarButtonActionPerformed(evt);
            }
        });

        jButton5.setText("Salir");

        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nuevoButton)
                .addGap(44, 44, 44)
                .addComponent(guardarButton)
                .addGap(51, 51, 51)
                .addComponent(modificarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscarButton)
                .addGap(49, 49, 49)
                .addComponent(jButton5)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarButton)
                    .addComponent(nuevoButton)
                    .addComponent(jButton5)
                    .addComponent(modificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarButton))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        tblEstudiantes.setComponentPopupMenu(jPopupMenu2);
        jScrollPane2.setViewportView(tblEstudiantes);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Cliente"));

        jLabel4.setText("Estado");

        jLabel5.setText("Descripcion");

        jLabel6.setText("Codigo");

        idLabel.setText("Id");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(idLabel)
                        .addGap(48, 48, 48)
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(25, 25, 25)
                        .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estadoTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(descripcionTextField))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idLabel)
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(descripcionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Estudiante");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoButtonActionPerformed
       limpiar();

    }//GEN-LAST:event_nuevoButtonActionPerformed

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        if (!"".equals(estadoTextField.getText()) && !"".equals(descripcionTextField.getText())&& !"".equals(codigoTextField.getText())) {
           
        
            EntityManagerFactory objFactory = Persistence.createEntityManagerFactory("R_CPU");
            Utencilio ut = new Utencilio();
            UtencilioJpaController jpa = new UtencilioJpaController(objFactory);

            ut.setEstado(estadoTextField.getText());
            ut.setDescripcion(descripcionTextField.getText());
            ut.setCodigo(codigoTextField.getText());
            jpa.create(ut);

            mostrar();  
        }
        else{
            JOptionPane.showMessageDialog(null, "Registro Incompleto"); 
        }
    }//GEN-LAST:event_guardarButtonActionPerformed

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed
        int fila=tblEstudiantes.getSelectedRow();                
        idTextField.setText(tblEstudiantes.getValueAt(fila, 0).toString());
        try {
            EntityManagerFactory objFactory = Persistence.createEntityManagerFactory("R_CPU");
            UtencilioJpaController jpa = new UtencilioJpaController(objFactory);
            Utencilio ut = new Utencilio();
            ut.setId(Integer.valueOf(tblEstudiantes.getValueAt(fila, 0).toString()));
            ut.setEstado(estadoTextField.getText());
            ut.setDescripcion(descripcionTextField.getText());
            ut.setCodigo(codigoTextField.getText());
            
            jpa.edit(ut);
            mostrar();
            limpiar();
        } catch (Exception ex) {
            Logger.getLogger(VentanaUtencilio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_modificarButtonActionPerformed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        Integer id = Integer.valueOf(JOptionPane.showInputDialog("Ingrese codigo del Clienete"));
        //buscarCliente(id);
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void modificarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarMenuItemActionPerformed
        bloquear2();
        int fila=tblEstudiantes.getSelectedRow();
        if (fila>=0) {
            idTextField.setText(tblEstudiantes.getValueAt(fila, 0).toString());
            codigoTextField.setText(tblEstudiantes.getValueAt(fila, 1).toString());
            descripcionTextField.setText(tblEstudiantes.getValueAt(fila, 2).toString());
            estadoTextField.setText(tblEstudiantes.getValueAt(fila, 3).toString());
        }
        else{
            JOptionPane.showMessageDialog(null,"no selecciono ninguna fila");
        }
        desbloquear();
        bloquear2();
    }//GEN-LAST:event_modificarMenuItemActionPerformed

    private void eliminarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMenuItemActionPerformed
        // TODO add your handling code here:   eliminar registro
        int fila=tblEstudiantes.getSelectedRow();
                
        idTextField.setText(tblEstudiantes.getValueAt(fila, 0).toString());
        try {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("R_CPU");
            UtencilioJpaController utencilioJpaController = new UtencilioJpaController(factory);
            utencilioJpaController.destroy(Integer.valueOf(tblEstudiantes.getValueAt(fila, 0).toString()));
        } catch (NonexistentEntityException ex) {
            JOptionPane.showMessageDialog(rootPane,ex.toString());
        }
        JOptionPane.showMessageDialog(null,"Se elimino correctamente");
        mostrar();
    }//GEN-LAST:event_eliminarMenuItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JTextField descripcionTextField;
    private javax.swing.JMenuItem eliminarMenuItem;
    private javax.swing.JTextField estadoTextField;
    private javax.swing.JButton guardarButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modificarButton;
    private javax.swing.JMenuItem modificarMenuItem;
    private javax.swing.JButton nuevoButton;
    private javax.swing.JTable tblEstudiantes;
    // End of variables declaration//GEN-END:variables

 

    
}
