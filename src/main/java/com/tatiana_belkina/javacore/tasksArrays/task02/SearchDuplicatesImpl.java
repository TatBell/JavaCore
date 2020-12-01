package src.main.java.com.tatiana_belkina.javacore.tasksArrays.task02;

import java.util.*;

public class SearchDuplicatesImpl implements LogicSearchDuplicates {

    private final Scanner scanner = new Scanner(System.in);
    private final Field field = new Field();

    private int getInput() {
        int number = 0;
        number = scanner.nextInt();//InputMismatchException
        return number;
    }

    private List<Integer> creatArrayInt() {
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the size of the array");
        int size = getInput();
        int i = 0;
        System.out.println("Enter the elements of the array");
        while (i < size) {
            int num = getInput();
            list.add(num);
            i++;
        }
        scanner.close();
        return list;
    }

    private void searchDuplicate(List<Integer> list) {
        Map<Integer, Integer> treeMap = new TreeMap<>();
        int count;
        for (int i = 0; i < list.size(); i++) {
            count = Collections.frequency(list, list.get(i));
            if (count > 1) {
                treeMap.put(list.get(i), count);
            }
        }
        if (treeMap.size() > 0) {
            System.out.println("Result: " + true);
            for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
                System.out.println("Число " + entry.getKey() + " повторяется " + entry.getValue() + " раза");
            }
        } else {
            System.out.println("Result: " + false);
            System.out.println("Дубликатов нет");
        }
    }

    @Override
    public void start() {
        field.setArraylist(creatArrayInt());
        field.showArray();
        searchDuplicate(field.getArraylist());
    }
}
