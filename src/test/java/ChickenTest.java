import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChickenTest {
    Chicken chicken;

    @BeforeEach
    public void setUp() {
        chicken = new Chicken("Ginger", 3);
    }

    @Test
    public void hasName() {
        assertThat(chicken.getName()).isEqualTo("Ginger");
    }

    @Test
    public void canGetEggs(){
        assertThat(chicken.getEggs()).isEqualTo(3);
    }


}
