package room;

import model.Player;

public class TreasureRoom implements Room {
    private String treasure;

    public TreasureRoom(String treasure) {
        this.treasure = treasure;
    }

    @Override
    public void enter(Player player) {
        System.out.println("¡Encontraste un tesoro: " + treasure + "!");
        player.addItem(treasure);
    }
}
