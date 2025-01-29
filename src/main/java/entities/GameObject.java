package entities;

import graphics.Sprite;

public class GameObject {
    private float x;
    private float y;
    private Sprite sprite;

    public GameObject(float x, float y, Sprite sprite) {
        this.x = x;
        this.y = y;
        this.sprite = sprite;
    }

    public void Update() {
    }

    public void Render() {
    }
}
