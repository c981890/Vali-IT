package ee.valiit.stringcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class StringcalculatorApplication {

	public static void main(String[] args) {

		SpringApplication.run(StringcalculatorApplication.class, args);
		String s = "//;\n1;2";
		add(s);
	}

	public static int add(String s) {
		int tulemus = 0;
		if (s.equals("")) {
			return tulemus;
		}


		if (s.length() <= 3) {
			String[] massiiv = s.split(",|\\n");
			for (String element : massiiv) {
				tulemus += Integer.parseInt(element);
			}
			return tulemus;
		}

		if (s.length() > 3 && !(s.substring(0, 3).contains("//"))) {
			String[] massiiv = s.split(",|\\n");
			for (String element : massiiv) {
				tulemus += Integer.parseInt(element);
			}
		} else {
			String[] regexigaMassiiv = s.split("\n");
			System.out.println(Arrays.toString(regexigaMassiiv));
			String splitter = regexigaMassiiv[0].substring(2, 3);
			String[] massiiv = regexigaMassiiv[1].split(splitter);
			for (String element : massiiv) {
				tulemus += Integer.parseInt(element);
			}
		}
		return tulemus;
	}
}
