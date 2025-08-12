import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student>{
    private int no;
    private int height;
    private int weight;
    public Student(int no, int height, int weight) {
        this.no = no;
        this.height = height;
        this.weight = weight;
    }
    public int getNo() {
        return no;
    }
    public int getHeight(){
        return height;
    }
    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Student student) {
        if(this.height != student.getHeight()) {
            return student.getHeight() - this.height;
        } else if(this.weight != student.getWeight()) {
            return student.getWeight() - this.weight;
        }
        return this.no - student.getNo();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
        }
        // Please write your code here.
        Student students[] = new Student[n];
        for(int i=0;i<n;i++){
            students[i] = new Student(i + 1, height[i], weight[i]);
        }

        Arrays.sort(students);

        for(int i=0;i<n;i++) {
            System.out.println(students[i].getHeight() + " " + 
            students[i].getWeight() + " " + students[i].getNo());
        }
    }
}