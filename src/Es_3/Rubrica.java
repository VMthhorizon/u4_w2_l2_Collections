package Es_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Rubrica {

    static private final HashMap<String, String> rubricaTelefonica = new HashMap<>();

    static public void insertContatto(String name, String cellNumber) {
        rubricaTelefonica.put(name, cellNumber);
        System.out.println(rubricaTelefonica);
    }

    static public void removeContatto(String name) {
        rubricaTelefonica.remove(name);
        System.out.println(rubricaTelefonica);
    }

    static public void searchContattoByNumber(String cellNumber) {

        Set<String> names = rubricaTelefonica.keySet();
        for (String name : names) {
            if (rubricaTelefonica.get(name).equals(cellNumber)) {
                System.out.println(name);
            }
        }
    }

    static public void searchContattoByName(String nome) {
        Set<String> names = rubricaTelefonica.keySet();
        for (String name : names) {
            if (name.equals(nome)) {
                System.out.println(rubricaTelefonica.get(name));
            }
        }
    }


}
