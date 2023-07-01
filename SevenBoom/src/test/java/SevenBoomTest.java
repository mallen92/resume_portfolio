import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SevenBoomTest {

    @Test
    public void arrayWithNum7ShouldReturnBoom() {
        int[] myArr = {2, 4, 5, 7, 3, 3};
        SevenBoom sevenBoom = new SevenBoom();

        assertEquals("Boom!", sevenBoom.sayBoom(myArr));
    }

    @Test
    public void arrayWithNumContaining7ShouldReturnBoom() {
        int[] myArr = {12, 44, 15, 47, 23, 43};
        SevenBoom sevenBoom = new SevenBoom();

        assertEquals("Boom!", sevenBoom.sayBoom(myArr));
    }

    @Test
    public void arrayWithNo7ShouldReturnNo7Message() {
        int[] myArr = {12, 44, 15, 46, 23, 43};
        SevenBoom sevenBoom = new SevenBoom();

        assertEquals("There is no 7 in the array.", sevenBoom.sayBoom(myArr));
    }
}
