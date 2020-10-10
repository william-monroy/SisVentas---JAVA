package Vista;

import Conexion.connSQL;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import com.google.gson.*;
import com.google.gson.reflect.*;

public class Login extends javax.swing.JFrame {

    connSQL cc = new connSQL();
    Connection con = cc.conexion();
    Main m = new Main();
    JLabel lbl = new JLabel();
    JLabel lblClima = new JLabel();
    
    public static String Permiso;
    
    public Login() {
        initComponents();
        m.setExtendedState(MAXIMIZED_BOTH);
        m.setTitle("Sistema de Ventas");
        m.setVisible(true);
        m.setEnabled(false);
        MostrarOP(false);
        /*
        JPanel scroll = new JPanel();
        scroll.setSize(m.escritorio.getWidth(), 100);
        scroll.setBackground(Color.GRAY);
        m.escritorio.setLayout(new BorderLayout());
        m.escritorio.add(scroll,BorderLayout.SOUTH);*/
        /*JPanel lblPermiso = new JPanel();
        lblPermiso.setBackground(Color.BLACK);
        lblPermiso.setSize(m.escritorio.getWidth()/2, 50);
        scroll.setLayout(new FlowLayout(FlowLayout.LEFT));
        scroll.add(lblPermiso);
        lblPermiso.setVisible(false);*/
        /*
        lbl.setText(Permiso);
        lbl.setForeground(Color.WHITE);
        scroll.add(lbl, BorderLayout.WEST);
        
        lblClima.setText(Clima());
        lblClima.setForeground(Color.WHITE);
        scroll.add(lbl, BorderLayout.EAST);*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(22, 44, 61));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(22, 44, 61));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("LOGIN");

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(47, 98, 138));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/blur2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6)
        );

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Usuario:");

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Contraseña:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/login.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (validarAcceso()) {
            m.setEnabled(true);
            this.dispose();
            validarPermiso();
            lbl.setText(Permiso);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void MostrarOP(boolean seleccion) {
        m.MenuUsuarios.setVisible(seleccion);
        m.MenuProductos.setVisible(seleccion);
        m.MenuClientes.setVisible(seleccion);
        m.MenuEmpleados.setVisible(seleccion);
        m.MenuVentas.setVisible(seleccion);

    }

    public boolean validarAcceso() {
        boolean respuesta = false;
        int resultado = 0;

        try {
            String usuario = txtUsuario.getText();
            String pass = String.valueOf(txtPass.getPassword());

            String sql = "select * from usuarios where usuario='" + usuario + "' and password='" + pass + "' ";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                resultado = 1;
                if (resultado == 1) {
                    //JOptionPane.showMessageDialog(null, "Bienvenido " + txtUsuario.getText());
                    respuesta = true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error: Datos Incorrectos");
                txtUsuario.setText("");
                txtPass.setText("");
                txtUsuario.requestFocus();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return respuesta;
    }

    public void validarPermiso() {
        int permiso = 0;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String usuario = txtUsuario.getText();
            ps = con.prepareStatement("select (cod_permiso) from usuarios where usuario='" + usuario + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                permiso = rs.getInt(1);
            }
            System.out.println("PERMISO: " + permiso);
            rs.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        boolean seleccion = true;
        switch (permiso) {
            case 0:
                //JOptionPane.showMessageDialog(null, "No tiene permisos asignados");
                break;
            case 1:
                //admin
                JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
                Permiso="Administrador";
                m.setTitle("Sistema de Ventas - Administrador");
                m.MenuUsuarios.setVisible(seleccion);
                m.MenuProductos.setVisible(seleccion);
                m.MenuClientes.setVisible(seleccion);
                m.MenuEmpleados.setVisible(seleccion);
                m.MenuVentas.setVisible(seleccion);
                break;
            case 2:
                //vendedor
                Permiso="Vendedor";
                JOptionPane.showMessageDialog(null, "Bienvenido usuario Vendedor");
                m.setTitle("Sistema de Ventas - Administrador");
                m.MenuProductos.setVisible(seleccion);
                m.MenuClientes.setVisible(seleccion);
                m.MenuVentas.setVisible(seleccion);
                break;
            case 3:
                //caja
                JOptionPane.showMessageDialog(null, "Bienvenido usuario Caja");
                Permiso="Caja";
                m.setTitle("Sistema de Ventas - Administrador");
                m.MenuProductos.setVisible(seleccion);
                m.MenuClientes.setVisible(seleccion);
                m.MenuVentas.setVisible(seleccion);
                break;
            case 4:
                //almacen
                JOptionPane.showMessageDialog(null, "Bienvenido usuario Almacen");
                Permiso="Caja";
                m.setTitle("Sistema de Ventas - Administrador");
                m.MenuProductos.setVisible(seleccion);
                m.MenuClientes.setVisible(seleccion);
                break;
        }
    }
    
    public static String Clima(){
        String respuesta = "--";
        try {
            String ciudad = "Guadalajara";
            String conn = "https://api.openweathermap.org/data/2.5/weather?q=" + ciudad + "&units=metric&APPID=07aed0df244430cb07868241ce59014e&lang=es";
            StringBuilder result = new StringBuilder();
            URL url = new URL(conn);
            URLConnection con = url.openConnection();
            BufferedReader rd = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line;
            while ((line = rd.readLine())!=null) {                
                result.append(line);
            }
            rd.close();
            System.out.println(result);
            
            Gson gson = new Gson();
            
            Map<String,Object> resMap = new HashMap<String,Object>();
            resMap = (Map<String,Object>) gson.fromJson(result.toString(), resMap.getClass());
            
            Map<String,Object> minMap = new HashMap<String,Object>();
            minMap = (Map<String,Object>) gson.fromJson(resMap.get("main").toString(), minMap.getClass());
            
            Map<String,Object> windMap = new HashMap<String,Object>();
            windMap = (Map<String,Object>) gson.fromJson(resMap.get("wind").toString(), windMap.getClass());
            
            
            respuesta=minMap.get("temp")+"° C";
            System.out.println("Temperatura: "+minMap.get("temp"));
            System.out.println("Humedad: "+minMap.get("humidity"));
            System.out.println("Velocidad del Viento: "+windMap.get("speed"));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return respuesta;
    }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
