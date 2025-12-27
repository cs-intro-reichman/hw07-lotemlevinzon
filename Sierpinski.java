/** Draws ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	// Draws a Sierpinski triangle of depth n on the standard canvass.
	public static void sierpinski (int n) {
		double x1 = 0.0;
		double y1 = 0.0;
		double x2 = 1.0;
		double y2 = 0.0;
		double x3 = 0.5;
		double y3 = 0.866;
		StdDraw.line(x1, y1, x2, y2);
		StdDraw.line(x1, y1, x3, y3);
        StdDraw.line(x2, y2, x3, y3);
		if (n > 0){
sierpinski(n, x1, x2, x3, y1, y2, y3);
		}
		
	}
	
	// Does the actual drawing, recursively.
	private static void sierpinski(int n, double x1, double x2, double x3,
		                                 double y1, double y2, double y3) {
	if (n==0) {
		StdDraw.line(x1, y1, x2, y2);
		StdDraw.line(x1, y1, x3, y3);
        StdDraw.line(x2, y2, x3, y3);
		return;
	}
	double midx1 = (x1 + x2) / 2.0;
	double midy1 = (y1 + y2) / 2.0;
	double midx2 = (x2 + x3) / 2.0;
	double midy2 = (y2 + y3) / 2.0;
	double midx3 = (x1 + x3) / 2.0;
	double midy3 = (y1 + y3) / 2.0;
    sierpinski(n-1, x1, midx1, midx3, y1, midy1, midy3);
	sierpinski(n-1, midx1, x2, midx2, midy1, y2, midy2);
	sierpinski(n-1, midx3, midx2, x3, midy3, midy2, y3);
	}
}
