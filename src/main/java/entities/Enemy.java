package entities;

import graphics.Sprite;

public class Enemy extends GameObject {
    private float health;
    private float speed;

    public Enemy(float x, float y, Sprite sprite) {
        super(x, y, sprite);
    }

    public void FollowPlayer() {
    }

    private void Patrol() {
    }

    private void Attack() {
    }

    public void Update() {
        FollowPlayer();
    }

}
