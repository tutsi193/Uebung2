package p1;

import java.util.Scanner;

public class P1_main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String zeile = new String();
		zeile = s.nextLine();
		System.out.println(zeile);
		s.close();
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