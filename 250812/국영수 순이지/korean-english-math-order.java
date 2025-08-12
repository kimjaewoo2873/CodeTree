import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    private String name;
    private int kor;
    private int eng;
    private int mat;
    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }
    public String getName(){
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
    
    @Override
    public int compareTo(Student student) {
        if(this.kor != student.getKor())
            return student.getKor() - this.kor;
        if(this.eng != student.getEng())
            return student.getEng() - this.eng;
    
        return student.getMat() - this.mat;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] korean = new int[n];
        int[] english = new int[n];
        int[] math = new int[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            korean[i] = sc.nextInt(); 
            english[i] = sc.nextInt();
            math[i] = sc.nextInt();
        }
        // Please write your code here.
        Student students[] = new Student[n];
        for(int i=0; i<n ;i++) {
            students[i] = new Student(names[i], korean[i], english[i], math[i]);
        }

        Arrays.sort(students);
      
        for(int i=0;i<n;i++) {
            System.out.println(students[i].getName() + " " + students[i].getKor() + " " +
            students[i].getEng() + " " + students[i].getMat());
        }
    }
}