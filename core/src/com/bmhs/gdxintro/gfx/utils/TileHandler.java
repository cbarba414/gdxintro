package com.bmhs.gdxintro.gfx.utils;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.bmhs.gdxintro.gfx.assets.Tile;
import com.bmhs.gdxintro.gfx.assets.WorldTile;
import com.badlogic.gdx.utils.Array;
public class TileHandler {

   public static TileHandler tileHandler = null;

   private int spriteOnSheetHeight, spriteOnSheetWidth;

   private String primaryColorSheetPath = "primaryColorSheet.png";

   private Array <WorldTile> worldTileArray;


    private TileHandler () {
        // singleton, only one object, no one else will make an object
        worldTileArray = new Array <>();

        spriteOnSheetHeight = Tile.ON_SCREEN_DEFAULT_HEIGHT;
        spriteOnSheetWidth = Tile.ON_SCREEN_DEFAULT_WIDTH;

        Texture tempTexture = new Texture(primaryColorSheetPath);

        TextureRegion tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*2, spriteOnSheetHeight*0, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile blackWorldTile = new WorldTile (tempRegion, 0, "black");
        worldTileArray.add (blackWorldTile);


        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*1, spriteOnSheetHeight*0, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile whiteWorldTile = new WorldTile (tempRegion, 1, "white");
        worldTileArray.add (whiteWorldTile);


        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*2, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile darkBrownWorldTile = new WorldTile (tempRegion, 2, "darkBrown");
        worldTileArray.add (darkBrownWorldTile);


        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*3, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile brownWorldTile = new WorldTile (tempRegion, 3, "brown");
        worldTileArray.add (brownWorldTile);


        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*4, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile beigeWorldTile = new WorldTile (tempRegion, 4, "beige");
        worldTileArray.add (beigeWorldTile);


        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*5, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile lightPinkWorldTile = new WorldTile (tempRegion, 5, "lightPink");
        worldTileArray.add (lightPinkWorldTile);


        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*6, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile darkBeigePinkWorldTile = new WorldTile (tempRegion, 6, "darkBeigePink");
        worldTileArray.add (darkBeigePinkWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*7, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile brightPinkWorldTile = new WorldTile (tempRegion, 7, "brightPink");
        worldTileArray.add (brightPinkWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*8, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile darkerPinkWorldTile = new WorldTile (tempRegion, 8, "darkerPink");
        worldTileArray.add (darkerPinkWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*9, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile darkestPinkWorldTile = new WorldTile (tempRegion, 9, "darkestPink");
        worldTileArray.add (darkestPinkWorldTile);
    }
    public static TileHandler getTileHandler () {
        if (tileHandler == null) {
            tileHandler = new TileHandler();
        }
        //getter
        return tileHandler;
    }
    public Array <WorldTile> getWorldTileArray () {
        return worldTileArray;
    }


}
