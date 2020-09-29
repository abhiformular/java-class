package q6;

public class Q6 {

	public static void main(String[] args) {	
		System.out.println(math.solve(1, 2, 3));
	} 
	
	public static class math{
		static int solve(int x, int y, int z) {
			int answer = (x + y) * z;
			return answer;
		}
	}

}
