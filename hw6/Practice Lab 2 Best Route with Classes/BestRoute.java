import java.util.Scanner;


class Point2D {
	private double x, y;
	private String label = "";
	
	public double distance(Point2D point2) { return Math.sqrt(Math.abs(point2.getX()-this.x)*Math.abs(point2.getX()-this.x) + Math.abs(point2.getY()-this.y)*Math.abs(point2.getY()-this.y)); }
	
	public double getX() { return x; }
	
	public double getY() { return y; }
	
	public String getLabel() { return label; }
	
	public String toString() { return ""+getLabel()+"("+x+","+y+")"; }
	
	public Point2D() {
		label = "";
		x = 0;
		y = 0;
	}
	
	public Point2D(String label, double x, double y) {
		this.label = label;
      this.x = x;
		this.y = y;
	}
	
	public Point2D(Scanner scan) {
		this.label = scan.next();
		this.x = scan.nextDouble();
		this.y = scan.nextDouble();
	}
	
	public Point2D(String label, Scanner scan) {
		this.label = label;
		this.x = scan.nextDouble();
		this.y = scan.nextDouble();
	}
}



class Path3 {
   private String label;
   private Point2D point1, point2, point3;
   
   public String toString() {
      return point1.getLabel()+"-"+point2.getLabel()+"-"+point3.getLabel();
   }
   
   public double length() {
      return point1.distance(point2)+point2.distance(point3);
   }
   
   public String getLabel() {
      return label;
  }
  
  public Path3(String label, Point2D point1, Point2D point2, Point2D point3) {
      this.label = label;
      this.point1 = point1;
      this.point2 = point2;
      this.point3 = point3;
  }
  
  public Path3(Scanner scan) {
      this.label = scan.next();
      this.point1 = new Point2D(label, scan);
      this.point2 = new Point2D(label, scan);
      this.point3 = new Point2D(label, scan);
  }
}

public class BestRoute {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Point2D firstPoint = new Point2D(scan);
      Point2D secondPointA = new Point2D(scan);
      Point2D secondPointB = new Point2D(scan);
      Point2D lastPoint = new Point2D(scan);
      
      Path3 path1 = new Path3("path1", firstPoint, secondPointA, lastPoint);
      Path3 path2 = new Path3("path2", firstPoint, secondPointB, lastPoint);
      
      System.out.print("Best Route: ");
      if(path1.length() < path2.length())
         System.out.println(path1.toString());
      else
         System.out.println(path2.toString());
   }
}