package projet;

import java.util.Scanner;

public class CLIAutreExemple {

	public static ConfigurationAutreExemple configuration(String...args) {
		ConfigurationAutreExemple config = new ConfigurationAutreExemple();
		boolean finOptions = false;
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		
			while (i < args.length && ! finOptions) {
				String arg = args[i];
				switch (arg) {
					case "-c": // print the byte counts
						config.byte_ = config.countByte(scanner.next());
						break;
					case "-l": // print the newline counts
						config.line = config.countLine(scanner.next());
						break;
					case "-w": // print the word counts
						config.word = config.countWord(scanner.next());
						break;
					default:
						finOptions = arg.length() == 0 || arg.charAt(0) != '-';
						if (! finOptions) {
							System.out.println("Option inconnue : " + arg);
						}
					}
					i++;
				}
		return config;
	}
}