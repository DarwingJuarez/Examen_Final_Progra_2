
package examen;

/**
 *
 * @author juare
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       ConexionMysql obConexion = new ConexionMysql();
       
       obConexion.establecerConexion();
       Interfaz interfaz = new Interfaz();
       interfaz.setVisible(true);
    }
    
}
