// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí determinamos la localización de nuestra clase, esto nos permite dividir el programa y agilizar sus funciones.
    package Controlador;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a importar las funcionalidades que permitirán el correcto funcionamiento de nuestro programa.
    
    // Primero vamos a importar la funcionalidad "Scanner", esta nos permite introducir datos por consola.
    import java.util.Scanner;

// CLASE CONTROLLER ---------------------------------------------------------------------------------------------------------------------------------

    // Esta clase tiene la función de "Main", inicia todo el sistema lógico del programa.
    public class Controller {

// DECLARACIONES ------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a declarar los diferentes objetos y variables que permiten el correcto funcionamiento de nuestro programa.

// COMIENZO DEL CÓDIGO ------------------------------------------------------------------------------------------------------------------------------

        // Para comenzar nuestro código vamos a crear método que contenga nuestro menú principal.
        public static void MétodoMenúPrincipal(){

            // Dentro del método vamos a crear el menú principal donde el usuario podrá elegir que opción desea realizar.
            System.out.println("""

                Por favor, escribe el número de la opción que desees realizar.

                1. Crea un nuevo coche!

                2. Busca un coche y tunea su velocidad.
                    
            """);

            // Ahora vamos a declarar el Scanner para poder recoger los datos que inserte el usuario por consola.
            Scanner Scanner = new Scanner(System.in);

            // Creamos el sistema lógico que leerá la respuesta del usuario por consola.
            int RespuestaUsuario = Integer.parseInt(Scanner.nextLine());

            // Creamos un condicional que reaccionará dependiendo de la respuesta del usuario.
            if (RespuestaUsuario == 1){

                // En caso de que la respuesta del usuario sea 1, llamamos a la clase 

            }

            

        } // Fin del "MétodoMenúPrincipal"

    } // Fin de la clase "Controller".

