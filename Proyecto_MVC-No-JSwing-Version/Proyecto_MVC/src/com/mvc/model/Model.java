package com.mvc.model;
// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí determinamos la localización de nuestra clase, esto nos permite dividir el programa y agilizar sus funciones.
    

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a importar las funcionalidades que permitirán el correcto funcionamiento de nuestro programa.

    // Primero importamos la funcionalidad "ArrayList", esta nos permite crear listas que guarden diferentes tipos de datos.
    import java.util.ArrayList;

    // Ahora importamos la funcionalidad "JOptionPane", esta nos permite introducir y mostrar datos por pantalla.
    import java.util.Scanner;

    // Importamos la clase "Coche" para poder usar sus métodos y funcionalidades.
    import com.mvc.coche.Coche;

// CLASE MODEL --------------------------------------------------------------------------------------------------------------------------------------

    // Esta clase contiene la funcionalidad de la creación de coches.
    public class Model {

// DECLARACIONES ------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a declarar los diferentes objetos y variables que permiten el correcto funcionamiento de nuestro programa.

    // Primero vamos a declarar una variable de tipo "String" que se encargue de recoger los datos de la marca del coche.
    String ModelMarca;

    // Ahora vamos a declarar una variable de tipo "String" que se encargue de recoger los datos del modelo del coche.
    String ModelModelo;
 
    // Declaramos una variable de tipo "String" que se encargue de recoger los datos de la matrícula del coche.
    String ModelMatrícula;
 
    // Declaramos una variable de tipo "String" que se encargue de recoger la velocidad del coche.
    Integer ModelVelocidad;

    // Finalmente vamos a crear un objeto de la clase "Coche" para poder usar sus variables y métodos.
    Coche NuevoCoche = new Coche();

// COMIENZO DEL CÓDIGO ------------------------------------------------------------------------------------------------------------------------------

    // Primero vamos a crear un ArrayList que se encargue de guardar los datos del los nuevos coches creados.
    public static ArrayList <Coche> Parking = new ArrayList<>();

    // Ahora creamos un método "CrearCoche" que se encargue del sistema lógico de crear un coche y añadirlo al array.
    public static Coche CrearCoche(String ModelMarca, String ModelModelo, String ModelMatricula, int  ModelVelocidad){

        // Ahora vamos a declarar el Scanner para poder recoger los datos que inserta usuario por consola.
        Scanner Scanner = new Scanner(System.in);

        // Ahora vamos pedir los datos por consola y recogerlos con el Scanner.
        System.out.println("\nEscribe la marca de tu nuevo coche:");
        ModelMarca = Scanner.nextLine(); 

        System.out.println("\nEscribe el modelo de tu nuevo coche:");
        ModelModelo = Scanner.nextLine();

        System.out.println("\nEscribe la matrícula de tu nuevo coche:");
        ModelMatricula = Scanner.nextLine();

        System.out.println("\nEscribe la velocidad máxima de tu nuevo coche:");
        ModelVelocidad = Integer.parseInt(Scanner.nextLine());

        // Introducimos los datos a las variables de la clase "Coche".
        Coche NuevoCoche = new Coche();

        NuevoCoche.SetMarca(ModelMarca);
        NuevoCoche.SetModelo(ModelModelo);
        NuevoCoche.SetMatricula(ModelMatricula);
        NuevoCoche.SetVelocidad(ModelVelocidad);

        // Introducimos el nuevo coche en el ArrayList.
        Parking.add(NuevoCoche);

        // Introducimos un mensaje de éxito.
        System.out.println("\nEl coche se ha creado correctamente.");

        // Imprimimos un separador para que se muestre bien el menú en consola
        System.out.println("\n---------------------------------------------------------------------");

        // Retornamos el nuevo coche.
        return NuevoCoche;
        
    } // Fin del método "CrearCoche".

    } // Fin de la clase "Model".
