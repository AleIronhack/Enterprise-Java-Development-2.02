import org.example.Main;
import org.example.models.Warrior;
import org.example.models.Wizard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class oddTest {

    Warrior warrior;
    Wizard wizard;

    @BeforeEach
    void setUp(){
        warrior = new Warrior(100, 50, 2);
        wizard = new Wizard(40,40,2);
    }

    @Test
    @DisplayName("devuleve array de impares")
    void return_odd_numbers(){
        //int[] response = {1 , 3, 5};
        assertArrayEquals(new int[]{1 , 3, 5}, Main.oddNumbers(5));

    }

    @Test
    @DisplayName("palabra prohibida")
    void forbidden_words(){
        assertTrue(Main.forbiddenWords(" is an yes"));
    }

    @Test
    @DisplayName("disminiur vidas")
    void decrease_lives(){
        warrior.decreaseLives();
        assertEquals(1, warrior.getLives());

    }

    @Test
    @DisplayName("ataque")
    void attack(){
        warrior.attack(wizard);
        assertEquals(100, wizard.getHealth());
        assertEquals(1, wizard.getLives());
    }


}
