import java.util.ArrayList;
import java.util.Arrays;

public class subsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		subsetSum(new int[] {1, -10, 9, 3, 2, 50, 12, 13, -5}, 20, 0);
		subsetSum1(new int[] {1, -10, 9, 3, 2, 50, 12, 13, -5}, 20, 0, new ArrayList<Integer>());
	}
	
	public static void subsetSum(int prob[], int tgt, int sum)
	{
		if(prob.length == 0 || tgt == sum)
		{
			System.out.println("Found");
			System.exit(0);
		}
		int prob1[] = Arrays.copyOfRange(prob, 1, prob.length);
		
		subsetSum(prob1, tgt, sum + prob[0]);
		subsetSum(prob1, tgt, sum);
	}
	
	public static void subsetSum1(int prob[], int tgt, int sum, ArrayList<Integer> sol)
	{
		if(prob.length == 0) return;
		if(tgt == sum)
		{
			System.out.println("Found");
			System.out.println(sol);
			System.exit(0);
		}
		int prob1[] = Arrays.copyOfRange(prob, 1, prob.length);
		ArrayList<Integer> sol1 = new ArrayList<Integer>(sol);
		sol1.add(prob[0]);
		subsetSum1(prob1, tgt, sum + prob[0], sol1);
		subsetSum1(prob1, tgt, sum, sol);
	}

}
