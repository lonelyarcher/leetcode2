package mianjing;

import java.util.ArrayList;

class C{
	public int x;
	public int y;
	public C(int y, int x){
		this.x = x;
		this.y = y;
	}
}

public class DiagonalPrintMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		print(matrix);

	}
	
	public static void print(int[][] matrix){
		if(matrix==null) return;
		int row = matrix.length;
		if(row==0)return;
		int col = matrix[0].length;
		if(col==0) return;
		ArrayList<C> line = new ArrayList<C>();
		line.add(new C(0,0));
		System.out.print(matrix[0][0]);
		while(!line.isEmpty()){
			ArrayList<C> newLine = new ArrayList<C>();
			for(int i=0;i<line.size();i++){
				if(line.get(i).y<row-1) newLine.add(new C(line.get(i).y+1,line.get(i).x));
				if(i==line.size()-1 && line.get(i).x<col-1) newLine.add(new C(line.get(i).y,line.get(i).x+1));
			}
			line = newLine;
			System.out.println();
			for(C c:line) System.out.print(matrix[c.y][c.x]+" ");
		}
	}

}


