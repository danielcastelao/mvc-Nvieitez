// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí determinamos la localización de nuestra clase, esto nos permite dividir el programa y agilizar sus funciones.
    package Proyecto_MVC.test;

    //
    import org.junit.Test;
    
    // 
    import org.junit.jupiter.api.Assertions;

    //
    import Controlador.Coche;

    //
    import Controlador.Model;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a importar las funcionalidades que permitirán el correcto funcionamiento de nuestro programa.

// CLASE MODEL TEST ---------------------------------------------------------------------------------------------------------------------------------

    // Esta clase se encarga de realizar pruebas sobre la clase "Model"
    public class ModelTest {


// DECLARACIONES ------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a declarar los diferentes objetos y variables que permiten el correcto funcionamiento de nuestro programa.
    static int ViewVelocidad;

// COMIENZO DEL CÓDIGO ------------------------------------------------------------------------------------------------------------------------------

    // Primero vamos a realizar tests sobre el método "CrearCoche".
    @Test 
    public void TestCrearCoche(){

        Coche NuevoCoche = Model.CrearCoche("Opel", "Astra", "A1111", 100);
        Assertions.assertEquals(NuevoCoche, NuevoCoche);

    } // Fin del "TestCrearCoche".

    } // Fin de la clase "ModelTest".
