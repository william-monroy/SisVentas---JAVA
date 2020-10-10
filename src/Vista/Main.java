
package Vista;

import Vista.Ayuda.AyudaAcerca;
import Vista.Ayuda.AyudaManual;
import Vista.Clientes.ConsultaCliente;
import Vista.Clientes.EdicionCliente;
import Vista.Clientes.NuevoCliente;
import Vista.Empleados.ConsultaEmpleado;
import Vista.Empleados.EdicionEmpleado;
import Vista.Empleados.NuevoEmpleado;
import Vista.Productos.AgregarProducto;
import Vista.Productos.BuscarProducto;
import Vista.Productos.CategoriaProducto;
import Vista.Productos.EditarProducto;
import Vista.Usuarios.ConsultaUsuario;
import Vista.Usuarios.EdicionUsuario;
import Vista.Usuarios.NuevoUsuario;
import Vista.Ventas.ConsultaVenta;
import Vista.Ventas.NuevaVenta;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.imageio.ImageIO;
import java.util.*;

/**
 *
 * @author William
 */
public class Main extends javax.swing.JFrame implements Runnable{

    
    public InputStream fondo1=this.getClass().getResourceAsStream("/Resources/deskblur1.jpg");
    public InputStream fondo2=this.getClass().getResourceAsStream("/Resources/deskblur2.jpg");
    public InputStream fondo3=this.getClass().getResourceAsStream("/Resources/deskblur3.jpg");
    String hora,minutos,segundos,ampm;
    Calendar calendario;
    Thread h1;
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        cargarImagen(escritorio,fondo1);
        h1 = new Thread(this);
        h1.start();
        lblClima.setText("Guadalajara - "+Login.Clima());
    }
    
    public  void cargarImagen(javax.swing.JDesktopPane jDeskp,InputStream fileImagen){   
        try{   
            BufferedImage image = ImageIO.read(fileImagen);        
              jDeskp.setBorder(new Fondo(image)); }
        catch (Exception e){   System.out.println("Imagen no disponible");   }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        scroll = new javax.swing.JPanel();
        lblReloj = new javax.swing.JLabel();
        lblClima = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        MenuUsuarios = new javax.swing.JMenu();
        Usuarios_Nuevo = new javax.swing.JMenuItem();
        Usuarios_Consulta = new javax.swing.JMenuItem();
        Usuarios_Edicion = new javax.swing.JMenuItem();
        MenuProductos = new javax.swing.JMenu();
        Productos_Agregar = new javax.swing.JMenuItem();
        Productos_Buscar = new javax.swing.JMenuItem();
        Productos_Editar = new javax.swing.JMenuItem();
        Productos_Categoria = new javax.swing.JMenuItem();
        MenuClientes = new javax.swing.JMenu();
        Clientes_Nuevo = new javax.swing.JMenuItem();
        Clientes_Consulta = new javax.swing.JMenuItem();
        Clientes_Edicion = new javax.swing.JMenuItem();
        MenuEmpleados = new javax.swing.JMenu();
        Empleados_Nuevo = new javax.swing.JMenuItem();
        Empleados_Consulta = new javax.swing.JMenuItem();
        Empleados_Edicion = new javax.swing.JMenuItem();
        MenuVentas = new javax.swing.JMenu();
        Ventas_Nueva = new javax.swing.JMenuItem();
        Ventas_Consulta = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        Ayuda_Manual = new javax.swing.JMenuItem();
        Ayuda_Acerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        scroll.setBackground(new java.awt.Color(32, 64, 81));
        scroll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(228, 227, 227), 1, true));

        lblReloj.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblReloj.setForeground(new java.awt.Color(204, 204, 204));
        lblReloj.setText("00:00:00 PM");

        lblClima.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblClima.setForeground(new java.awt.Color(204, 204, 204));
        lblClima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/temp.png"))); // NOI18N
        lblClima.setText("Arequipa - ");

        javax.swing.GroupLayout scrollLayout = new javax.swing.GroupLayout(scroll);
        scroll.setLayout(scrollLayout);
        scrollLayout.setHorizontalGroup(
            scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scrollLayout.createSequentialGroup()
                .addComponent(lblClima)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scrollLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(lblReloj)
                .addContainerGap())
        );
        scrollLayout.setVerticalGroup(
            scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scrollLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReloj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClima)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        escritorio.setLayer(scroll, javax.swing.JLayeredPane.DRAG_LAYER);
        escritorio.add(scroll);
        scroll.setBounds(30, 20, 220, 100);

        MenuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/user.png"))); // NOI18N
        MenuUsuarios.setMnemonic('f');
        MenuUsuarios.setText("Usuarios");

        Usuarios_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/add-user.png"))); // NOI18N
        Usuarios_Nuevo.setMnemonic('o');
        Usuarios_Nuevo.setText("Nuevo Usuario");
        Usuarios_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuarios_NuevoActionPerformed(evt);
            }
        });
        MenuUsuarios.add(Usuarios_Nuevo);

        Usuarios_Consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/search-user.png"))); // NOI18N
        Usuarios_Consulta.setMnemonic('s');
        Usuarios_Consulta.setText("Consulta");
        Usuarios_Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuarios_ConsultaActionPerformed(evt);
            }
        });
        MenuUsuarios.add(Usuarios_Consulta);

        Usuarios_Edicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/edit-user.png"))); // NOI18N
        Usuarios_Edicion.setMnemonic('a');
        Usuarios_Edicion.setText("Edición");
        Usuarios_Edicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuarios_EdicionActionPerformed(evt);
            }
        });
        MenuUsuarios.add(Usuarios_Edicion);

        menuBar.add(MenuUsuarios);

        MenuProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/prod.png"))); // NOI18N
        MenuProductos.setMnemonic('e');
        MenuProductos.setText("Productos");

        Productos_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/productos.png"))); // NOI18N
        Productos_Agregar.setMnemonic('t');
        Productos_Agregar.setText("Agregar Productos");
        Productos_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Productos_AgregarActionPerformed(evt);
            }
        });
        MenuProductos.add(Productos_Agregar);

        Productos_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/search.png"))); // NOI18N
        Productos_Buscar.setMnemonic('y');
        Productos_Buscar.setText("Buscar Productos");
        Productos_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Productos_BuscarActionPerformed(evt);
            }
        });
        MenuProductos.add(Productos_Buscar);

        Productos_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/edit1.png"))); // NOI18N
        Productos_Editar.setMnemonic('p');
        Productos_Editar.setText("Editar Productos");
        Productos_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Productos_EditarActionPerformed(evt);
            }
        });
        MenuProductos.add(Productos_Editar);

        Productos_Categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/category.png"))); // NOI18N
        Productos_Categoria.setMnemonic('d');
        Productos_Categoria.setText("Categorias de Productos");
        Productos_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Productos_CategoriaActionPerformed(evt);
            }
        });
        MenuProductos.add(Productos_Categoria);

        menuBar.add(MenuProductos);

        MenuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/cliente.png"))); // NOI18N
        MenuClientes.setMnemonic('h');
        MenuClientes.setText("Clientes");

        Clientes_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/add-client.png"))); // NOI18N
        Clientes_Nuevo.setMnemonic('c');
        Clientes_Nuevo.setText("Nuevo Cliente");
        Clientes_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clientes_NuevoActionPerformed(evt);
            }
        });
        MenuClientes.add(Clientes_Nuevo);

        Clientes_Consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/search-client.png"))); // NOI18N
        Clientes_Consulta.setMnemonic('a');
        Clientes_Consulta.setText("Consulta");
        Clientes_Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clientes_ConsultaActionPerformed(evt);
            }
        });
        MenuClientes.add(Clientes_Consulta);

        Clientes_Edicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/edit-client.png"))); // NOI18N
        Clientes_Edicion.setText("Edición");
        Clientes_Edicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clientes_EdicionActionPerformed(evt);
            }
        });
        MenuClientes.add(Clientes_Edicion);

        menuBar.add(MenuClientes);

        MenuEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/worker.png"))); // NOI18N
        MenuEmpleados.setText("Empleados");

        Empleados_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/add-empleado.png"))); // NOI18N
        Empleados_Nuevo.setText("Nuevo Empleado");
        Empleados_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Empleados_NuevoActionPerformed(evt);
            }
        });
        MenuEmpleados.add(Empleados_Nuevo);

        Empleados_Consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/search-empleado.png"))); // NOI18N
        Empleados_Consulta.setText("Consulta");
        Empleados_Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Empleados_ConsultaActionPerformed(evt);
            }
        });
        MenuEmpleados.add(Empleados_Consulta);

        Empleados_Edicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/edit-empleado.png"))); // NOI18N
        Empleados_Edicion.setText("Edición");
        Empleados_Edicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Empleados_EdicionActionPerformed(evt);
            }
        });
        MenuEmpleados.add(Empleados_Edicion);

        menuBar.add(MenuEmpleados);

        MenuVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ventas.png"))); // NOI18N
        MenuVentas.setText("Ventas");

        Ventas_Nueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/nueva-venta.png"))); // NOI18N
        Ventas_Nueva.setText("Nueva Venta");
        Ventas_Nueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ventas_NuevaActionPerformed(evt);
            }
        });
        MenuVentas.add(Ventas_Nueva);

        Ventas_Consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/consulta.png"))); // NOI18N
        Ventas_Consulta.setText("Consulta");
        Ventas_Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ventas_ConsultaActionPerformed(evt);
            }
        });
        MenuVentas.add(Ventas_Consulta);

        menuBar.add(MenuVentas);

        MenuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ayuda.png"))); // NOI18N
        MenuAyuda.setText("Ayuda");

        Ayuda_Manual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/manual.png"))); // NOI18N
        Ayuda_Manual.setText("Manual de Usuario");
        Ayuda_Manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ayuda_ManualActionPerformed(evt);
            }
        });
        MenuAyuda.add(Ayuda_Manual);

        Ayuda_Acerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Info.png"))); // NOI18N
        Ayuda_Acerca.setText("Acerca de");
        Ayuda_Acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ayuda_AcercaActionPerformed(evt);
            }
        });
        MenuAyuda.add(Ayuda_Acerca);

        menuBar.add(MenuAyuda);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Usuarios_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuarios_NuevoActionPerformed
        NuevoUsuario v = new NuevoUsuario();
        escritorio.add(v);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = v.getSize();
        v.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        v.toFront();
        v.show(); 
        v.setEnabled(true);
    }//GEN-LAST:event_Usuarios_NuevoActionPerformed

    private void Usuarios_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuarios_ConsultaActionPerformed
        ConsultaUsuario cU = new ConsultaUsuario();
        escritorio.add(cU);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = cU.getSize();
        cU.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        cU.toFront();
        cU.show();
        cU.setEnabled(true);
    }//GEN-LAST:event_Usuarios_ConsultaActionPerformed

    private void Productos_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Productos_BuscarActionPerformed
        BuscarProducto busProd = new BuscarProducto();
        escritorio.add(busProd);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = busProd.getSize();
        busProd.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        busProd.toFront();
        busProd.show();
        busProd.setEnabled(true);
    }//GEN-LAST:event_Productos_BuscarActionPerformed

    private void Clientes_EdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clientes_EdicionActionPerformed
        EdicionCliente edCli = new EdicionCliente();
        escritorio.add(edCli);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = edCli.getSize();
        edCli.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        edCli.toFront();
        edCli.show();
        edCli.setVisible(true);
    }//GEN-LAST:event_Clientes_EdicionActionPerformed

    private void Usuarios_EdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuarios_EdicionActionPerformed
        EdicionUsuario edUsr = new EdicionUsuario();
        escritorio.add(edUsr);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = edUsr.getSize();
        edUsr.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        edUsr.toFront();
        edUsr.show();
        edUsr.setVisible(true);
    }//GEN-LAST:event_Usuarios_EdicionActionPerformed

    private void Productos_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Productos_AgregarActionPerformed
        AgregarProducto agProd = new AgregarProducto();
        escritorio.add(agProd);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = agProd.getSize();
        agProd.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        agProd.toFront();
        agProd.show();
        agProd.setVisible(true);
    }//GEN-LAST:event_Productos_AgregarActionPerformed

    private void Productos_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Productos_EditarActionPerformed
        EditarProducto edProd = new EditarProducto();
        escritorio.add(edProd);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = edProd.getSize();
        edProd.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        edProd.toFront();
        edProd.show();
        edProd.setVisible(true);
    }//GEN-LAST:event_Productos_EditarActionPerformed

    private void Productos_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Productos_CategoriaActionPerformed
        CategoriaProducto catProd = new CategoriaProducto();
        escritorio.add(catProd);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = catProd.getSize();
        catProd.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        catProd.toFront();
        catProd.show();
        catProd.setVisible(true);
    }//GEN-LAST:event_Productos_CategoriaActionPerformed

    private void Clientes_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clientes_NuevoActionPerformed
        NuevoCliente nCli = new NuevoCliente();
        escritorio.add(nCli);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = nCli.getSize();
        nCli.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        nCli.toFront();
        nCli.show();
        nCli.setVisible(true);
    }//GEN-LAST:event_Clientes_NuevoActionPerformed

    private void Clientes_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clientes_ConsultaActionPerformed
        ConsultaCliente conCli = new ConsultaCliente();
        escritorio.add(conCli);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = conCli.getSize();
        conCli.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        conCli.toFront();
        conCli.show();
        conCli.setVisible(true);
    }//GEN-LAST:event_Clientes_ConsultaActionPerformed

    private void Empleados_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Empleados_NuevoActionPerformed
        NuevoEmpleado nEmp = new NuevoEmpleado();
        escritorio.add(nEmp);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = nEmp.getSize();
        nEmp.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        nEmp.toFront();
        nEmp.show();
        nEmp.setVisible(true);
    }//GEN-LAST:event_Empleados_NuevoActionPerformed

    private void Empleados_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Empleados_ConsultaActionPerformed
        ConsultaEmpleado conEmp = new ConsultaEmpleado();
        escritorio.add(conEmp);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = conEmp.getSize();
        conEmp.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        conEmp.toFront();
        conEmp.show();
        conEmp.setVisible(true);
    }//GEN-LAST:event_Empleados_ConsultaActionPerformed

    private void Empleados_EdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Empleados_EdicionActionPerformed
        EdicionEmpleado edEmp = new EdicionEmpleado();
        escritorio.add(edEmp);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = edEmp.getSize();
        edEmp.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        edEmp.toFront();
        edEmp.show();
        edEmp.setVisible(true);
    }//GEN-LAST:event_Empleados_EdicionActionPerformed

    private void Ventas_NuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ventas_NuevaActionPerformed
        NuevaVenta nVen = new NuevaVenta();
        escritorio.add(nVen);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = nVen.getSize();
        nVen.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        nVen.toFront();
        nVen.show();
        nVen.setVisible(true);
    }//GEN-LAST:event_Ventas_NuevaActionPerformed

    private void Ventas_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ventas_ConsultaActionPerformed
        ConsultaVenta conVen = new ConsultaVenta();
        escritorio.add(conVen);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = conVen.getSize();
        conVen.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        conVen.toFront();
        conVen.show();
        conVen.setVisible(true);
    }//GEN-LAST:event_Ventas_ConsultaActionPerformed

    private void Ayuda_ManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ayuda_ManualActionPerformed
        AyudaManual ayuMan = new AyudaManual();
        escritorio.add(ayuMan);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = ayuMan.getSize();
        ayuMan.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        ayuMan.toFront();
        ayuMan.show();
        ayuMan.setVisible(true);
    }//GEN-LAST:event_Ayuda_ManualActionPerformed

    private void Ayuda_AcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ayuda_AcercaActionPerformed
        AyudaAcerca ayuAce = new AyudaAcerca();
        escritorio.add(ayuAce);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = ayuAce.getSize();
        ayuAce.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        ayuAce.toFront();
        ayuAce.show();
        ayuAce.setVisible(true);
    }//GEN-LAST:event_Ayuda_AcercaActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ayuda_Acerca;
    private javax.swing.JMenuItem Ayuda_Manual;
    private javax.swing.JMenuItem Clientes_Consulta;
    private javax.swing.JMenuItem Clientes_Edicion;
    private javax.swing.JMenuItem Clientes_Nuevo;
    private javax.swing.JMenuItem Empleados_Consulta;
    private javax.swing.JMenuItem Empleados_Edicion;
    private javax.swing.JMenuItem Empleados_Nuevo;
    public static javax.swing.JMenu MenuAyuda;
    public static javax.swing.JMenu MenuClientes;
    public static javax.swing.JMenu MenuEmpleados;
    public static javax.swing.JMenu MenuProductos;
    public static javax.swing.JMenu MenuUsuarios;
    public static javax.swing.JMenu MenuVentas;
    private javax.swing.JMenuItem Productos_Agregar;
    private javax.swing.JMenuItem Productos_Buscar;
    private javax.swing.JMenuItem Productos_Categoria;
    private javax.swing.JMenuItem Productos_Editar;
    private javax.swing.JMenuItem Usuarios_Consulta;
    private javax.swing.JMenuItem Usuarios_Edicion;
    private javax.swing.JMenuItem Usuarios_Nuevo;
    private javax.swing.JMenuItem Ventas_Consulta;
    private javax.swing.JMenuItem Ventas_Nueva;
    public javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel lblClima;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel scroll;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        
        while (ct==h1) {            
            calcula();
            lblReloj.setText(hora+":"+minutos+":"+segundos+" "+ampm);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                
            }
        }
    }
    private void calcula(){
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        
        calendario.setTime(fechaHoraActual);
        ampm=calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
        
        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
            hora= h>9?""+h:"0"+h;
        } else {
            hora= calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
}
