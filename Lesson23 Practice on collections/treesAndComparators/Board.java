package treesAndComparators;

public class Board implements Comparable<Board>{
	
	private int height;
	private int width;
	private int thickness;
	
	public Board(int height, int width, int thickness) {
		this.height = height;
		this.width = width;
		this.thickness = thickness;
	}
	
	public int getHeight() {
		return height;
	}

	public int getThickness() {
		return thickness;
	}
	
	@Override
	public int compareTo(Board o) {
		//return positive if this is greater than o
		//return negative if this is lesser than o
		//return 0 if they are equal
		//or.. short way
		if(this.width == o.width){
			return this.thickness - o.thickness;
		}
		return this.width - o.width;
	}
	
	
	@Override
	public String toString() {
		return "Board [height=" + height + ", width=" + width + ", thickness=" + thickness + "]";
	}
}
