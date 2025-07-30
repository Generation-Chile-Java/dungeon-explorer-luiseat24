package room;

import model.Player;

public class EmptyRoom implements Room{
    @Override
    public void enter(Player player) {
        System.out.println("La sala está vacía");
    }
}
