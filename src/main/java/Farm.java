import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Chicken> chickens = new ArrayList<>();

    public void addChicken(Chicken chicken) {
      chickens.add(chicken);
    }

    public List<Chicken> getChickens() {
        return chickens;
    }

    public int collectEggs(){
        int total = 0;
        for(Chicken chicken : chickens) {
            total += chicken.getEggs();
        }
        return total;
    }
}
