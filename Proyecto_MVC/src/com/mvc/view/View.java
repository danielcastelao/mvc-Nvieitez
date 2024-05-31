// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí determinamos la localización de nuestra clase, esto nos permite dividir el programa y agilizar sus funciones.
    package com.mvc.view;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a importar las funcionalidades que permitirán el correcto funcionamiento de nuestro programa.

    // Primero importamos la clase "Model" para poder usar sus métodos y funcionalidades.
    import com.mvc.model.Model;

    // Importamos la clase Controller para poder usar sus métodos y funcionalidades.
    import com.mvc.controller.Controller;

    // Importamos la funcionalidad "Scanner" para poder introducir datos por consola.
    import java.util.Scanner;
 
// CLASE VIEW ---------------------------------------------------------------------------------------------------------------------------------------

    // Esta clase contiene el sistema lógico para imprimir la velocidad de los coches.
    public class View {

// DECLARACIONES ------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a declarar los diferentes objetos y variables que permiten el correcto funcionamiento de nuestro programa.

// COMIENZO DEL CÓDIGO ------------------------------------------------------------------------------------------------------------------------------

    // Para comenzar nuestro código, primero creamos un método que se encargue del sistema lógico.
    public static void ImprimirCoches(){

        // Dentro del método, primero vamos a declarar el Scanner para poder recoger los datos que inserta usuario por consola.
        Scanner Scanner = new Scanner(System.in);

        // Ahora creamos una variable que recoja la matricula que busca el usuario.
        System.out.println("\nEscribe la matrícula del vehículo que buscas");
        String MatriculaBuscada = Scanner.nextLine();

        // Creamos un booleano que se encargue de buscar si se ha encontrado algún resultado.
        boolean CocheEncontrado = false; 

        // Creamos un bucle que recorra todo el array en busca de la matrícula introducida.
        for(int i = 0; i < Model.Parking.size(); i++){

            // Dentro del bucle creamos un condicional que salte al encontrar una coincidencia con la matrícula que busca el usuario.
            if(Model.Parking.equals(MatriculaBuscada)) {

                // Dentro del condicional imprimimos los datos cuando se encuentre algo
                System.out.println("\nHemos encontrado tu vehículo!\n" + Model.Parking.get(i));

                // Determinamos que el booleano ha encontrado algo
                CocheEncontrado = true;

                // Creamos un separador para que la información se muestre bien en consola.
                System.out.println("\n---------------------------------------------------------------------");

                // Enviamos al usuario de vuelta al menú principal
                Controller.MetodoMenuPrincipal();
                
            } // Fin del condicional "If". 

    } // Fin del bucle.

    // Finalmente creamos otro condicional que salte cuando no se ha encontrado ningún resultado.
    if(!CocheEncontrado) {

        System.out.println( "\nNo se ha encontrado ninguna coincidencia, vuelve a intentarlo!");

        // Creamos un separador para que la información se muestre bien en consola.
        System.out.println("\n---------------------------------------------------------------------");

        // Enviamos al usuario de vuelta al menú principal
        Controller.MetodoMenuPrincipal();

    } // Fin del condicional "If".

    } // Fin del método "ImprimirCoches".

} // Fin de la clase "View"
