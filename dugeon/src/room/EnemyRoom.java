package room;

import model.Player;

public class EnemyRoom implements Room{
    private int enemyDamage;

    public EnemyRoom(int enemyDamage) {
        this.enemyDamage = enemyDamage;
    }

    @Override
    public void enter(Player player) {
        System.out.println("¡Un enemigo aparece!");
        player.takeDamage(enemyDamage);
    }
}
