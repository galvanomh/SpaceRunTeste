package game;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Tiro {

	private Image tiroImg;
	private int x;
	private int y;
	private int altura;
	private int largura;
	
	private boolean isVisivel;
	
	private static final int COMPRIMENTO_TELA = 600;
	private static final int VELOCIDADE_TIRO = 2;
	
	public Tiro(int x, int y){
		
		this.x = x;
		this.y = y;
		
		this.altura = tiroImg.getHeight(null);
		this.largura = tiroImg.getWidth(null);
		
		ImageIcon referencia = new ImageIcon("res\\tiro.png");
		tiroImg = referencia.getImage();
		
		isVisivel = true;
		
	}
	
	public void mover() {
	
		this.y -= VELOCIDADE_TIRO;
		if(this.y > COMPRIMENTO_TELA) {
			isVisivel = false;		
		}	
			
	}
	
	public boolean isVisivel() {
	    return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}

	public Image getImagem() {
		return tiroImg;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public Rectangle getBounds() {
		return new Rectangle (x, y, largura, altura);
	}
	
}
