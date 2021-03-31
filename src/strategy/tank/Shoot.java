package strategy.tank;

public class Shoot {
    public static void shoot(Tank tank,ShootStrategy strategy){
        strategy.boom();
    }
}
