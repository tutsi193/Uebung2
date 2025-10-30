package h2;

public class H2_main {
	public static void main (String[] args) {
		
		int i = 2;
		int j = 3;
		int k =	4;
		int min = 1;
		int max = 10;
		
		if (i < j) {
			if (i < k) {
				min = i;
			}else {
				min = k;
			}
		}else if (j < k) {
			min = j;
		}else {
			min = k;
		}
		System.out.println("Kleinster Wert: " + min);
		
		if (i > j ) {
			if (i > k) {
				max = i;
			}else {
				max = k;
			}
		}else if (j > k) {
			max = j;
		}else {
			max = k;
		}
		System.out.println("Groesster Wert: " + max);
	}
}
/*echo "# Uebung2" >> README.md
git init
git add .
git commit -m "first commit"
git branch -M main
git remote set-url origin https://github.com/tutsi193/Uebung2.git
git push -u origin main
*/

//git remote add origin https://github.com/tutsi193/Uebung2.git