package idioma;

import java.util.Locale;

public class TesteUserLocale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale loc = Locale.getDefault();
        System.out.println (loc.getDisplayLanguage()); // imprime "Português"
        System.out.println (loc.getLanguage()); // imprime "pt"
	}

}
