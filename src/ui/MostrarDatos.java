
package ui;

import dao.DaoAlumnos;
import dao.DaoProfesor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MostrarDatos extends javax.swing.JFrame {

    public MostrarDatos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    DaoAlumnos a = new DaoAlumnos();
    DaoProfesor p = new DaoProfesor();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        tfBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbDatos = new javax.swing.JComboBox<>();
        jbBuscar = new javax.swing.JButton();
        jbMostar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        tfBorrar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBuscarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBuscarKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Buscar por DNI");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Mostar");

        jcbDatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alumnos", "Profesores", "Cursos" }));
        jcbDatos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbDatosItemStateChanged(evt);
            }
        });

        jbBuscar.setText("Aceptar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbMostar.setText("Aceptar");
        jbMostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfBorrar)
                                    .addComponent(tfBuscar)
                                    .addComponent(jcbDatos, 0, 161, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbBuscar)
                                    .addComponent(jbMostar)
                                    .addComponent(jbBorrar))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMostar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBorrar)
                    .addComponent(tfBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        
        for(int f = 0; f < a.getAlumnos().size(); f++)
        {
            modelo.addRow(new Object[]{a.getAlumnos().get(f).getNombre(), a.getAlumnos().get(f).getApellido(),
                a.getAlumnos().get(f).getDni(), a.getAlumnos().get(f).getDireccion(),
                a.getAlumnos().get(f).getLocalidad(), a.getAlumnos().get(f).getLugar_nac(), 
                a.getAlumnos().get(f).getFecha_nac(), a.getAlumnos().get(f).getSexo()});
        }
    }//GEN-LAST:event_formWindowOpened

    private void jbMostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostarActionPerformed
        
        String box = (String)jcbDatos.getSelectedItem();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        
        if(box.equals("Alumnos")){
            
            int num = modelo.getRowCount();
            for(int m = 0; m < num; m++){
                modelo.removeRow(0);
            }
           
            for(int f = 0; f < a.getAlumnos().size(); f++){
                modelo.addRow(new Object[]{a.getAlumnos().get(f).getNombre(), a.getAlumnos().get(f).getApellido(),
                    a.getAlumnos().get(f).getDni(), a.getAlumnos().get(f).getDireccion(),
                    a.getAlumnos().get(f).getLocalidad(), a.getAlumnos().get(f).getLugar_nac(), 
                    a.getAlumnos().get(f).getFecha_nac(), a.getAlumnos().get(f).getSexo()});
            }
        }
        
        if(box.equals("Profesores")){
            
            int num = modelo.getRowCount();
            for(int m = 0; m < num; m++){
                modelo.removeRow(0);
            }
            
            for(int f = 0; f < p.getProfesor().size(); f++){
                modelo.addRow(new Object[]{p.getProfesor().get(f).getNombre(), p.getProfesor().get(f).getApellido(),
                    p.getProfesor().get(f).getDni(), p.getProfesor().get(f).getDireccion(),
                    p.getProfesor().get(f).getLocalidad(), p.getProfesor().get(f).getLugar_nac(), 
                    p.getProfesor().get(f).getFecha_nac(), p.getProfesor().get(f).getSexo()});
            }
        }
        
    }//GEN-LAST:event_jbMostarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        String box = (String)jcbDatos.getSelectedItem();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        
        String tf = ""+tfBuscar.getText();
        int tbox = 0;
        try{
            tbox = Integer.parseInt(tf);
        }catch(Exception e){}
        
        boolean exis = false;
        
        if(!tfBuscar.getText().isEmpty()){
            if(box.equals("Alumnos")){

                for(int f = 0; f < a.getAlumnos().size(); f++){
                    if(tbox == a.getAlumnos().get(f).getDni()){

                        int num = modelo.getRowCount();
                        for(int m = 0; m < num; m++)
                            modelo.removeRow(0);

                        modelo.addRow(new Object[]{a.getAlumnos().get(f).getNombre(), a.getAlumnos().get(f).getApellido(),
                        a.getAlumnos().get(f).getDni(), a.getAlumnos().get(f).getDireccion(),
                        a.getAlumnos().get(f).getLocalidad(), a.getAlumnos().get(f).getLugar_nac(), 
                        a.getAlumnos().get(f).getFecha_nac(), a.getAlumnos().get(f).getSexo()});

                        exis = true;

                    }
                }
                if(exis == false){
                    JOptionPane.showMessageDialog(null, "NO EXISTE");
                }

            }

            if(box.equals("Profesores")){

                for(int f = 0; f < p.getProfesor().size(); f++){
                    if(tbox == p.getProfesor().get(f).getDni()){

                        int num = modelo.getRowCount();
                        for(int m = 0; m < num; m++){
                            modelo.removeRow(0);

                        modelo.addRow(new Object[]{p.getProfesor().get(f).getNombre(), p.getProfesor().get(f).getApellido(),
                        p.getProfesor().get(f).getDni(), p.getProfesor().get(f).getDireccion(),
                        p.getProfesor().get(f).getLocalidad(), p.getProfesor().get(f).getLugar_nac(), 
                        p.getProfesor().get(f).getFecha_nac(), p.getProfesor().get(f).getSexo()});

                        exis = true;
                        }
                    }
                }
                if(exis == false){
                    JOptionPane.showMessageDialog(null, "NO EXISTE");
                }

            }
        }else{
            JOptionPane.showMessageDialog(null, "Campo Vacio");
        }
        
                
        
        
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void tfBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarKeyPressed
        
        char num = evt.getKeyChar();
        
        if(num == 10)
        {
            jbBuscarActionPerformed(null);
        }
    }//GEN-LAST:event_tfBuscarKeyPressed

    private void tfBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarKeyTyped
        
        char num = evt.getKeyChar();
        
        if(num < '0' || num > '9')
        {
          evt.consume();
        }
        
        if(tfBuscar.getText().length() > 7)
        {
            evt.consume();
        }
        
        String box = (String)jcbDatos.getSelectedItem();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        
        //char num = evt.getKeyChar();
        int lon = tfBuscar.getText().length();
        int mod = modelo.getRowCount();
        List<Integer> con = new ArrayList<>();
        
        if(box.equals("Alumnos")){
            for(int f = 0; f < mod; f++){
                String dniDAO = Integer.toString(a.getAlumnos().get(f).getDni());
                if(num != dniDAO.charAt(lon)){
                        //modelo.removeRow(f);
                        con.add(f);
                }
                 
            }
            for(int f = 0; f < con.size(); f++){
                modelo.removeRow(con.get(f));
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
                for(int f = 0; f < a.getAlumnos().size(); f++){
                    if(tbox == a.getAlumnos().get(f).getDni()){

                        int op = JOptionPane.showConfirmDialog(this,
                            "¿Seguro que deseas borrar a "+ a.getAlumnos().get(f).getNombre()+" "+a.getAlumnos().get(f).getApellido(),
                            "AAAAAAA", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);

                        if(JOptionPane.YES_OPTION == op){
                            modelo.removeRow(f);
                            a.borrarA(tbox, f);
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
                for(int f = 0; f < p.getProfesor().size(); f++){
                    if(tbox == p.getProfesor().get(f).getDni()){

                        modelo.removeRow(f);
                        p.borrarP(tbox, f);
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
        
        String opc = "";
        try{
            opc = (String)evt.getItem();
        }catch(Exception e){}
        
        
        if(opc.equals("Alumnos")){
            jbMostarActionPerformed(null);
        }
        if(opc.equals("Profesores")){
            jbMostarActionPerformed(null);
        }
    }//GEN-LAST:event_jcbDatosItemStateChanged

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbMostar;
    private javax.swing.JComboBox<String> jcbDatos;
    private javax.swing.JTextField tfBorrar;
    private javax.swing.JTextField tfBuscar;
    // End of variables declaration//GEN-END:variables
}
