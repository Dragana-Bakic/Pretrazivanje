package pretrazivanje;

public class Fibonacci_Search {

	// kao i binarni, koristi se na sortiranim nizovima
	// koristeci fibonacijeve brojeve pretrazuje elemente niza
	// Razlika od binarnog: niz deli na nejednake delove; ne koristi operaciju
	// deljenja (/) da podeli opseg, vec + i -

	public static int min(int x, int y) {
		// metod za pronalazenje minimuma
		return (x <= y) ? x : y;
	}

	public static int fibonacciSearch(int niz[], int x, int n) {

		// x - trazeni element
		// n - velicina niza

		// Inicijalizacija fibonaci brojeva
		int f2 = 0;
		int f1 = 1;
		int f = f2 + f1;

		// f - najmanji fibonaci broj veci ili jednak n
		while (f < n) {
			f2 = f1;
			f1 = f;
			f = f2 + f1;
		}

		// Oznacavanje eliminisanog opsega od pocetka
		int e = -1;

		while (f > 1) {
			// provera da li je na f2 trazeni element

			int i = min(e + f2, n - 1);

			// Ukoliko je trazeni element veci od elementa sa indeksom f2, deli se niz od e
			// do i

			if (niz[i] < x) {
				f = f1;
				f1 = f2;
				f2 = f - f1;
				e = i;
			}

			// A ukoliko je veci, deli se niz na elemente sa indeksima posle i+1

			else if (niz[i] > x) {
				f = f2;
				f1 = f1 - f2;
				f2 = f - f1;
			}

			else
				return i;
		}

		// Provera da li je poslednji element trazeni
		if (f1 == 1 && niz[n - 1] == x)
			return n - 1;

		return -1; // ukoliko nije pronadjen element vraca vrednost -1
	}

}
