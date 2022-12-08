import java.awt.Color;

public class Cercle {
	private Point centre;
	private double rayon;
	private Color couleur;
	
	public void translater(float x, float y) {
		this.centre.setX(x);
		this.centre.setY(y);
	}
	
	public Point getCentre() {
		return this.centre;
	}
	
	public double getRayon() {
		return this.rayon;
	}
	
	public double getDiametre() {
		return this.rayon*2;
	}
	
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	public void setDiametre(double diametre) {
		this.rayon = diametre/2;
	}
	
	public boolean contient(Point p) {
		return true;
	}
	
	public Color getCouleur() {
		return this.couleur;
	}
	
	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}
	
	public double aire() {
		return Math.pow(Math.PI*this.rayon,2);
	}
	
	public double perimetre() {
		return (Math.PI*this.rayon)*2;
	}
	
	public Cercle(Point centre, double rayon) {
		this.centre = centre;
		this.rayon = rayon;
		this.couleur = Color.blue;
	}
	
	public Cercle(Point p1, Point p2) {
		this.centre.setX((p1.getX()+p2.getX())/2);
		this.centre.setY((p2.getY()+p2.getY())/2);
		this.rayon = p1.distance(p2)/2;
		this.couleur = Color.blue;
	}
	
	public Cercle(Point p1, Point p2, Color couleur) {
		this.centre.setX((p1.getX()+p2.getX())/2);
		this.centre.setY((p2.getY()+p2.getY())/2);
		this.couleur = couleur;
	}
	
	public static Cercle creerCercle(Point p1, Point p2) {
		double rayon = p1.distance(p2);
		return new Cercle(p1, rayon);
	}
	
	public String toString() {
		return "C"+this.rayon+'@'+'('+this.centre.getX()+','+this.centre.getY()+')';
	}
}