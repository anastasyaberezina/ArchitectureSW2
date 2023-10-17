package progectarch2;

import progectarch2.SilverGenerator;
import progectarch2.GoldGenerator;
import progectarch2.ItemGenerator;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Random random = ThreadLocalRandom.current();
        List<ItemFabric> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new SilverGenerator());

        for (int i = 0; i < 10; i ++){
            int idx = Math.abs(random.nextInt() % 2) == 0 ? 0 : 1;
            ItemFabric itemGenerator = generatorList.get(idx);
            itemGenerator.openReward();
        }
    }
}
