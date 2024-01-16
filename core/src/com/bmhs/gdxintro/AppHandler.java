package com.bmhs.gdxintro;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;
public class AppHandler extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	TextureRegion subImg;
	int x, y;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("primaryColorSheet.png");
		subImg = new TextureRegion(img, 64, 0, 128,128);

		x=0;
		y=0;
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(subImg,x ,y);
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


	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
