package src.main.java.com.tatiana_belkina.javacore.tasksArrays.task02;

import java.util.List;

public class Field {

    private List<Integer> arraylist;

    public List<Integer> getArraylist() {
        return arraylist;
    }

    public void setArraylist(List<Integer> arraylist) {
        this.arraylist = arraylist;
    }

    public void showArray() {
        System.out.println("Array: " + getArraylist());
    }

}
