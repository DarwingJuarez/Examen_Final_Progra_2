
package examen;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author juare
 */
public class ConexionMysql {
    Connection conectar = null;
    String usuario="root";
    String contrasenia="DaStE.13_JB";
    String bd="examenfinal";
    String ip="localhost";
    String puerto="3306";
    
    String cadena="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=DriverManager.getConnection(cadena, usuario, contrasenia);
            JOptionPane.showMessageDialog(null, "SE CONECTO CORRECTAMENTE A LA BASE DE DATOS");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE CONECTO A LA BASE DE DATOS\nERROR: "+e.toString());
        }
        
        return conectar;
    }
}
