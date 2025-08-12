import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student>{
    private String name;
    private int kor;
    private int eng;
    private int mat;
    private int sum;
    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        sum = kor + eng + mat;
    }
    public String getName() {
        return name;
    }
    public int getKor() {
        return kor;
    }
    public int getEng() {
        return eng;
    }
    public int getMat() {
        return mat;
    }
    public int getSum() {
        return sum;
    }
    @Override
    public int compareTo(Student student) {
        if(this.sum != student.getSum()) 
            return this.sum - student.getSum();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();
        }
        // Please write your code here.
        Student students[] = new Student[n];
        for(int i=0;i<n;i++){
            students[i] = new Student(name, score1, score2, score3);
        }
        Arrays.sort(students);

        for(int i=0;i<n;i++){
            System.out.println(students[i].getName() + " " + 
            students[i].getKor() + " " + students[i].getEng() + " " 
            + students[i].getMat());
        }
    }
}