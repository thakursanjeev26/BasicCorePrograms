package CoreProgram;

public class Nthharmonicnumber {
	static double Harmonic(int N) {
		float harmonic=1;
		for(int i=2;i<=N;i++) {
			harmonic+=(float)1/i;
		}
		return harmonic;
	}
	public static void main(String[]args) {
		int N = 15;
		
		System.out.print(Harmonic(N));
	}
	
}
		