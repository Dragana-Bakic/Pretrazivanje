package pretrazivanje;

public class Binary_Search {

	// koristi se na sortiranim nizovima
	// deli interval pretrage na pola

	public int binarySearch(int niz[], int x) {
		int po = 0, n = niz.length - 1;
		while (po <= n) {
			int s = po + (n - po) / 2;

			// Provera da li je element na sredini
			if (niz[s] == x)
				return s;

			// Ukoliko je x veci, ignorise se leva polovina niza
			if (niz[s] < x)
				po = s + 1;

			// Ukoliko je x manji, ignorise se desna polovina niza
			else
				n = s - 1;
		}

		return -1; // ukoliko nema elementa u nizu vraca vrednost -1
	}

	public int[] Sort(int niz[]) { // metoda za sortiranje niza 

		int n = niz.length;
		for (int i = 0; i < n - 1; i++) {
			int max = i;
			for (int j = i + 1; j < n; j++) {
				if (niz[j] < niz[max]) {
					max = j;
					int zamena = niz[max];
					niz[max] = niz[i];
					niz[i] = zamena;
				}
			}
		}
		return niz;
	}

}
