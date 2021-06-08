/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Navarrete
 */
public class Registro extends javax.swing.JInternalFrame {

    ButtonGroup btnGr;
    public Registro() {
        initComponents();
        btnGr = new ButtonGroup();
        btnGr.add(rbnAgregar);
        btnGr.add(rbnVenta);
        btnGr.add(rbnActualizar);
        btnGr.add(rbnEliminar);
        btnGr.add(rbnEliminarVenta);
        btnGr.add(rbnModificarVenta);
        
         if(rbnAgregar.isSelected() == true)
        {
            tbxId.setEnabled(false);
            tbxNombre.setEnabled(true);
            tbxConsola.setEnabled(true);
            cbxCategoria.setEnabled(true);
            tbxStock.setEnabled(true);
            tbxPrecio.setEnabled(true);
            tbxCodigo.setEnabled(true);
            tbxEmpresa.setEnabled(true);
            
            tbxIdVenta.setEnabled(false);
            tbxNombreCliente.setEnabled(false);
            tbxUnidadesCompradas.setEnabled(false);
            
            btnRegistrarJuego.setEnabled(true);
            btnEliminarJuego.setEnabled(false);
            btnActualizarJuego.setEnabled(false);
            btnRegistrarCompra.setEnabled(false);
            
            btnLimpiarCasillas.setEnabled(true);
            btnLimpiarCasillasVenta.setEnabled(false);
            
            tbxIdCliente.setEnabled(false);
            btnEliminarVenta.setEnabled(false);
            btnModificarVenta.setEnabled(false);
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        tbxId = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        tbxNombre = new javax.swing.JTextField();
        lblConsola = new javax.swing.JLabel();
        tbxConsola = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        tbxStock = new javax.swing.JTextField();
        cbxCategoria = new javax.swing.JComboBox<>();
        lblStock = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        tbxPrecio = new javax.swing.JTextField();
        tbxCodigo = new javax.swing.JTextField();
        tbxEmpresa = new javax.swing.JTextField();
        btnRegistrarJuego = new javax.swing.JButton();
        btnEliminarJuego = new javax.swing.JButton();
        btnActualizarJuego = new javax.swing.JButton();
        btnLimpiarCasillas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rbnAgregar = new javax.swing.JRadioButton();
        rbnActualizar = new javax.swing.JRadioButton();
        rbnVenta = new javax.swing.JRadioButton();
        rbnEliminar = new javax.swing.JRadioButton();
        rbnEliminarVenta = new javax.swing.JRadioButton();
        rbnModificarVenta = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        lblIDVenta = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JLabel();
        lblUnidadesCompradas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tbxIdVenta = new javax.swing.JTextField();
        tbxNombreCliente = new javax.swing.JTextField();
        tbxUnidadesCompradas = new javax.swing.JTextField();
        btnRegistrarCompra = new javax.swing.JButton();
        btnLimpiarCasillasVenta = new javax.swing.JButton();
        btnEliminarVenta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tbxIdCliente = new javax.swing.JTextField();
        btnModificarVenta = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro de Datos/Compras");
        setVisible(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Videojuego", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        lblID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblID.setText("ID : ");

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre.setText("Nombre :");

        lblConsola.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblConsola.setText("Consola :");

        lblCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCategoria.setText("Categoria :");

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Shooter", "Aventura", "RPG", "Carreras", "Deportes", "Plataformas", "Peleas" }));

        lblStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStock.setText("Stock :");

        lblPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrecio.setText("Precio :");

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigo.setText("Codigo :");

        lblEmpresa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmpresa.setText("Empresa :");

        btnRegistrarJuego.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrarJuego.setText("Registrar Juego");
        btnRegistrarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarJuegoActionPerformed(evt);
            }
        });

