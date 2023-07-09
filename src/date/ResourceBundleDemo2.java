package date;

import java.util.Locale;
import java.util.ResourceBundle;

//.properties file ->
//key value
public class ResourceBundleDemo2 {

	public static void main(String[] args) {

		String language = "ge";
		String country = "GE";

		// create locale object and pass lang and country
		// germen
		Locale locle = new Locale(language, country);

		// create rb object

		// Bundle ->src/resources --> Bundle.properties file
		// en us/uk/ca INT ->INT_ge_GE.properties
		ResourceBundle r = ResourceBundle.getBundle("resources/INT", locle);

		String str = r.getString("money");

		System.out.println(str);

	}
}
