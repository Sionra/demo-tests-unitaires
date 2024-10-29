import fr.diginamic.utils.StringException;
import org.junit.jupiter.api.Test;

import static fr.diginamic.utils.StringUtils.levenshteinDistance;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class StringUtilsTest {

    @Test
    public void testChat(){
        assertEquals(1,levenshteinDistance("chat", "chats"));
    }

    @Test
    public void testMachin(){
        assertEquals(1,levenshteinDistance("machins", "machine"));
    }
    @Test
    public void testAviron(){
        assertEquals(1,levenshteinDistance("aviron", "avion"));
    }
    @Test
    public void testDistance(){
        assertEquals(2,levenshteinDistance("distance", "instance"));
    }
    @Test
    public void testChien(){
        assertEquals(2,levenshteinDistance("Chien", "Chine"));
    }
    @Test()
    public void testNull(){
        try {
            assertEquals(2, levenshteinDistance(null, "Patate"));
        } catch (StringException e){
            return;
        }
    }
}
