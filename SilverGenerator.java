package progectarch2;

import progectarch2.iGameItem;
import progectarch2.SilverRevard;


public class SilverGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new SilverReward();
    }
}

    
}
