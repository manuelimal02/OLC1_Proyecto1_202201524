package dataforge;

import AnalizadoresLexicoSintactico.Lexico;
import AnalizadoresLexicoSintactico.Parser;

import Reportes.ReporteHTML;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import Instrucciones.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author manuel
 */

public class Menu_Principal extends javax.swing.JFrame {
    
    
    public Menu_Principal() {
        initComponents();
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int xPos = (screenSize.width - getWidth()) / 2;
        int yPos = (screenSize.height - getHeight()) / 2;

        setLocation(xPos, yPos);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem7.setText("jMenuItem7");

        jMenu3.setText("jMenu3");

        jMenu6.setText("jMenu6");

        jMenu7.setText("jMenu7");

        jMenuItem5.setText("jMenuItem5");

        jMenu2.setText("jMenu2");

        jMenuItem6.setText("jMenuItem6");

        jMenuItem8.setText("jMenuItem8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setForeground(new java.awt.Color(204, 255, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel1.setText("Consola");

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N

        jButton1.setText("jButton1");

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N

        jMenu1.setText("ARCHIVO");
        jMenu1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        jMenuItem2.setText("Nuevo Archivo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        jMenuItem3.setText("Abrir Archivo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        jMenuItem4.setText("Guardar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        jMenuItem9.setText("Eliminar Pestaña");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("EJECUTAR");
        jMenu4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setText("REPORTE");
        jMenu5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N

        jMenuItem11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        jMenuItem11.setText("Tabla De Tokens");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuItem12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        jMenuItem12.setText("Tabla de Símbolos");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuItem13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        jMenuItem13.setText("Tabla De Errores ");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 1293, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTabbedPane2))
                            .addComponent(jTabbedPane1))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Nuevo Archivo");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos DF (*.df)", "df"));

        int seleccion = fileChooser.showSaveDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            if (!archivo.getName().toLowerCase().endsWith(".df")) {
                archivo = new File(archivo.getAbsolutePath() + ".df");
            }
            try {
                if (archivo.createNewFile()) {
                    try (FileWriter writer = new FileWriter(archivo)) {
                        writer.write("");
                    }
                    JTextArea textArea = new JTextArea();
                    textArea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
                    JScrollPane scrollPane = new JScrollPane(textArea);
                    jTabbedPane1.addTab(archivo.getName(), scrollPane);
                    JOptionPane.showMessageDialog(this, "Archivo Y Pestaña Creada Correctamente", "Nuevo Archivo", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e, "Error Nuevo Archivo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Abrir Archivo");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos DF (*.df)", "df"));

        int seleccion = fileChooser.showOpenDialog(this);

        if (seleccion  == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();

            try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                StringBuilder contenido = new StringBuilder();
                String linea;
                while ((linea = reader.readLine()) != null) {
                    contenido.append(linea).append("\n");
                }
                JTextArea textArea = new JTextArea(contenido.toString());
                textArea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
                JScrollPane scrollPane = new JScrollPane(textArea);
                jTabbedPane1.addTab(archivo.getName(), scrollPane);
                JOptionPane.showMessageDialog(this, "Archivo Abierto Correctamente", "Nuevo Archivo", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e, "Error Abrir Archivo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos DF (*.df)", "df"));
        int PestanaSeleccionada = jTabbedPane1.getSelectedIndex();
        if (PestanaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "No Hay Pestañas Abiertas.", "Guardar", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int returnValue = fileChooser.showSaveDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            JTextArea textArea = (JTextArea) ((JScrollPane) jTabbedPane1.getComponentAt(PestanaSeleccionada)).getViewport().getView();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
                writer.write(textArea.getText());
                JOptionPane.showMessageDialog(null, "Archivo Guardado Correctamente", "Guardar", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e, "Error Guardar", JOptionPane.ERROR_MESSAGE);
            }
        }  
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        int selectedIndex = jTabbedPane1.getSelectedIndex();
        if (selectedIndex != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "¿Estás Seguro De Que Desea Eliminar La Pestaña? " + jTabbedPane1.getTitleAt(selectedIndex) , "Eliminar Pestaña", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                jTabbedPane1.remove(selectedIndex);
                JOptionPane.showMessageDialog(this, "Pestaña Eliminada Correctamente", "Eliminar Pestaña", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No Hay Pestañas Abiertas.", "Eliminar Pestaña", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        if (AppState.listaToken.isEmpty()){
            JOptionPane.showMessageDialog(null, "La Lista Tokens Está Vacía", "Reporte Tokens", JOptionPane.WARNING_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, "Reporte Creado Correctamente", "Reporte Tokens", JOptionPane.INFORMATION_MESSAGE);
        ReporteHTML.Generar_Reporte_Tokens(AppState.listaToken, "Reporte_Tokens_202201524.html");
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        if (AppState.tablaSimbolo.isEmpty()){
            JOptionPane.showMessageDialog(null, "La Tabla De Simbolos Está Vacía", "Reporte Tabla De Simbolos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, "Reporte Creado Correctamente", "Reporte Tabla De Simbolos", JOptionPane.INFORMATION_MESSAGE);
        ReporteHTML.Generar_Tabla_Simbolo(AppState.tablaSimbolo, "Reporte_Tabla_Simbolos_202201524.html");
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        JOptionPane.showMessageDialog(null, "Reporte Creado Correctamente", "Reporte Errores Léxicos", JOptionPane.INFORMATION_MESSAGE);
        ReporteHTML.Generar_Reporte_ErrorLexico(AppState.listaErrorLexico, "Reporte_Errores_Léxicos_202201524.html");
        ReporteHTML.Generar_Reporte_ErrorSintactico(AppState.listaErrorSintactico, "Reporte_Errores_Sintáctico_202201524.html");
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        int PestanaSeleccionada = jTabbedPane1.getSelectedIndex();
        if (PestanaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "No Hay Pestañas Abiertas.", "Ejecutar Análisis", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            AppState.listaToken.clear();
            AppState.listaErrorLexico.clear();
            AppState.listaErrorSintactico.clear();
            AppState.tablaSimbolo.clear();
            jTextArea1.setText("");
            jTabbedPane2.removeAll();
            int selectedIndex =jTabbedPane1.getSelectedIndex();
            JTextArea textArea = (JTextArea) ((JScrollPane) jTabbedPane1.getComponentAt(selectedIndex)).getViewport().getView();
            String cadena_entrada = textArea.getText();
            Lexico lexico = new Lexico(new BufferedReader(new StringReader(cadena_entrada)));
            Parser sintactico = new Parser(lexico);
            ArbolSintactico Raiz = (ArbolSintactico)sintactico.parse().value;
            Raiz.EjecutarInterprete(Raiz, jTextArea1,AppState.tablaSimbolo, jTabbedPane2);
            System.out.println("----------------------------------------------"); 
            AppState.listaToken.addAll(lexico.tokens);
            AppState.listaErrorLexico.addAll(lexico.lexicalErrors);
            AppState.listaErrorSintactico.addAll(sintactico.syntaxErrors);
            for (SimboloNodo Simbolo : AppState.tablaSimbolo) {
                System.out.println("Nombre: " + Simbolo.getNombre() +" -- Tipo: "+ Simbolo.getTipo()+" -- Valor: "+Simbolo.getValor()+" -- Rol: "+Simbolo.getRol());
            } 
            System.out.println("----------------------------------------------");
            for (Token token : AppState.listaToken) {
                System.out.println("Lexema: " + token.getLexema() +" -- Token: "+ token.getTipo());
            }
            System.out.println("----------------------------------------------");
            for (ErrorSintactico error : AppState.listaErrorSintactico) {
                System.out.println("Tipo: " + error.getTipo() +" -- Token: "+ error.getToken()+" -- Linea: "+ error.getLinea()+" -- Columna: "+ error.getColumna());
            }
            JOptionPane.showMessageDialog(null, "Análisis De Archivo Realizado Correctamente ", "Ejecutar Análisis", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e, "Ejecutar Análisis", JOptionPane.ERROR_MESSAGE);
        }      
    }//GEN-LAST:event_jMenu4MouseClicked

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu_Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
