
public class Permutations {

	private static void permutations(String prob, String sol) {
		if(prob == null || prob.length() == 0) {
			System.out.println(sol);
			return;
		}
		for(int i=0; i < prob.length(); i++) {
			permutations(prob.substring(0, i) + prob.substring(i+1), sol+prob.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutations("abcd","");
	}

}
