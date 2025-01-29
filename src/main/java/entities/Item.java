package entities;

import graphics.Sprite;

public class Item extends GameObject {
    private String name;
    private String type;
    private String description;
    private int value;

    public Item(float x, float y, Sprite sprite, String name, String type, String description, int value) {
        super(x, y, sprite);
        this.name = name;
        this.type = type;
        this.description = description;
        this.value = value;
    }

    public void Use() {
    }

    public void Drop() {
    }

    public void OnPickup(Player player) {
    }
}
