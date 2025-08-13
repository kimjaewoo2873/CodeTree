import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student {
    private String name;
    private int height;
    private double weight;
    public Student (String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public int getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String[] names = new String[n];
        int[] heights = new int[n];
        double[] weights = new double[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            heights[i] = sc.nextInt();
            weights[i] = sc.nextDouble();
        }
        // Please write your code here.
        Student students[] = new Student[n];
        for(int i=0;i<n;i++) {
            students[i] = new Student(names[i], heights[i], weights[i]);
        }

        Arrays.sort(students, new Comparator<Student> () {
            @Override
            public int compare(Student a, Student b) {
                return a.getName().compareTo(b.getName());
            }
        });

        System.out.println("name");
        for(int i=0;i<n;i++) {
            System.out.println(students[i].getName() + " " + students[i].getHeight() + " " +
            students[i].getWeight());
        }

        Arrays.sort(students, new Comparator<Student> () {
            @Override
            public int compare(Student a, Student b) {
                return b.getHeight() - a.getHeight();
            }
        });
        System.out.println();
        System.out.println("height");
        for(int i=0;i<n;i++) {
            System.out.println(students[i].getName() + " " + students[i].getHeight() + " " +
            students[i].getWeight());
        }
    }
}