package levels;

import graphics.Texture;

public class Tile {
    private int id;
    private String type;
    private Texture texture;
    private boolean walkable;
    private boolean breakable;

    public Tile(int id, String type, Texture texture, boolean walkable, boolean breakable) {
        this.id = id;
        this.type = type;
        this.texture = texture;
        this.walkable = walkable;
        this.breakable = breakable;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Texture getTexture() {
        return texture;
    }

    public boolean isWalkable() {
        return walkable;
    }

    public boolean isBreakable() {
        return breakable;
    }

    public void setWalkable(boolean walkable) {
        this.walkable = walkable;
    }

    public void setBreakable(boolean breakable) {
        this.breakable = breakable;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    void Render(float x, float y) {
        texture.Bind();
        // Render tile
        texture.Unbind();
    }
}
