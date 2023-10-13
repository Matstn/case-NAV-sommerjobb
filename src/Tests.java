package src;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {

    User user1;
    User user2;
    User user3;
    User user4;
    User user5;
    Calculations calculations;

    
    @Test
    public void testEligibilityTrue(){
        user1 = new User(400000, 450000, 500000);
        calculations = new Calculations(user1);
        assertEquals(true, calculations.isEligibleForDagpenger());
    }

    @Test
    public void testEligibilityFalse(){
        user2 = new User(100000, 50000, 60000);
        calculations = new Calculations(user2);
        assertEquals(false, calculations.isEligibleForDagpenger());
    }

    @Test 
    public void testDagPengeGrunnlagOver6G(){
        user3 = new User(700000, 800000, 1200000);
        calculations = new Calculations(user3);
        assertEquals(2738, calculations.getDagSats()); //Sjekker at en ikke får mer enn 6G/260
    }

    @Test
    public void testValidExample(){ //Tester eksempelet fra mailen med oppgaven
        user4 = new User(400000, 450000, 500000);
        calculations = new Calculations(user4);
        assertEquals(1924, calculations.getDagSats());
    }

    @Test
    public void testAverageBiggerThanLastYearsSalary(){
        user5 = new User(600000, 580000, 500000);
        calculations = new Calculations(user5);
        assertEquals(2154, calculations.getDagSats());
    }
}