        btnEliminarJuego.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminarJuego.setText("Eliminar Juego");
        btnEliminarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarJuegoActionPerformed(evt);
            }
        });

        btnActualizarJuego.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActualizarJuego.setText("Actualizar Juego");
        btnActualizarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarJuegoActionPerformed(evt);
            }
        });

        btnLimpiarCasillas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpiarCasillas.setText("Limpiar Casillas");
        btnLimpiarCasillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCasillasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbxNombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegistrarJuego)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminarJuego))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnActualizarJuego)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiarCasillas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEmpresa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbxId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblConsola)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbxConsola, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblStock)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tbxStock))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblPrecio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tbxPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(tbxId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(tbxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConsola)
                    .addComponent(tbxConsola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStock)
                    .addComponent(tbxStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrecio)
                    .addComponent(tbxPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(tbxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmpresa)
                    .addComponent(tbxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarJuego)
                    .addComponent(btnEliminarJuego))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiarCasillas)
                    .addComponent(btnActualizarJuego))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblID.getAccessibleContext().setAccessibleName("");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones de Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        rbnAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbnAgregar.setSelected(true);
        rbnAgregar.setText("Agregar Juego");
        rbnAgregar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbnAgregarStateChanged(evt);
            }
        });
        rbnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnAgregarActionPerformed(evt);
            }
        });

        rbnActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbnActualizar.setText("Actualizar Juego");
        rbnActualizar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbnActualizarStateChanged(evt);
            }
        });

        rbnVenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbnVenta.setText("Registrar Venta");
        rbnVenta.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbnVentaStateChanged(evt);
            }
        });

        rbnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbnEliminar.setText("Eliminar Juego");
        rbnEliminar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbnEliminarStateChanged(evt);
            }
        });

        rbnEliminarVenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbnEliminarVenta.setText("Eliminar Venta");
        rbnEliminarVenta.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbnEliminarVentaStateChanged(evt);
            }
        });

        rbnModificarVenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbnModificarVenta.setText("Modificar Venta");
        rbnModificarVenta.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbnModificarVentaStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbnActualizar)
                    .addComponent(rbnAgregar)
                    .addComponent(rbnEliminarVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbnEliminar)
                    .addComponent(rbnVenta)
                    .addComponent(rbnModificarVenta))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnAgregar)
                    .addComponent(rbnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnActualizar)
                    .addComponent(rbnVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbnEliminarVenta)
                    .addComponent(rbnModificarVenta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        lblIDVenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIDVenta.setText("ID Juego :");

        lblNombreCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombreCliente.setText("Nombre Cliente :");

        lblUnidadesCompradas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUnidadesCompradas.setText("Unidades a Comprar :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnRegistrarCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrarCompra.setText("Registrar Venta");
        btnRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCompraActionPerformed(evt);
            }
        });

        btnLimpiarCasillasVenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpiarCasillasVenta.setText("Limpiar Casillas");
        btnLimpiarCasillasVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCasillasVentaActionPerformed(evt);
            }
        });

        btnEliminarVenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminarVenta.setText("Eliminar Venta");
        btnEliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVentaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID Cliente:");

        tbxIdCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnModificarVenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModificarVenta.setText("Modificar Venta");
        btnModificarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblIDVenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbxIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbxIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblUnidadesCompradas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbxUnidadesCompradas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblNombreCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbxNombreCliente)))
                        .addGap(74, 74, 74))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnRegistrarCompra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpiarCasillasVenta))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnEliminarVenta)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificarVenta)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDVenta)
                    .addComponent(tbxIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tbxIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreCliente)
                    .addComponent(tbxNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnidadesCompradas)
                    .addComponent(tbxUnidadesCompradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarCompra)
                    .addComponent(btnLimpiarCasillasVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarVenta)
                    .addComponent(btnModificarVenta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarJuegoActionPerformed
       String Nombre = tbxNombre.getText();
       String Consola = tbxConsola.getText();
       String Categoria = cbxCategoria.getSelectedItem().toString();
       int Stock = Integer.parseInt(tbxStock.getText());
       float Precio = Float.parseFloat(tbxPrecio.getText());
       String Codigo = tbxCodigo.getText();
       String Empresa = tbxEmpresa.getText();
       
       try{
           Connection con = Conexion.getConexion();
           PreparedStatement ps = con.prepareStatement("INSERT INTO Videojuegos (Nombre,Consola,Categoria,Stock,Precio,Codigo,Empresa) VALUES (?,?,?,?,?,?,?)");
           ps.setString(1,Nombre);
           ps.setString(2,Consola);
           ps.setString(3,Categoria);
           ps.setInt(4,Stock);
           ps.setFloat(5,Precio);
           ps.setString(6,Codigo);
           ps.setString(7,Empresa);
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null,"Videojuego Guardado.");

       }
       catch(SQLException e)
       {
           JOptionPane.showMessageDialog(null, e.toString());
       }
    }//GEN-LAST:event_btnRegistrarJuegoActionPerformed

    private void btnLimpiarCasillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCasillasActionPerformed
       Limpiar();
    }//GEN-LAST:event_btnLimpiarCasillasActionPerformed

    private void btnActualizarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarJuegoActionPerformed
        int Id = Integer.parseInt(tbxId.getText());
        String Nombre = tbxNombre.getText();
        String Consola = tbxConsola.getText();
        String Categoria = cbxCategoria.getSelectedItem().toString();
        int Stock = Integer.parseInt(tbxStock.getText());
        float Precio = Float.parseFloat(tbxPrecio.getText());
        String Codigo = tbxCodigo.getText();
        String Empresa = tbxEmpresa.getText();
       
        try{
           Connection con = Conexion.getConexion();
           PreparedStatement ps = con.prepareStatement("UPDATE Videojuegos SET Nombre=?,Consola=?,Categoria=?,Stock=?,Precio=?,Codigo=?,Empresa=? WHERE Id = ?");
           ps.setString(1,Nombre);
           ps.setString(2,Consola);
           ps.setString(3,Categoria);
           ps.setInt(4,Stock);
           ps.setFloat(5,Precio);
           ps.setString(6,Codigo);
           ps.setString(7,Empresa);
           ps.setInt(8,Id);
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null,"Videojuego Actualizado.");

        }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnActualizarJuegoActionPerformed

    private void btnEliminarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarJuegoActionPerformed
        int Id = Integer.parseInt(tbxId.getText());
        
       
        try{
           Connection con = Conexion.getConexion();
           PreparedStatement ps = con.prepareStatement("DELETE FROM Videojuegos WHERE Id = ?");
           ps.setInt(1,Id);
           
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null,"Videojuego Eliminado.");

        }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnEliminarJuegoActionPerformed

    private void btnRegistrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCompraActionPerformed
        int IdVenta = Integer.parseInt(tbxIdVenta.getText());
        String NombreCliente = tbxNombreCliente.getText();
        int UnidadesCompradas = Integer.parseInt(tbxUnidadesCompradas.getText());
        String NombreJuego="";
        double Precio = 0.0;
        double Total = 0.0;
        int Cantidad=0, CantidadActual=0;
        PreparedStatement ps;
        ResultSet rs;
        try
        {
           Connection con = Conexion.getConexion();
           ps = con.prepareStatement("SELECT Nombre,Stock,Precio FROM Videojuegos WHERE Id = ?");
           ps.setInt(1,IdVenta);
           rs = ps.executeQuery(); 
           while(rs.next())
            {
               NombreJuego = rs.getString("Nombre");
               Cantidad = rs.getInt("Stock");
               Precio = rs.getDouble("Precio");
            }
           
           if(UnidadesCompradas > 3)
           {
               
               Total = Precio * UnidadesCompradas;
               double Descuento = Total * 0.20;
               Total = Total - Descuento;
               JOptionPane.showMessageDialog(null,"Descuento Adquirido.");
           }
           else
           {
               Total = Precio * UnidadesCompradas;
           }
        
            
            CantidadActual = Cantidad - UnidadesCompradas;
        }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null, e.toString());
        }
        
        try
        {
           Connection con = Conexion.getConexion();
           ps = con.prepareStatement("INSERT INTO Ventas (NombreCliente,NombreJuego,UnidadesCompradas,Precio,Total) VALUES (?,?,?,?,?)");
           ps.setString(1,NombreCliente);
           ps.setString(2,NombreJuego);
           ps.setInt(3,UnidadesCompradas);
           ps.setDouble(4,Precio);
           ps.setDouble(5, Total);
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null,"Venta Guardada.");
        }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null, e.toString());
        }
        
        try
        {
           Connection con = Conexion.getConexion();
           ps = con.prepareStatement("UPDATE Videojuegos SET Stock = ? WHERE Id = ?");
           ps.setInt(1,CantidadActual);
           ps.setInt(2,IdVenta);
           
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null,"Actualizacion Correcta.");
        }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }//GEN-LAST:event_btnRegistrarCompraActionPerformed

    private void btnLimpiarCasillasVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCasillasVentaActionPerformed
        tbxIdVenta.setText("");
        tbxNombreCliente.setText("");
        tbxUnidadesCompradas.setText("");
        tbxIdCliente.setText("");
    }//GEN-LAST:event_btnLimpiarCasillasVentaActionPerformed

    private void rbnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnAgregarActionPerformed
        
    }//GEN-LAST:event_rbnAgregarActionPerformed

    private void rbnAgregarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbnAgregarStateChanged
        if(rbnAgregar.isSelected() == true)
        {
            tbxId.setEnabled(false);
            tbxNombre.setEnabled(true);
            tbxConsola.setEnabled(true);
            cbxCategoria.setEnabled(true);
            tbxStock.setEnabled(true);
            tbxPrecio.setEnabled(true);
            tbxCodigo.setEnabled(true);
            tbxEmpresa.setEnabled(true);
            
            tbxIdVenta.setEnabled(false);
            tbxNombreCliente.setEnabled(false);
            tbxUnidadesCompradas.setEnabled(false);
            
            btnRegistrarJuego.setEnabled(true);
            btnEliminarJuego.setEnabled(false);
            btnActualizarJuego.setEnabled(false);
            btnRegistrarCompra.setEnabled(false);
            
            btnLimpiarCasillas.setEnabled(true);
            btnLimpiarCasillasVenta.setEnabled(false);
            
            tbxIdCliente.setEnabled(false);
            btnEliminarVenta.setEnabled(false);
            btnModificarVenta.setEnabled(false);
        }
    }//GEN-LAST:event_rbnAgregarStateChanged

    private void rbnActualizarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbnActualizarStateChanged
         if(rbnActualizar.isSelected() == true)
        {
            tbxId.setEnabled(true);
            tbxNombre.setEnabled(true);
            tbxConsola.setEnabled(true);
            cbxCategoria.setEnabled(true);
            tbxStock.setEnabled(true);
            tbxPrecio.setEnabled(true);
            tbxCodigo.setEnabled(true);
            tbxEmpresa.setEnabled(true);
            
            tbxIdVenta.setEnabled(false);
            tbxNombreCliente.setEnabled(false);
            tbxUnidadesCompradas.setEnabled(false);
            
            btnRegistrarJuego.setEnabled(false);
            btnEliminarJuego.setEnabled(false);
            btnActualizarJuego.setEnabled(true);
            btnRegistrarCompra.setEnabled(false);
            
            btnLimpiarCasillas.setEnabled(true);
            btnLimpiarCasillasVenta.setEnabled(false);
            
            tbxIdCliente.setEnabled(false);
            btnEliminarVenta.setEnabled(false);
            btnModificarVenta.setEnabled(false);
        }
    }//GEN-LAST:event_rbnActualizarStateChanged

    private void rbnVentaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbnVentaStateChanged
        if(rbnVenta.isSelected() == true)
        {
            tbxId.setEnabled(false);
            tbxNombre.setEnabled(false);
            tbxConsola.setEnabled(false);
            cbxCategoria.setEnabled(false);
            tbxStock.setEnabled(false);
            tbxPrecio.setEnabled(false);
            tbxCodigo.setEnabled(false);
            tbxEmpresa.setEnabled(false);
            
            tbxIdVenta.setEnabled(true);
            tbxNombreCliente.setEnabled(true);
            tbxUnidadesCompradas.setEnabled(true);
            
            btnRegistrarJuego.setEnabled(false);
            btnEliminarJuego.setEnabled(false);
            btnActualizarJuego.setEnabled(false);
            btnRegistrarCompra.setEnabled(true);
            
            btnLimpiarCasillas.setEnabled(false);
            btnLimpiarCasillasVenta.setEnabled(true);
            
            tbxIdCliente.setEnabled(false);
            btnEliminarVenta.setEnabled(false);
            btnModificarVenta.setEnabled(false);
        }
    }//GEN-LAST:event_rbnVentaStateChanged

    private void rbnEliminarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbnEliminarStateChanged
        if(rbnEliminar.isSelected() == true)
        {
            tbxId.setEnabled(true);
            tbxNombre.setEnabled(false);
            tbxConsola.setEnabled(false);
            cbxCategoria.setEnabled(false);
            tbxStock.setEnabled(false);
            tbxPrecio.setEnabled(false);
            tbxCodigo.setEnabled(false);
            tbxEmpresa.setEnabled(false);
            
            tbxIdVenta.setEnabled(false);
            tbxNombreCliente.setEnabled(false);
            tbxUnidadesCompradas.setEnabled(false);
            
            btnRegistrarJuego.setEnabled(false);
            btnEliminarJuego.setEnabled(true);
            btnActualizarJuego.setEnabled(false);
            btnRegistrarCompra.setEnabled(false);
            
            btnLimpiarCasillas.setEnabled(true);
            btnLimpiarCasillasVenta.setEnabled(false);
            
            tbxIdCliente.setEnabled(false);
            btnEliminarVenta.setEnabled(false);
            btnModificarVenta.setEnabled(false);
        }
    }//GEN-LAST:event_rbnEliminarStateChanged

    private void rbnEliminarVentaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbnEliminarVentaStateChanged
        if(rbnEliminarVenta.isSelected() == true)
        {
            tbxId.setEnabled(false);
            tbxNombre.setEnabled(false);
            tbxConsola.setEnabled(false);
            cbxCategoria.setEnabled(false);
            tbxStock.setEnabled(false);
            tbxPrecio.setEnabled(false);
            tbxCodigo.setEnabled(false);
            tbxEmpresa.setEnabled(false);
            
            tbxIdVenta.setEnabled(false);
            tbxNombreCliente.setEnabled(false);
            tbxUnidadesCompradas.setEnabled(false);
            
            btnRegistrarJuego.setEnabled(false);
            btnEliminarJuego.setEnabled(false);
            btnActualizarJuego.setEnabled(false);
            btnRegistrarCompra.setEnabled(false);
            
            btnLimpiarCasillas.setEnabled(false);
            btnLimpiarCasillasVenta.setEnabled(true);
            
            tbxIdCliente.setEnabled(true);
            btnEliminarVenta.setEnabled(true);
            btnModificarVenta.setEnabled(false);
        }
    }//GEN-LAST:event_rbnEliminarVentaStateChanged

    private void rbnModificarVentaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbnModificarVentaStateChanged
        if(rbnModificarVenta.isSelected() == true)
        {
            tbxId.setEnabled(false);
            tbxNombre.setEnabled(false);
            tbxConsola.setEnabled(false);
            cbxCategoria.setEnabled(false);
            tbxStock.setEnabled(false);
            tbxPrecio.setEnabled(false);
            tbxCodigo.setEnabled(false);
            tbxEmpresa.setEnabled(false);
            
            tbxIdVenta.setEnabled(true);
            tbxNombreCliente.setEnabled(true);
            tbxUnidadesCompradas.setEnabled(true);
            
            btnRegistrarJuego.setEnabled(false);
            btnEliminarJuego.setEnabled(false);
            btnActualizarJuego.setEnabled(false);
            btnRegistrarCompra.setEnabled(false);
            
            btnLimpiarCasillas.setEnabled(false);
            btnLimpiarCasillasVenta.setEnabled(true);
            
            tbxIdCliente.setEnabled(true);
            btnEliminarVenta.setEnabled(false);
            btnModificarVenta.setEnabled(true);
        }
    }//GEN-LAST:event_rbnModificarVentaStateChanged

    private void btnEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentaActionPerformed
        int Id = Integer.parseInt(tbxIdCliente.getText());
        
        try{
           Connection con = Conexion.getConexion();
           PreparedStatement ps = con.prepareStatement("DELETE FROM Ventas WHERE Id = ?");
           ps.setInt(1,Id);
           
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null,"Cliente Eliminado.");

        }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnEliminarVentaActionPerformed

    private void btnModificarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVentaActionPerformed
        int IdCliente = Integer.parseInt(tbxIdCliente.getText());
        int IdVenta = Integer.parseInt(tbxIdVenta.getText());
        String NombreCliente = tbxNombreCliente.getText();
        int UnidadesCompradas = Integer.parseInt(tbxUnidadesCompradas.getText());
        String NombreJuego="";
        double Precio = 0.0;
        double Total = 0.0;
        
        PreparedStatement ps;
        ResultSet rs;
        try
        {
           Connection con = Conexion.getConexion();
           ps = con.prepareStatement("SELECT Nombre,Precio FROM Videojuegos WHERE Id = ?");
           ps.setInt(1,IdVenta);
           rs = ps.executeQuery(); 
           while(rs.next())
            {
               NombreJuego = rs.getString("Nombre");
             
               Precio = rs.getDouble("Precio");
            }
           
           if(UnidadesCompradas > 3)
           {
               
               Total = Precio * UnidadesCompradas;
               double Descuento = Total * 0.20;
               Total = Total - Descuento;
               JOptionPane.showMessageDialog(null,"Descuento Adquirido.");
           }
           else
           {
               Total = Precio * UnidadesCompradas;
           }
        }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null, e.toString());
        }
        
        try
        {
           Connection con = Conexion.getConexion();
           ps = con.prepareStatement("UPDATE Ventas SET NombreCliente=?,NombreJuego=?,UnidadesCompradas=?,Precio=?,Total=? WHERE Id = ?");
           ps.setString(1,NombreCliente);
           ps.setString(2,NombreJuego);
           ps.setInt(3,UnidadesCompradas);
           ps.setDouble(4,Precio);
           ps.setDouble(5, Total);
           ps.setInt(6,IdCliente);
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null,"Venta Modificada Guardada.");
        }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnModificarVentaActionPerformed

    private void Limpiar()
    {
        tbxId.setText("");
        tbxNombre.setText("");
        tbxConsola.setText("");
        tbxStock.setText("");
        tbxPrecio.setText("");
        tbxCodigo.setText("");
        tbxEmpresa.setText("");
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarJuego;
    private javax.swing.JButton btnEliminarJuego;
    private javax.swing.JButton btnEliminarVenta;
    private javax.swing.JButton btnLimpiarCasillas;
    private javax.swing.JButton btnLimpiarCasillasVenta;
    private javax.swing.JButton btnModificarVenta;
    private javax.swing.JButton btnRegistrarCompra;
    private javax.swing.JButton btnRegistrarJuego;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblConsola;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDVenta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblUnidadesCompradas;
    private javax.swing.JRadioButton rbnActualizar;
    private javax.swing.JRadioButton rbnAgregar;
    private javax.swing.JRadioButton rbnEliminar;
    private javax.swing.JRadioButton rbnEliminarVenta;
    private javax.swing.JRadioButton rbnModificarVenta;
    private javax.swing.JRadioButton rbnVenta;
    private javax.swing.JTextField tbxCodigo;
    private javax.swing.JTextField tbxConsola;
    private javax.swing.JTextField tbxEmpresa;
    private javax.swing.JTextField tbxId;
    private javax.swing.JTextField tbxIdCliente;
    private javax.swing.JTextField tbxIdVenta;
    private javax.swing.JTextField tbxNombre;
    private javax.swing.JTextField tbxNombreCliente;
    private javax.swing.JTextField tbxPrecio;
    private javax.swing.JTextField tbxStock;
    private javax.swing.JTextField tbxUnidadesCompradas;
    // End of variables declaration//GEN-END:variables
}
