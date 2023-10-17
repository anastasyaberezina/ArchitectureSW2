package progectarch2;

import progectarch2.iGameItem;
import progectarch2.GoldReward;

public class GoldGenerator extends ItemFabric{

        @Override
        public iGameItem createItem() {
            System.out.println("Создал новый сундук");
            return new GoldReward();
        }
    }

    
