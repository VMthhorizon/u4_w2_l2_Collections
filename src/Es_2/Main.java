package Es_2;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static List<Integer> numList = new ArrayList<>();
    static List<Integer> fullList = new ArrayList<>();


    static void main(String[] args) {

        orderedList(4);
        completeList(numList);
        indexPosition(fullList, false);

    }

    static public void orderedList(int n) {
        for (int i = 0; i < n; i++) {
            numList.add(random.nextInt(0, 101));
        }
        System.out.println("La lista ordinata di " + n + " numeri è: ");
        numList.sort(Comparator.naturalOrder());
        System.out.println(numList);
    }

    static public void completeList(List<Integer> listaOriginale) {
        fullList.addAll(listaOriginale);

        List<Integer> reversedList = new ArrayList<>(listaOriginale);
        reversedList.sort(Comparator.<Integer>naturalOrder().reversed());
        fullList.addAll(reversedList);
        System.out.println(fullList);
    }

    static public void indexPosition(List<Integer> newList, boolean odds) {
        for (int i = 0; i < newList.size(); i++) {
            if (odds && i % 2 == 0) {
                System.out.println(newList.get(i));
            } else if (!odds && i % 2 != 0) {
                System.out.println(newList.get(i));
            }
        }
    }
}
