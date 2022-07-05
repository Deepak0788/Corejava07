package basic;
public class ForWithLabledContinue {
	public static void main(String[] args) {
		
	
int [][] table = {{1,2},{4,6},{3,5}};
outerFor: for (int[] row : table) {
	for (int n: row) {
		if (n%2 ==1) {
			continue outerFor;
		}
	}
	System.out.println(row[0]+","+row[1]);
}
}
}