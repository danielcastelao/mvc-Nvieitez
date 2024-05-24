// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí determinamos la localización de nuestra clase, esto nos permite dividir el programa y agilizar sus funciones.
    package src.com.mvc.Coche;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a importar las funcionalidades que permitirán el correcto funcionamiento de nuestro programa.

// CLASE COCHE --------------------------------------------------------------------------------------------------------------------------------------

    // Esta clase contiene los datos necesarios para el sistema de creación de coches.
    public class Coche {

// DECLARACIONES ------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a declarar los diferentes objetos y variables que permiten el correcto funcionamiento de nuestro programa.
    
    // Primero vamos a declarar una variable de tipo "String" que se encargue de recoger los datos de la marca del coche.
    String Marca;

    // Ahora vamos a declarar una variable de tipo "String" que se encargue de recoger los datos del modelo del coche.
    String Modelo;

    // Declaramos una variable de tipo "String" que se encargue de recoger los datos de la matrícula del coche.
    String Matricula;

    // Declaramos una variable de tipo "String" que se encargue de recoger la velocidad del coche.
    Integer Velocidad;

// COMIENZO DEL CÓDIGO ------------------------------------------------------------------------------------------------------------------------------

    // En esta clase vamos a crear los métodos "Getter" para poder recoger el valor de las variables desde otra clase.

    public String GetMarca(String Marca){

        // Dentro del método retornamos el valor para las otras clases.
        return Marca;

    } // Fin del método "GetMarca".

    public String GetModelo(String Modelo){

        // Dentro del método retornamos el valor para las otras clases.
        return Modelo;

    } // Fin del método "GetModelo".

    public String GetMatrícula(String Matricula){

        // Dentro del método retornamos el valor para las otras clases.
        return Matricula;

    } // Fin del método "GetMatrícula".

    public Integer GetVelocidad(Integer Velocidad){

        // Dentro del método retornamos el valor para las otras clases.
        return Velocidad;

    } // Fin del método "GetVelocidad".

    // Ahora vamos a crear los métodos "Setter" para poder introducir valores a las variables de esta clase.

    public void SetMarca(String Marca){

        // Dentro del método igualamos la variable a una nueva que recoja los datos que se van a introducir.
        this.Marca = Marca;
        

    } // Fin del método "SetMarca".

    public void SetModelo(String Modelo){

        // Dentro del método igualamos la variable a una nueva que recoja los datos que se van a introducir.
        this.Modelo = Modelo;

    } // Fin del método "SetModelo".

    public void SetMatricula(String Matricula){

        // Dentro del método igualamos la variable a una nueva que recoja los datos que se van a introducir.
        this.Matricula = Matricula;

    } // Fin del método "SetMatrícula".

    public void SetVelocidad(Integer Velocidad){

        // Dentro del método igualamos la variable a una nueva que recoja los datos que se van a introducir.
        this.Velocidad = Velocidad;

    } // Fin del método "SetVelocidad".

    } // Fin de la clase "Coche".
