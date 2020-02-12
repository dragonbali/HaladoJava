package hu.me.krz.haladojava;

public class Point {

	private long x;
	private long y;
	private long z;
	
	public Point(long x, long y, long z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public long getX() {
		return x;
	}

	public long getY() {
		return y;
	}

	public long getZ() {
		return z;
	} 
	
	public Point transform(Point other){	
		long x = this.x + other.x;
		long y = this.y + other.y;
		long z = this.z + other.z;
	
		return new Point(x, y, z);		
	}
}
