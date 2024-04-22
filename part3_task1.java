//Implement a method that takes a List as an argument and removes every second element from the list, then prints the resulting list.

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class part3_task1 {

    public static <T> void removeEverySecondElement(List<T> inputList) {
        Iterator<T> iterator = inputList.iterator();
        boolean removeNext = false;

        while (iterator.hasNext()) {
            iterator.next();
            if (removeNext) {
                iterator.remove();
            }
            removeNext = !removeNext;
        }
    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        System.out.println("Original list: " + myList);
        removeEverySecondElement(myList);
        System.out.println("Modified list: " + myList);
    }
}

