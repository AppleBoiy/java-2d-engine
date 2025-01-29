package levels;

import java.util.HashMap;
import java.util.Map;

public class TileMap {
    private int[][] map;
    private Map<Integer, Tile> tiles;

    private int tileWidth, tileHeight;


    public TileMap(int tileWidth, int tileHeight) {
        this.tiles = new HashMap<>();
        this.tileWidth = tileWidth;
        this.tileHeight = tileHeight;
    }

    public void SetTile(int x, int y, int id) {
        map[x][y] = id;
    }

    public Tile GetTile(int x, int y) {
        return tiles.get(map[x][y]);
    }

    public void Render() {
    }

}
