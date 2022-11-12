
package examen;

import java.sql.CallableStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author juare
 */
public class Inventario {
     int id;
     String fechai;
     String fechaf;
     String stock;
     String entradas;
     String salidas;
     String total;
     String idproducto;
     String descripcion;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechai() {
        return fechai;
    }

    public void setFechai(String fechai) {
        this.fechai = fechai;
    }

    public String getFechaf() {
        return fechaf;
    }

    public void setFechaf(String fechaf) {
        this.fechaf = fechaf;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getEntradas() {
        return entradas;
    }

    public void setEntradas(String entradas) {
        this.entradas = entradas;
    }

    public String getSalidas() {
        return salidas;
    }

    public void setSalidas(String salidas) {
        this.salidas = salidas;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void insertInventario(JTextField paramIDin,JTextField paramFechai,JTextField paramFechaf,JTextField paramstock,JTextField paramentrada,JTextField paramsalida,JTextField paramtot,JTextField paramidprod){
        
        setId(Integer.parseInt(paramIDin.getText()));
        setFechai(paramFechai.getText());
        setFechaf(paramFechaf.getText());
        setStock(paramstock.getText());
        setEntradas(paramentrada.getText());
        setSalidas(paramsalida.getText());
        setTotal(paramtot.getText());
        setIdproducto(paramidprod.getText());
        
        ConexionMysql obBD = new ConexionMysql();
        
        String cadena = "INSERT INTO inventario (idinventario,fecha_inicio,fecha_fin,stock_inicial,entradas,salidas,total,prod_idproducto) VALUES (?,\"?\",\"?\",?,?,?,?,?);";
        
        try {
            CallableStatement cs = obBD.establecerConexion().prepareCall(cadena);
            
            cs.setInt(1, getId());
            cs.setString(2, getFechai());
            cs.setString(3, getFechaf());
            cs.setString(4, getStock());
            cs.setString(5, getEntradas());
            cs.setString(6, getSalidas());
            cs.setString(7, getTotal());
            cs.setString(8, getIdproducto());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "LOS DATOS SE AGREGARON CORRECTAMENTE :)");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "LOS DATOS NO SE AGREGARON :( \n"+e);
        }
    }
    
    public void insertarroducto(JTextField paramidprod, JTextField paramDescripcion){
        
        setIdproducto(paramidprod.getText());
        setDescripcion(paramDescripcion.getText());
        
        ConexionMysql obBD = new ConexionMysql();
        
        String cadena = "INSERT INTO producto (idproducto,descripcion) VALUES (?,\"?\");";
        
        try {
            CallableStatement cs = obBD.establecerConexion().prepareCall(cadena);
            
            cs.setString(1, getIdproducto());
            cs.setString(2, getDescripcion());
            
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "LOS DATOS SE AGREGARON CORRECTAMENTE :)");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "LOS DATOS NO SE AGREGARON :( \n"+e);
        }
        
    }
  
}
