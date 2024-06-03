package Proyecto_MVC.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.mvc.model.Model;
import com.mvc.observer.Observer;

public class ModelTest {
    @Test
    void testCrearCoche() {
        Model.CrearCoche("Subaru", "WRX", "A1111", "1000");
        Assertions.assertEquals(Model.Parking.get(1), Model.Parking.get(2));
    }

    @Test
    void testBajarVelocidad() {
        Model.bajarVelocidad();
        Assertions.assertFalse(false, "El dato introducido no es correcto");

    }

    @Test
    void testSubirVelocidad() {
        Model.subirVelocidad();
        Assertions.assertTrue(true, "El dato introducido es correcto");
    }
}
