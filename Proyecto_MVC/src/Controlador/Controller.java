// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí determinamos la localización de nuestra clase, esto nos permite dividir el programa y agilizar sus funciones.
    package Controlador;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a importar las funcionalidades que permitirán el correcto funcionamiento de nuestro programa.

    // Primero vamos a importar el paquete "Entorno Gráfico" para poder usar sus clases.
    import EntornoGráfico.MenuPrincipal;

// CLASE CONTROLLER ---------------------------------------------------------------------------------------------------------------------------------

    // Esta clase tiene la función de "Main", inicia todo el sistema lógico del programa.
    public class Controller {

// ENUNCIADO ----------------------------------------------------------------------------------------------------------------------------------------

    // Crea un programa que te permita crear coches, indicando su marca, su modelo, y su matrícula. Cada coche deberá tener una velocidad que 
    // el usuario podrá determinar y cambiarla en cualquier momento.

// DECLARACIONES ------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a declarar los diferentes objetos y variables que permiten el correcto funcionamiento de nuestro programa.

// COMIENZO DEL CÓDIGO ------------------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) throws Exception {

        // Para iniciar nuestro programa, primero vamos a llamar a la clase menú principal.
        MenuPrincipal.MétodoMenúPrincipal();
        
    } // Fin de la clase "Controller".

    } // Fin del programa.
