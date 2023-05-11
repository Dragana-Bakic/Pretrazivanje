package pretrazivanje;

public class Linear_Search {

	// krece od jednog kraja i prolazi kroz svaki sledeci element dok ne pronadje
	// trazeni
	// ukoliko se ne pronadje element vraca vrednost -1

	public static int linearSearch(int niz[], int x) {

		// x - vrednost trazenog elementa

		int n = niz.length;
		for (int i = 0; i < n; i++) {
			if (niz[i] == x)
				return i; // ukoliko se pronadje element vraca indeks
		}
		return -1;
	}

}
