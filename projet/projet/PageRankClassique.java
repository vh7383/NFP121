package projet; 

public class PageRankClassique {

	public static void main(String... args) {
		Configuration configuration = CLIClassique.configuration(args);
		System.out.println(configuration);
		// Le reste du programme... Omis.
		configuration.epsilon = .001;
		System.out.println(configuration);

	}
}