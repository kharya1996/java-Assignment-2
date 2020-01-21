
public class PatternA {
	/*Pattern1:
	 
    1
   232
  34543
 4567654
567898765
     */
	
	public static void main(String[] args) {

		int i,j, k;
		for (i = 1; i <= 5; i++) {
			k = i;
			for (j = 1; j <= 9; j++) {
				if (j >= 6 - i && j <= 4 + i) {
					System.out.print(k);
					if (j < 5)
						k++;
					else
						k--;
				} else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
