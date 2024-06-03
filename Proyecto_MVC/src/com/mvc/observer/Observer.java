// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí determinamos la localización de nuestra clase, esto nos permite dividir el programa y agilizar sus funciones.
    package com.mvc.observer;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a importar las funcionalidades que permitirán el correcto funcionamiento de nuestro programa.
    
    // Primero vamos a importar la clase "Model" para poder usar todos sus métodos y características.
    import com.mvc.model.Model;

// CLASE CONTROLLER ---------------------------------------------------------------------------------------------------------------------------------

    // Esta clase tiene la función de "Main", inicia todo el sistema lógico del programa.
    public class Observer {

// COMIENZO DEL CÓDIGO ------------------------------------------------------------------------------------------------------------------------------

        // Creamos un método que compruebe la velocidad aumentada.
        public static void ComprobarVelocidadAumentada(){

            if (Model.subirVelocidad() > 120){  

                System.out.println("El coche no puede pasar de los 120 Km/H");

            }
            else {

                System.out.println("El coche ha aumentado su velocidad correctamente");
            }

            if (Model.subirVelocidad() < Model.subirVelocidad()){

                System.out.println("El coche no puede disminuir su velocidad");

            }
            else{

                System.out.println("El coche ha aumentado su velocidad correctamente");
            }
        }

        // Creamos un método que compruebe la velocidad aumentada.
        public static void ComprobarVelocidadDisminuida(){

            if (Model.subirVelocidad() < 0){  

                System.out.println("El coche no puede bajar de los 0 KM/h");

            }
            else {

                System.out.println("El coche ha disminuido su velocidad correctamente");
            }

            if (Model.subirVelocidad() > Model.subirVelocidad()){

                System.out.println("El coche no puede aumentar su velocidad");

            }
            else{

                System.out.println("El coche ha disminuidp su velocidad correctamente");
            }
        }

} // Fin de la clase "Controller".
