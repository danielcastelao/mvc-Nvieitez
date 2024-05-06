// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí determinamos la localización de nuestra clase, esto nos permite dividir el programa y agilizar sus funciones.
    package Controlador;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a importar las funcionalidades que permitirán el correcto funcionamiento de nuestro programa.

    // Primero importamos la funcionalidad "ArrayList", esta nos permite crear listas que guarden diferentes tipos de datos.
    import java.util.ArrayList;

    // Importamos la funcionalidad "JOptionPane", esta nos permite introducir y mostrar datos por pantalla.
    import javax.swing.JOptionPane;

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
    public static Coche CrearCoche(String ModelMarca, String ModelModelo, String ModelMatrícula, int  ModelVelocidad){

        // Ahora vamos pedir los datos por pantalla.
        ModelMarca = JOptionPane.showInputDialog("Escribe la marca de tu nuevo coche:");
        ModelModelo = JOptionPane.showInputDialog("Escribe el modelo de tu nuevo coche:");
        ModelMatrícula = JOptionPane.showInputDialog("Escribe la matrícula de tu nuevo coche:");

        ModelVelocidad = Integer.parseInt(JOptionPane.showInputDialog("Escribe la velocidad máxima de tu nuevo coche:"));

        // Introducimos los datos a las variables de la clase "Coche".
        Coche NuevoCoche = new Coche();

        NuevoCoche.SetMarca(ModelMarca);
        NuevoCoche.SetModelo(ModelModelo);
        NuevoCoche.SetMatrícula(ModelMatrícula);

        NuevoCoche.SetVelocidad(ModelVelocidad);

        // Introducimos el nuevo coche en el ArrayList.
        Parking.add(NuevoCoche);

        // Introducimos un mensaje de éxito.
        JOptionPane.showMessageDialog(null, "El coche se ha creado correctamente.");

        // Retornamos el nuevo coche.
        return NuevoCoche;
        
    } // Fin del método "CrearCoche".

    } // Fin de la clase "Model".
