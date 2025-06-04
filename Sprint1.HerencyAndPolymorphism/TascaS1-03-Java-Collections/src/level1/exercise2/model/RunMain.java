package level1.exercise2.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class RunMain {
    private List<Integer> firstList = new ArrayList<>();
    private List<Integer> secondList = new ArrayList<>();

    public void run() {
        fillList();
        reverseList();
        displayLists();
    }

    private void fillList() {
        firstList.addAll(Arrays.asList(1, 2, 3, 4, 5));
    }

    private void reverseList() {
        ListIterator<Integer> iterator = firstList.listIterator(firstList.size());
        while (iterator.hasPrevious()) {
            secondList.add(iterator.previous());
        }
    }

    private void displayLists() {
        System.out.println("Primera llista: " + firstList);
        System.out.println("Segona llista (ordre invers): " + secondList);
    }
}

