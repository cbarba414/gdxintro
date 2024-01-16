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



        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*3, spriteOnSheetHeight*0, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile whiteWorldTile = new WorldTile (tempRegion, 1, "white");
        worldTileArray.add (whiteWorldTile);



        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*2, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile redWorldTile = new WorldTile (tempRegion, 0, "red");
        worldTileArray.add (redWorldTile);



        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*3, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile orangeWorldTile = new WorldTile (tempRegion, 0, "orange");
        worldTileArray.add (orangeWorldTile);



        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*4, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile yellowWorldTile = new WorldTile (tempRegion, 0, "yellow");
        worldTileArray.add (yellowWorldTile);






    }
    public static TileHandler getTileHandler () {
        if (tileHandler == null) {
            tileHandler = new TileHandler();
        }
        //getter
        return tileHandler;
    }

}
