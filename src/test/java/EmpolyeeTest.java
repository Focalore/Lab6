import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class EmpolyeeTest {
    @Test
    public void testCreation() {
        assertEquals((new Employee(12, 12, "person")).toString(), "ID: " + 12 + "\n age: " + 12 + "\n Position: " + "person" + ".");
    }

    @Test
    public void testBirthday() {
        Employee I = new Employee(12, 12, "person");
        I.birthday();
        assertEquals(I.age, 13);
    }

    @Test
    public void testWorking() {
        Employee I = new Employee(12, 12, "person");
        I.work();
        assertEquals(I.position, "person");
        //System.out.println(I.work());
    }

    @Test
    public void testGotFired(){
        Employee I = new Employee(12,12,"n/a");
        I.gotFired();
        assertEquals(I.position, "n/a");
        assertEquals(I.ID, 0);
        assertThrows(IllegalWorkerException.class, () -> I.work());
    }

}


//todo