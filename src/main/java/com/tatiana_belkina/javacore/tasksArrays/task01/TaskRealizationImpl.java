package src.main.java.com.tatiana_belkina.javacore.tasksArrays.task01;

import java.util.*;

public class TaskRealizationImpl implements TaskLogic {
    private final Scanner scanner = new Scanner(System.in);
    private final List<Integer> creatArray = new ArrayList<>();
    private final List<Integer> creatArrayCopy = new ArrayList<>();
    private final List<Integer> index = new ArrayList<>();

    private int getInput() {
        int number;
        number = scanner.nextInt();//InputMismatchException
        return number;
    }

    private void creatArrayInt() {
        System.out.println("Enter the size of the array");
        int size = getInput();
        int i = 0;
        while (i < size) {
            int num = getInput();
            if (Collections.frequency(creatArray, num) == 0) {
                creatArray.add(num);
                creatArrayCopy.add(num);
                i++;
            }
        }
        System.out.println("The array:" + creatArray.toString());
    }

    private void indexSearch() {
        System.out.println("Enter sum of 2 elements of the array");
        int sumOfElements = getInput();
        int difference;
        while (creatArrayCopy.size() > 0) {
            difference = sumOfElements - creatArrayCopy.get(0);
            if (creatArrayCopy.get(0) != difference && creatArrayCopy.contains(difference)) {
                index.add(creatArray.indexOf(creatArrayCopy.get(0)));
                index.add(creatArray.indexOf(difference));
                System.out.println(index);
                index.clear();
            }
            creatArrayCopy.remove(creatArrayCopy.get(0));
        }
    }

    @Override
    public void start() {
        creatArrayInt();
        indexSearch();
        scanner.close();
    }
}
