import javax.swing.*;
import javax.swing.JOptionPane;
import java.io.*;

public class principal {

    String dialogo;

    public principal() {     }

    public int obtenerOpcionMenu() throws IOException {
        dialogo = "MENU EMPLEADO\n";
        dialogo += "1.  Insertar empleado\n";
        dialogo += "2.  Modificar empleado\n";
        dialogo += "3.  Listar los empleado\n";
        dialogo += "4.  Eliminar empleado\n";
        dialogo += "5.  Salir\n";
        dialogo += "Escoja Opción:\n";
        return Integer.parseInt(JOptionPane.showInputDialog(dialogo));
    }

    public String obtenerIdentificacionempleado() throws IOException {
        dialogo = "Introduzca Identificacion de empleado\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    //Completamos aquí la petición de datos
    public String obtenerNombreempleado() throws IOException {
        dialogo = "Introduzca Nombre de empleado\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String obtenerApellidosempleado() throws IOException {
        dialogo = "Introduzca Apellidos de empleado\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String obtenerEmailempleado() throws IOException {
        dialogo = "Introduzca email de empleado\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String obtenerCelularempleado() throws IOException {
        dialogo = "Introduzca Celular de empleado\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public int obtenerEdadempleado() throws IOException {
        dialogo = "Introduzca Edad de empleado\n";
        return Integer.parseInt(JOptionPane.showInputDialog(dialogo));
    }
   
    public void mostrarMensaje (String mensaje) {
        JFrame frame = new JFrame("Mensaje");
        JOptionPane.showMessageDialog(frame, mensaje);
    }
   
    public void cerrarPrograma () {
        JFrame frame = new JFrame("Final del programa");
        JOptionPane.showMessageDialog(frame, "Gracias por usar este programa. Fin");
        System.exit(0);
    }
}