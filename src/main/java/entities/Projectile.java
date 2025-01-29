package entities;

import graphics.Sprite;

public class Projectile extends GameObject {
    private float damage;
    private float speed;

    public Projectile(float x, float y, Sprite sprite, float damage, float speed) {
        super(x, y, sprite);
        this.damage = damage;
        this.speed = speed;
    }

    public void Move() {
    }

    private void OnCollision() {
    }
}
