import java.util.Scanner;
import java.util.Arrays;
class Student {
    private String name;
    private int height;
    private int weight;
    
    public Student(String name, int height, int weight) {
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
    
    public int getWeight() {
        return weight;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Student students[] = new Student[n];
        for(int i=0;i<n;i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students[i] = new Student(name, height, weight);
        }
        Arrays.sort(students, (a, b) -> a.getHeight() - b.getHeight());
        
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].getName() + " " +
                               students[i].getHeight() + " " +
                               students[i].getWeight());
        }
    }
}