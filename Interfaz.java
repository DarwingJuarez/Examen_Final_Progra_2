
package examen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author juare
 */
public class Interfaz extends javax.swing.JFrame {

    
    LinkedList<Inventario> inventario = new LinkedList<>();
    
    public Interfaz() {
        initComponents();
    }
    
    //BOTON PARA MOSTRAR LOS DATOS EN LA TABLA PRODUCTO
    public void mostrarP (String tabla){
        String sql = "select * from "+ tabla;
        Statement st;
        ConexionMysql obConex = new ConexionMysql();
        Connection ConexionMysql = obConex.establecerConexion();
        System.out.println(sql);
        DefaultTableModel mod = new DefaultTableModel();
        mod.addColumn("ID Producto");
        mod.addColumn("Descripcion");
        tblTabla2.setModel(mod);
        
        String [] date = new String[2];
        
        try {
            st = ConexionMysql.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                date[0]=rs.getString(1);
                date[1]=rs.getString(2);
                mod.addRow(date);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: "+e.toString());
        }
    }

    //BOTON PARA MOSTRAR LOS DATOS EN LA TABLA INVENTARIO
    public void mostrar (String tabla){
        String sql = "select * from "+ tabla;
        Statement st;
        ConexionMysql obConexion = new ConexionMysql();
        Connection ConexionMysql = obConexion.establecerConexion();
        System.out.println(sql);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Inventario");
        model.addColumn("Fecha I");
        model.addColumn("Fecha F");
        model.addColumn("Stock");
        model.addColumn("Entradas");
        model.addColumn("Salidas");
        model.addColumn("Total");
        model.addColumn("ID Producto");
        tblTabla.setModel(model);
        
        String [] dato = new String [8];
        
        try {
            
            st = ConexionMysql.createStatement();
            ResultSet rs  = st.executeQuery(sql);
            while(rs.next()){
                dato[0]=rs.getString(1);
                dato[1]=rs.getString(2);
                dato[2]=rs.getString(3);
                dato[3]=rs.getString(4);
                dato[4]=rs.getString(5);
                dato[5]=rs.getString(6);
                dato[6]=rs.getString(7);
                dato[7]=rs.getString(8);
                model.addRow(dato);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: "+e.toString());
        }
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cajaIDInventario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnProducto = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTabla2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        btnMostrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGuardarBD = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cajaFechaI = new javax.swing.JTextField();
        cajaFechaF = new javax.swing.JTextField();
        cajaStock = new javax.swing.JTextField();
        cajaEntrada = new javax.swing.JTextField();
        cajaSalida = new javax.swing.JTextField();
        cajaTotal = new javax.swing.JTextField();
        cajaIDProducto = new javax.swing.JTextField();
        cajaDescripcion = new javax.swing.JTextField();
        btnExtraer = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );

        cajaIDInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaIDInventarioActionPerformed(evt);
            }
        });

        jLabel2.setText("ID inventario:");

        btnProducto.setText("Crear Datos de Producto");
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        tblTabla2.setBackground(new java.awt.Color(255, 255, 255));
        tblTabla2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblTabla2.setForeground(new java.awt.Color(0, 0, 0));
        tblTabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Descripcion"
            }
        ));
        tblTabla2.setSelectionForeground(new java.awt.Color(0, 0, 255));
        jScrollPane3.setViewportView(tblTabla2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tblTabla.setBackground(new java.awt.Color(255, 255, 255));
        tblTabla.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblTabla.setForeground(new java.awt.Color(0, 0, 0));
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Inventario", "Fecha I", "Fecha F", "Stock", "Entradas", "Salidas", "Total", "ID Producto", "Descripcion"
            }
        ));
        tblTabla.setSelectionForeground(new java.awt.Color(0, 0, 255));
        jScrollPane1.setViewportView(tblTabla);

        btnMostrar.setText("Agregar Datos a Tabla");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar Archivo");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("EXAMEN FINAL");

        btnGuardarBD.setText("Guardar BD");
        btnGuardarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarBDActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha inicio:");

        jLabel4.setText("Fecha fin:");

        jLabel5.setText("Stock inicial:");

        jLabel6.setText("Entradas:");

        jLabel7.setText("Salidas:");

        jLabel8.setText("Total:");

        jLabel9.setText("ID producto:");

        jLabel10.setText("Descripcion:");

        cajaStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaStockActionPerformed(evt);
            }
        });

        cajaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaEntradaActionPerformed(evt);
            }
        });

        cajaIDProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaIDProductoActionPerformed(evt);
            }
        });

        cajaDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaDescripcionActionPerformed(evt);
            }
        });

        btnExtraer.setText("Cargar Archivo");
        btnExtraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtraerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExtraer, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarBD, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(cajaFechaI))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cajaStock, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cajaEntrada, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cajaFechaF, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(41, 41, 41)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(19, 19, 19)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cajaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cajaIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addGap(45, 45, 45)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cajaSalida, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cajaTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(52, 52, 52)
                            .addComponent(btnMostrar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExtraer, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarBD, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cajaFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(cajaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cajaFechaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(cajaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cajaStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(cajaIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cajaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cajaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        //mostrar("inventario");
        Inventario in = new Inventario();
        
        in.setId(inventario.size());
        in.setFechai(cajaFechaI.getText());
        in.setFechaf(cajaFechaF.getText());
        in.setStock(cajaStock.getText());
        in.setEntradas(cajaEntrada.getText());
        in.setSalidas(cajaSalida.getText());
        in.setTotal(cajaTotal.getText());
        in.setIdproducto(cajaIDProducto.getText());
        in.setDescripcion(cajaDescripcion.getText());
        
        inventario.add(in);
        
        cajaFechaI.setText("");
        cajaFechaF.setText("");
        cajaStock.setText("");
        cajaEntrada.setText("");
        cajaSalida.setText("");
        cajaTotal.setText("");
        cajaIDProducto.setText("");
        cajaDescripcion.setText("");
        
        llenarTabla();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        //mostrarP("producto");
    }//GEN-LAST:event_btnProductoActionPerformed

    private void cajaIDInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaIDInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaIDInventarioActionPerformed

    private void cajaStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaStockActionPerformed

    private void cajaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaEntradaActionPerformed

    private void cajaIDProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaIDProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaIDProductoActionPerformed

    private void cajaDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaDescripcionActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        JFileChooser seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo (*.txt)", "txt");
        
        seleccionarArchivo.setFileFilter(filtro);
        
        int seleccionar = seleccionarArchivo.showOpenDialog(this);
        
        if(seleccionar == JFileChooser.APPROVE_OPTION){
            File archivo = seleccionarArchivo.getSelectedFile();
            guardarArchivo(archivo);
        } 
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnExtraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtraerActionPerformed
        JFileChooser seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo (*.txt)", "txt");
        
        seleccionarArchivo.setFileFilter(filtro);
        
        int seleccionar = seleccionarArchivo.showOpenDialog(this);
        
        if(seleccionar == JFileChooser.APPROVE_OPTION){
            File archivo = seleccionarArchivo.getSelectedFile();
            cargarArchivo(archivo);
        }
    }//GEN-LAST:event_btnExtraerActionPerformed

    private void btnGuardarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarBDActionPerformed
        Inventario objGuardar = new Inventario();
        
        objGuardar.insertInventario(cajaIDInventario, cajaFechaI, cajaFechaF, cajaStock, cajaEntrada, cajaSalida, cajaTotal, cajaIDProducto);
        objGuardar.insertarroducto(cajaIDProducto, cajaDescripcion);
    }//GEN-LAST:event_btnGuardarBDActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExtraer;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarBD;
    public javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnProducto;
    private javax.swing.JTextField cajaDescripcion;
    private javax.swing.JTextField cajaEntrada;
    private javax.swing.JTextField cajaFechaF;
    private javax.swing.JTextField cajaFechaI;
    private javax.swing.JTextField cajaIDInventario;
    private javax.swing.JTextField cajaIDProducto;
    private javax.swing.JTextField cajaSalida;
    private javax.swing.JTextField cajaStock;
    private javax.swing.JTextField cajaTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    public javax.swing.JTable tblTabla;
    public javax.swing.JTable tblTabla2;
    // End of variables declaration//GEN-END:variables

    //Agregamos los Getter
    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JButton getBtnMostrar() {
        return btnMostrar;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JTable getTblTabla() {
        return tblTabla;
    }

    private void llenarTabla() {
        DefaultTableModel md = new DefaultTableModel(new String[]{"ID Inventario","Fecha I","Fecha F","Stock","Entradas","Salidas","Total","ID Producto","Descripcion"},inventario.size());
        tblTabla.setModel(md);
        
        TableModel tm = tblTabla.getModel();
        
        for(int i = 0; i<inventario.size(); i++){
            Inventario inv = inventario.get(i);
            
            tm.setValueAt(inv.getId(), i, 0);
            tm.setValueAt(inv.getFechai(), i, 1);
            tm.setValueAt(inv.getFechaf(), i, 2);
            tm.setValueAt(inv.getStock(), i, 3);
            tm.setValueAt(inv.getEntradas(), i, 4);
            tm.setValueAt(inv.getSalidas(), i, 5);
            tm.setValueAt(inv.getTotal(), i, 6);
            tm.setValueAt(inv.getIdproducto(), i, 7);
            tm.setValueAt(inv.getDescripcion(), i, 8);
        }
    }

    private void cargarArchivo(File archivo) {
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            
            while ((linea = br.readLine())!=null) {                
                
                String arreglo [] = linea.split(",");
                if(arreglo.length == 9){
                    Inventario inv = new Inventario();
                    
                    inv.setId(Integer.parseInt(arreglo[0]));
                    inv.setFechai(arreglo[1]);
                    inv.setFechaf(arreglo[2]);
                    inv.setStock(arreglo[3]);
                    inv.setEntradas(arreglo[4]);
                    inv.setSalidas(arreglo[5]);
                    inv.setTotal(arreglo[6]);
                    inv.setIdproducto(arreglo[7]);
                    inv.setDescripcion(arreglo[8]);
                    
                    inventario.add(inv);
                    
                }
            }
           llenarTabla();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                if(fr != null){
                    fr.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
            
    }

     public void guardarArchivo(File archivo) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try {
            fichero = new FileWriter(archivo);
            pw = new PrintWriter(fichero);
            
            for(Inventario inv: inventario){
                String linea = inv.getId()+","+inv.getFechai()+","+inv.getFechaf()+","+inv.getStock()+","+inv.getEntradas()+","+inv.getSalidas()+","+inv.getTotal()+","+inv.getIdproducto()+","+inv.getDescripcion();
                pw.println(linea);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       finally{
            try {
                if(fichero!=null){
                    fichero.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



    
}
