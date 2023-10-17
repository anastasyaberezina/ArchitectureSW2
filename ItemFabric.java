package progectarch2;

import progectarch2.iGameItem;

public abstract class ItemFabric {
    public void openReward() {
        iGameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract iGameItem createItem();
}