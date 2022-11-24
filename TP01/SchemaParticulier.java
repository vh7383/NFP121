
public class SchemaParticulier {

	public static void main(String[] args) {
		Point p1 = new Point(2.0, 3.0);
		Point p2 = new Point(9.0, 6.0);
		Point p3 = new Point(4.0, 11.0);
		Segment s12 = new Segment(p1, p2);
		Segment s23 = new Segment(p2, p3);
		Segment s36 = new Segment(p3, p1);
		double moyX = (p1.getX()+p2.getX()+p3.getX())/3;
		double moyY = (p1.getY()+p2.getY()+p3.getY())/3;
		Point barycentre = new Point(moyX, moyY);
		
		barycentre.afficher();
	}

}
