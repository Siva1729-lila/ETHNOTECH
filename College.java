package arrays;

import java.util.LinkedList;

public class College {

    public static void main(String[] args) {

        LinkedList<Integer> students = new LinkedList<>();

        int[] ids = {101, 102, 103, 101, 104};

        for (int id : ids) {

            if (!students.contains(id)) {
                students.add(id);
            } else {
                System.out.println("Duplicate ID " + id + " not allowed");
            }
        }

        System.out.println("Registered Students: " + students);
    }
}