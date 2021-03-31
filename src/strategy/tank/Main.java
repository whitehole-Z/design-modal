package strategy.tank;

public class Main {
    public static void main(String[] args){
        Tank tank = new Tank(10);
        ShootStrategy s1 = new neucler();
        ShootStrategy s2 = new purple();
        Shoot.shoot(tank,s1);
        Shoot.shoot(tank,s2);
    }
}
