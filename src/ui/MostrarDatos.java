
package ui;

import dao.DaoAlumnos;
import dao.DaoPersona;
import dao.DaoProfesor;
import escuela.PersonaDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MostrarDatos extends javax.swing.JFrame {

    public MostrarDatos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void borrarTabla(DefaultTableModel mo){
        int n = mo.getRowCount();
        for(int f = 0; f < n; f++)
            mo.removeRow(0);
    }
    public void cargarTabla(List<PersonaDao> busqueda, DefaultTableModel modelo){
        for(int f = 0; f < busqueda.size(); f++){
            modelo.addRow(new Object[]{busqueda.get(f).getNombre(), busqueda.get(f).getApellido(),
                busqueda.get(f).getDni(), busqueda.get(f).getDireccion(),
                busqueda.get(f).getLocalidad(), busqueda.get(f).getLugar_nac(), 
                busqueda.get(f).getFecha_nac(), busqueda.get(f).getSexo()});
        }
    }
    
    DaoPersona a = new DaoAlumnos();
    DaoPersona p = new DaoProfesor();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tfBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbDatos = new javax.swing.JComboBox<>();
        jbBorrar = new javax.swing.JButton();
        tfBorrar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcbBuscar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos");
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "DNI", "Dirección", "Localidad", "Lugar de Nac.", "Fecha de Nac.", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        tfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBuscarKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Buscar por");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Mostar");

        jcbDatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alumnos", "Profesores", "Cursos" }));
        jcbDatos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbDatosItemStateChanged(evt);
            }
        });

        jbBorrar.setText("Aceptar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        tfBorrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBorrarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBorrarKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Borrar por DNI");

        jcbBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido", "DNI", "Direccion ", "Localidad", "Lugar de nacimiento", "Fecha de nacimiento" }));
        jcbBuscar.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbBuscar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbBorrar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(126, 126, 126)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBorrar)
                    .addComponent(tfBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarKeyTyped
        
        char num = evt.getKeyChar();
        
        if(jcbBuscar.getSelectedIndex() == 2){
            if(num < '0' || num > '9')
            {
              evt.consume();
            }
        }
        
    }//GEN-LAST:event_tfBuscarKeyTyped

    private void tfBorrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBorrarKeyPressed
        
        int num = evt.getKeyCode();
        
        if(num == 10)
        {
            jbBorrarActionPerformed(null);
        }
        
    }//GEN-LAST:event_tfBorrarKeyPressed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed

        String box = (String)jcbDatos.getSelectedItem();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        
        String tf = ""+tfBorrar.getText();
        int tbox = 0;
        try{
            tbox = Integer.parseInt(tf);
        }catch(Exception e){}
        
        boolean exis = false;
        
        if(!tfBorrar.getText().isEmpty()){
            //Condicion para Alumnos
            if(box.equals("Alumnos")){
                for(int f = 0; f < a.getPersona().size(); f++){
                    if(tbox == a.getPersona().get(f).getDni()){

                        int op = JOptionPane.showConfirmDialog(this,
                            "¿Seguro que deseas borrar a "+ a.getPersona().get(f).getNombre()+" "+a.getPersona().get(f).getApellido(),
                            "AAAAAAA", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);

                        if(JOptionPane.YES_OPTION == op){
                            //modelo.removeRow(f);
                            a.borrarDatos(tbox, f);
                            tfBorrar.setText("");
                            
                            exis = true;
                            break;
                        }else{
                            exis = true;
                            break;
                        }

                    }
                }

                if(exis == false){
                    JOptionPane.showMessageDialog(null, "NO EXISTE");
                }

            }

            //Condicion para Profesores
            if(box.equals("Profesores")){
                for(int f = 0; f < p.getPersona().size(); f++){
                    if(tbox == p.getPersona().get(f).getDni()){

                        modelo.removeRow(f);
                        p.borrarDatos(tbox, f);
                        exis = true;
                        tfBorrar.setText("");
                        break;
                    }
                }
                if(exis == false){
                    JOptionPane.showMessageDialog(null, "NO EXISTE");
                }
            }
            }else{
                JOptionPane.showMessageDialog(null, "Campo Vacio");
            }
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void tfBorrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBorrarKeyTyped
        
        char num = evt.getKeyChar();
        
        if(num < '0' || num > '9')
        {
             evt.consume();
        }
        
        if(tfBorrar.getText().length() > 7)
        {
            evt.consume();
        }
        
    }//GEN-LAST:event_tfBorrarKeyTyped

    private void jcbDatosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbDatosItemStateChanged
        
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        if(jcbDatos.getSelectedIndex() == 0){
            borrarTabla(tabla);
            cargarTabla(a.getPersona(), tabla);
        }
        if(jcbDatos.getSelectedIndex() == 1){
            borrarTabla(tabla);
            cargarTabla(p.getPersona(), tabla);
        }
    }//GEN-LAST:event_jcbDatosItemStateChanged

    private void tfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarKeyReleased
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        
        String box = "";
        switch(jcbBuscar.getSelectedIndex()){
            case 0: box = "nombre"; break;
            case 1: box = "apellido"; break;
            case 2: box = "dni"; break;
            case 3: box = "direccion"; break;
            case 4: box = "localidad"; break;
            case 5: box = "lugar_nac"; break;
            case 6: box = "fecha_nac"; break;
        }
        
        List<PersonaDao> busqueda = new ArrayList();
        
        switch(jcbDatos.getSelectedIndex()){
            case 0: busqueda = a.buscarDatos(box, tfBuscar.getText()); break;
            case 1: busqueda = p.buscarDatos(box, tfBuscar.getText()); break;
        }
        
        borrarTabla(modelo);
        cargarTabla(busqueda, modelo);

    }//GEN-LAST:event_tfBuscarKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        int f = jTable1.getSelectedRow();
        String datos;
        
        switch(jcbDatos.getSelectedIndex()){
            case 0: 
                datos = a.getPersona().get(f).getNombre() + " " +
                        a.getPersona().get(f).getApellido() + " " +
                        a.getPersona().get(f).getDni(); break;
            case 1:
                datos = p.getPersona().get(f).getNombre() + " " +
                        p.getPersona().get(f).getApellido() + " " +
                        p.getPersona().get(f).getDni();
        }
        
        int op = JOptionPane.showOptionDialog(this, "Que desea hacer con","Opciones", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Modificar", "Borrar"}, null);
        
        //modificar
        if(op == 0){
            
        }
        //borrar
        if(op == 1){
            int opc = JOptionPane.showConfirmDialog(this,
                "¿Seguro que deseas borrar a "+ a.getPersona().get(f).getNombre()+" "+a.getPersona().get(f).getApellido(),
                "Borrar", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);

            if(JOptionPane.YES_OPTION == opc){
                modelo.removeRow(f);
                a.borrarDatos(a.getPersona().get(f).getDni(), f);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MostrarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JComboBox<String> jcbBuscar;
    private javax.swing.JComboBox<String> jcbDatos;
    private javax.swing.JTextField tfBorrar;
    private javax.swing.JTextField tfBuscar;
    // End of variables declaration//GEN-END:variables
}
