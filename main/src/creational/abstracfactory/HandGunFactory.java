package creational.abstracfactory;

/**
 * Created by Administrator on 2015/2/10.
 */
public class HandGunFactory extends ArmFactory {
    @Override
    public Gun createGun() {
        return new HandGun();
    }

    @Override
    public Bullet createBullet() {
        return new HandGunBullet();
    }
}
