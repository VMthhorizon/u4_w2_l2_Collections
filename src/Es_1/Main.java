package Es_1;

import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Scanner;

import org.slf4j.Logger;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    static HashSet<String> words = new HashSet<>();
    static HashSet<String> duplicated = new HashSet<>();

    static int n = 0;
    static String parola;

    static void main(String[] args) {

        while (true) {
            try {
                logger.debug("Digita quanti elementi vuoi inserire o premi 0 per uscire: ");
                n = Integer.parseInt(scanner.nextLine());
                if (n == 0) break;
                logger.debug("Digita {} parole", n);

                for (int i = 0; i < n; i++) {
                    logger.debug("Inserisci la parola numero {}", i + 1);
                    if (!words.add(parola = scanner.nextLine())) {
                        duplicated.add(parola);
                    }
                }
                do {
                    logger.debug("Permi 1 per sapere le parole duplicate o 2 per sapere le parole distinte");
                    n = Integer.parseInt(scanner.nextLine());
                    switch (n) {
                        case 1 -> duplicatedWords();
                        case 2 -> uniqueWords();
                        default -> logger.debug("Numero inserito non valido!");
                    }
                } while (n != 1 && n != 2);
                words.clear();
                duplicated.clear();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void duplicatedWords() {
        if (!duplicated.isEmpty()) {

            logger.debug("Le parole duplicate sono: {}", duplicated);

        } else {

            logger.debug("Non ci sono parole duplicate");
        }
    }

    public static void uniqueWords() {
        if (!words.isEmpty()) {
            logger.debug("Il numero delle parole distinte sono: {}", words.size());
            logger.debug("L'elenco delle parole è {}", words);
        } else {
            logger.debug("Non ci sono parole distinte!");
        }
    }
}
