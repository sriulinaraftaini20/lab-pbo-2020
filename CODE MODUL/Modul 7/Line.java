public class Line
{
 	private Point begin;
 	private Point end;

	public Line(int x1, int y1, int x2, int y2)
 	{
 		begin = new Point(x1, y1);
 		end = new Point(x2, y2);
 	}

 	public Line(Point begin, Point end)
 	{
 		this.begin = begin;
 		this.end = end;
 	}

 	public Point getBegin()
 	{
 		return begin;
 	}

 	public void setBegin(Point begin)
 	{
 		this.begin = begin;
 	}

 	public Point getEnd()
 	{
 		return end;
 	}

 	public void setEnd(Point end)
 	{
 		this.end = end;
 	}
}

/*
Program diatas akan error karena
Class Line di atas belum lengkap jadi 
lengkapi dengan sisa method lainnya yaitu getBeginX, setBeginX,
getBeginY, setBeginY, getEndX, setEndX, getEndY, setEndY, toString 
dan getLength. Method getLength akan mengembalikan panjang dari 
garis/line. Gunakan rumus ukur panjang garis.

*/