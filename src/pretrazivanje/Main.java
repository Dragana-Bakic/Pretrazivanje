package pretrazivanje;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int niz[] = { -7, 2, 0, 50, 8 };

		Scanner s = new Scanner(System.in);
		System.out.println("Koji broj zelite da nadjete u nizu?");
		int x = s.nextInt();

		// Linear Search

		Linear_Search ls = new Linear_Search();

		System.out.print("Niz za linearnu proveru: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}

		int brojls = ls.linearSearch(niz, x);
		if (brojls == -1)
			System.out.println("\nTrazeni element se ne nalazi u nizu!");
		else
			System.out.println("\nTrazeni element " + x + " se nalazi na mestu u nizu sa indeksom " + brojls + ".");

		// Binary Search

		Binary_Search bs = new Binary_Search();

		int nizSortiran[] = bs.Sort(niz);
		System.out.print("\nNiz za binarnu proveru: ");
		for (int i = 0; i < nizSortiran.length; i++) {
			System.out.print(nizSortiran[i] + " ");
		}

		int brojbs = bs.binarySearch(nizSortiran, x);
		if (brojbs == -1)
			System.out.println("\nTrazeni element se ne nalazi u nizu!");
		else
			System.out.println("\nTrazeni element " + x + " se nalazi na mestu u nizu sa indeksom " + brojbs + ".");

		// Fibonacci Search

		Fibonacci_Search fs = new Fibonacci_Search();
		System.out.print("\nNiz za fibonaci proveru: ");
		for (int i = 0; i < nizSortiran.length; i++) {
			System.out.print(nizSortiran[i] + " ");
		}

		int brojfs = fs.fibonacciSearch(nizSortiran, x, nizSortiran.length);
		if (brojfs == -1)
			System.out.println("\nTrazeni element se ne nalazi u nizu!");
		else
			System.out.println("\nTrazeni element " + x + " se nalazi na mestu u nizu sa indeksom " + brojfs + ".");

		s.close();
	}

}
