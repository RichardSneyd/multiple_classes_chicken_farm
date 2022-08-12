import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FarmTest {
    private Farm farm;

    private Chicken getMockChicken(){
        Chicken mockChicken = mock(Chicken.class);
        when(mockChicken.getEggs()).thenReturn(3);
        return mockChicken;
    }

    @BeforeEach
    public void setup() {
        this.farm = new Farm();
        this.farm.addChicken(this.getMockChicken());
        this.farm.addChicken(this.getMockChicken());
        System.out.println(farm.getChickens());
    }

    @Test
    public void canGetChickens() {
        assertThat(farm.getChickens().size()).isEqualTo(2);
    }

    @Test
    public void addChicken() {
        Chicken chicken = this.getMockChicken();
        farm.addChicken(chicken);
        assertThat(farm.getChickens().size()).isEqualTo(3);
    }

    @Test
    public void canGetEggs(){
        assertThat(farm.collectEggs()).isEqualTo(6);
    }
}
