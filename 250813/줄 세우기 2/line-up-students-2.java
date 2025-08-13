import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student {
    private int no;
    private int height;
    private int weight;
    public Student(int no, int height, int weight) {
        this.no = no;
        this.height = height;
        this.weight = weight;
    }
    public int getNo(){
        return no;
    }
    public int getHeight(){
        return height;
    }
    public int getWeight(){
        return weight;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student students[] = new Student[n];
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students[i] = new Students((i+1), height, weight);
        }
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if(a.getHeight() != b.getHeight()) {
                    return a.getHeight() - b.getHeight();
                } else {
                    return b.getWeight() - a.getHeight();
                }
            }
        });

        for(int i=0;i<students.length;i++) {
            System.out.println(students[i].getHeight() + " " + students[i].getWeight() + " " +
            students[i].getNo());
        }
    }
}