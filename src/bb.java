
public class bb {
	
	static int[][] A(int[][] B){
		int i=0,j=0;
		
		if(i>=10)
			return null;
		
		if(i<10) {
			if(j<20) {
				B[i][j] = B[i][j]+5;
				System.out.print(B[i][j] );
				j++;
				return A(B);
			}
			j=0;
			i++;
			return A(B);
		}
		return A(B);
	}

}
