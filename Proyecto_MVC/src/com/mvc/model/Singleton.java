package com.mvc.model;

public class Singleton {

    // Primero vamos a declarar las variables necesarias para poder usar las instancias
    private static Singleton Instancia;
    public String Valor;

    // Ahora creamos un método llamado "Singleton" que se encargue del sistema lógico.
    private Singleton(String Valor) {
        
        // Dentro del método creamos un try-catch que se encargue de comprobar que el singleton ha funcionado correctamente.
        try {

            Thread.sleep(1000);

        } catch (InterruptedException ERROR) {

            System.out.println("Algo ha ido mal: ");
            System.out.println(ERROR);

        } // Fin del try-catch

        // Finalmente igualamos valor a si mismo.
        this.Valor = Valor;

    } // Fin del método "Singleton"

    // También creamos un segundo método que se encargue del manejo de las instancias.
    public static Singleton getInstance(String Valor) {

        // Dentro del método creamos un condicional que compruebe si la instancia es nula.
        if (Instancia == null) {

            // En caso de que lo sea, introducimos el valor en la instancia.
            Instancia = new Singleton(Valor);

        } // Fin del "If".

        // Finalmente Retornamos la instancia.
        return Instancia;

    } // Fin del método "GetInstance".

} // Fin de la clase "Singleton".
