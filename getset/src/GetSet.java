import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.Iterator;

public class GetSet {

    public static void main (String[] Args) throws IOException {

        int opcionEligeUsuario = 0;
        List <empleado> listaDeempleado = new ArrayList<> ();
        principal opcionesUsuario = new principal();
        principal mensajeVent = new principal();

        while (opcionEligeUsuario != 5 ) {

            opcionEligeUsuario = opcionesUsuario.obtenerOpcionMenu();

            //Registrar la información de pasajero opción 1
            if (opcionEligeUsuario == 1) {

                empleado tmpempleado = new empleado();
                tmpempleado.SetIdentificacion(opcionesUsuario.obtenerIdentificacionempleado());
                tmpempleado.SetNombre(opcionesUsuario.obtenerNombreempleado());
                tmpempleado.SetApellidos(opcionesUsuario.obtenerApellidosempleado());
                tmpempleado.SetEmail(opcionesUsuario.obtenerEmailempleado());
                tmpempleado.SetCelular(opcionesUsuario.obtenerCelularempleado());
                tmpempleado.SetEdad(opcionesUsuario.obtenerEdadempleado());
                //Terminamos guardando el objeto pasajero
                listaDeempleado.add(tmpempleado);
            }
            //Fin opción 1 registro información de pasajero

            //Modificar la información de un pasajero opción 2
            if (opcionEligeUsuario == 2) {
                String identempleadoBuscado = opcionesUsuario.obtenerIdentificacionempleado();
                boolean empleadoEncontrado = false;

                Iterator<empleado> it = listaDeempleado.iterator();
                empleado tmpAnalizando;

                while ( it.hasNext() ) {           //Utilizamos el método hasNext de los objetos tipo Iterator

                    tmpAnalizando = it.next();                //Utilizamos el método next de los objetos tipo Iterator

                    if (tmpAnalizando.getIdentificacion().equals(identempleadoBuscado) ) {
                        empleadoEncontrado = true;
                        String mensaje = tmpAnalizando.getStringempleado();
                        mensaje = mensaje + "\n\n\n";
                        mensaje = mensaje + "A continuación introduzca nuevos datos para este empleado";

                        mensajeVent.mostrarMensaje(mensaje);

                        // Aquí código para pedir nuevos datos para el pasajero

                        mensajeVent.mostrarMensaje("La identificación no puede ser modificada, indique resto de datos");
                        tmpAnalizando.SetNombre(opcionesUsuario.obtenerNombreempleado());
                        tmpAnalizando.SetApellidos(opcionesUsuario.obtenerApellidosempleado());
                        tmpAnalizando.SetEmail(opcionesUsuario.obtenerEmailempleado());
                        tmpAnalizando.SetCelular(opcionesUsuario.obtenerCelularempleado());
                        tmpAnalizando.SetEdad(opcionesUsuario.obtenerEdadempleado());

                        mensaje = tmpAnalizando.getStringempleado();
                        mensajeVent.mostrarMensaje(mensaje);

                    } else { }    //else vacío. No hay acciones a ejecutar.

                } //Cierre del while

                if (empleadoEncontrado == false) {
                    mensajeVent.mostrarMensaje("No se encontró el empleado con esa identificación");
                }
            } //Fin opción 2 registro información de pasajero

            //Opción 3 listar pasajeros
            if (opcionEligeUsuario == 3) {

                String listado = "";

                Iterator<empleado> it2 = listaDeempleado.iterator();
                empleado tmpAnalizando;

                while ( it2.hasNext() ) {           //Utilizamos el método hasNext de los objetos tipo Iterator
                    tmpAnalizando = it2.next();                //Utilizamos el método next de los objetos tipo Iterator
                    listado = listado + tmpAnalizando.getStringempleado();
                    listado = listado + "\n\n\n";
                } //Cierre del while

                mensajeVent.mostrarMensaje(listado);

            } //Fin opción 3 listar pasajeros

            //Eliminar un pasajero opción 4
            if (opcionEligeUsuario == 4) {
                String identempleadoBuscado = opcionesUsuario.obtenerIdentificacionempleado();
                boolean empleadoEncontrado = false;

                Iterator<empleado> it = listaDeempleado.iterator();
                empleado tmpAnalizando;

                while ( it.hasNext() && empleadoEncontrado==false ) {           //Utilizamos el método hasNext de los objetos tipo Iterator

                    tmpAnalizando = it.next();                //Utilizamos el método next de los objetos tipo Iterator

                    if (tmpAnalizando.getIdentificacion().equals(identempleadoBuscado) ) {
                        empleadoEncontrado = true;
                        String mensaje = tmpAnalizando.getStringempleado();
                        mensaje = mensaje + "\n\n\n";
                        mensaje = mensaje + "Se procede al borrado de datos de este empleado\n\n";

                        mensajeVent.mostrarMensaje(mensaje);

                        // Aquí código para pedir nuevos datos para el pasajero
                        listaDeempleado.remove(tmpAnalizando);
                        empleadoEncontrado=true;

                    } else { }    //else vacío. No hay acciones a ejecutar.

                } //Cierre del while

                if (empleadoEncontrado == false) {
                    mensajeVent.mostrarMensaje("No se encontró el empleado con esa identificación");
                }
            } //Fin opción 2 registro información de pasajero

        }

        opcionesUsuario.cerrarPrograma();

    } //Cierra main

} //Cierra clase