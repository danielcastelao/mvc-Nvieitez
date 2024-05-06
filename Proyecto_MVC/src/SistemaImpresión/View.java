// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí determinamos la localización de nuestra clase, esto nos permite dividir el programa y agilizar sus funciones.
    package SistemaImpresión;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a importar las funcionalidades que permitirán el correcto funcionamiento de nuestro programa.

    // Importamos la funcionalidad "JOptionPane", esta nos permite introducir y mostrar información por pantalla.
    import javax.swing.JOptionPane;

// CLASE VIEW ---------------------------------------------------------------------------------------------------------------------------------------

    // Esta clase contiene el sistema lógico para imprimir la velocidad de los coches.
    public class View {

// DECLARACIONES ------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a declarar los diferentes objetos y variables que permiten el correcto funcionamiento de nuestro programa.
    static int ViewVelocidad;

// COMIENZO DEL CÓDIGO ------------------------------------------------------------------------------------------------------------------------------

    // En esta clase vamos a crear un método para ver la velocidad del coche.
    public static void ImprimirVelocidad (){

        // Primero vamos a pedir por pantalla la matrícula que se busca.
        String MatrículaBuscada = JOptionPane.showInputDialog("Escribe la matrícula del coche que buscas:");

        // Ahora vamos a crear un comprobante de si se han encontrado datos.
        boolean MatrículaEncontrada = false;

        // Creamos un bucle que se encargue de leer los datos dentro del array.
        for(int x = 0; x < Controlador.Model.Parking.size(); x++){

            // Dentro del bucle creamos un condicional que responda en caso de encontrar una coincidencia.
            if( Controlador.Model.Parking.equals(MatrículaBuscada)) {

                // Imprimimos la velocidad
                JOptionPane.showMessageDialog(null, "La velocidad de este coche es de: " + Controlador.Model.Parking.get(ViewVelocidad));

                // Determinamos que el se ha encontrado una coincidencia.
                MatrículaEncontrada = true;

            } // Fin del condicional.

        } // Fin del bucle.

        // Ahora creamos un condicional que responda en caso de no encontrar ningún vehículo
        if( !MatrículaEncontrada) {

            // Imprimimos el resultado.
            JOptionPane.showMessageDialog(null, "El coche buscado no exíste");

        } // Fin del condicional.

        } // Fin del método "ImprimirVelocidad".

    } // Fin de la clase "View"
