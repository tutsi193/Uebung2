package h3;

public class H3_main {
	public static void main(String[] args) {
		
		int i = 80;
		int j = 90;
		int k = -10;
		
		boolean a;
		boolean b;
		boolean c;
		
		a = (i > j);
		b = (i > 200);
		c = (j > 100);
		
		if (a) {
			if (b) {
				if (c) {
					k = 3;
				}else k = 2;
			}else if (c) {
				k = 4;
			}else k = 1;
		}else if (b) {
			if (c) {
				k = -10;
			}else k = -10; //(c kann nicht falsch sein, wenn a falsch aber b wahr ist)
		}else if (c) {
			k = -10;
		}else k = 4;
		//System.out.println(k);
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
