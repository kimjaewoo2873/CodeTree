import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Person {
    private String name;
    private int height;
    private int weight;
    public Person(String name, int height, int weight) {
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
        Person person[] = new Person[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            // Please write your code here.
            person[i] = new Person(name, height, weight);
        }

        Arrays.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) { 
                if(a.getHeight() != b.getHeight()) {
                    return a.getHeight() - b.getHeight();
                } else {
                    return b.getWeight() - a.getWeight();
                }
            }
        });

        for(int i=0;i<person.length;i++) {
            System.out.println(person[i].getName() + " " + 
            person[i].getHeight() + " " + person[i].getWeight());
        }
    }
}