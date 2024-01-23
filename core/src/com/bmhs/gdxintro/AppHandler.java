package com.bmhs.gdxintro;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.ScreenUtils;
import com.bmhs.gdxintro.gfx.assets.Tile;
import com.bmhs.gdxintro.gfx.utils.TileHandler;

public class AppHandler extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	TextureRegion subImg;
	int x, y;
	int[][] worldIntArray  = 	{{1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,0,0}, //done
								{0,1,1,1,1,1,1,0,0,1,6,3,0,1,1,1,1,0,3,6}, // done
								{3,0,1,1,1,1,0,3,6,0,6,6,3,0,0,0,0,3,6,6}, // done
								{6,3,0,0,0,0,3,6,6,0,6,6,3,3,3,4,4,4,4,6}, //done
								{6,3,3,3,3,4,4,4,4,0,6,6,3,0,0,4,6,6,0,0}, //done
			{6,3,0,0,0,4,4,0,0,0,0,3,3,3,4,9,9,9,9,4},
			{3,3,3,2,2,4,4,2,2,0,0,2,2,4,9,9,9,9,9,9},
			{2,2,3,4,4,4,7,4,4,4,0,2,2,6,9,9,9,9,9,9},
			{2,2,3,5,6,6,6,6,6,5,1,1,0,6,9,9,9,9,9,9},
			{0,2,3,5,5,5,5,5,5,5,1,1,0,6,8,9,9,9,9,8},
			{1,0,0,5,5,5,5,5,0,0,1,1,1,0,5,8,8,8,8,0},
			{1,1,1,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,1}};






	@Override
	public void create () {
		batch = new SpriteBatch();
		// delete these
		/*img = new Texture("primaryColorSheet.png");
		subImg = new TextureRegion(TileHandler.getTileHandler().getWorldTileArray().get(0).getTexture(), 64, 0, 128,128);
// a bunch of texture regions
*/

		x = 0;
		y = 0;


	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();

		for (int r = 0; r < worldIntArray.length; r++) {
			for (int c = 0; c < worldIntArray[r].length; c++) {
				batch.draw(TileHandler.getTileHandler().getWorldTileArray().get(worldIntArray [r][c]).getTexture(),c* Tile.ON_SCREEN_DEFAULT_WIDTH,Gdx.graphics.getHeight() - Tile.ON_SCREEN_DEFAULT_HEIGHT - (r*Tile.ON_SCREEN_DEFAULT_HEIGHT));

			}
		}

		/*

		for (int r = 0; r < Gdx.graphics.getHeight(); r+=64) {
			for (int c = 0; c< Gdx.graphics.getWidth(); c+=64) {
				batch.draw(TileHandler.getTileHandler().getWorldTileArray().get(x++).getTexture(),c,r);
				if (x>5) {
					x = 0;
				}
			}
		} */

		batch.end();

		checkInput();
	}

	public void checkInput () {
		/*
		if (Gdx.input.isKeyJustPressed(Input.Keys.W)) {
			y+=10;
			// y = y + 10
		}
		if (Gdx.input.isKeyJustPressed(Input.Keys.S)) {
			y-=10;
		}
		if (Gdx.input.isKeyJustPressed(Input.Keys.A)) {
			x -= 10;
		}
		if (Gdx.input.isKeyJustPressed(Input.Keys.D)) {
			x += 10;
		}



		System.out.print(Gdx.input.getX() + " " + Gdx.input.getY());

		x = Gdx.input.getX() - img.getWidth ()/2;
		y = Gdx.graphics.getHeight() - Gdx.input.getY() - img.getHeight()/2;

		*/
/*
		if (x < (Gdx.input.getX()- img.getWidth()/2)) {
			x+=10;
		}
		if (x > (Gdx.input.getX()- img.getWidth()/2)) {
			x-=10;
		}
		if (y > (Gdx.graphics.getHeight() - Gdx.input.getY()- img.getHeight()/2)) {
			y-=10;
		}
		if (y < (Gdx.graphics.getHeight() - Gdx.input.getY()- img.getHeight()/2)) {
			y+=10;
		}

*/
	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
