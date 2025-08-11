import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class Person {
    private String name;
    private String address;
    private String region;
    public Person(String name, String address, String region){
        this.name = name;
        this.address = address;
        this.region = region;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getRegion() {
        return region;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        String[] addresses = new String[n];
        String[] regions = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            addresses[i] = sc.next();
            regions[i] = sc.next();
        }
        // Please write your code here.
        ArrayList<Person> person = new ArrayList<>();
        for(int i=0;i<n;i++){
            Person p = new Person(names[i], addresses[i], regions[i]);
            person.add(p);
        }
        Collections.sort(person, (a, b) -> b.getName().compareTo(a.getName()));

        System.out.println("name " + person.get(0).getName());
        System.out.println("addr " + person.get(0).getAddress());
        System.out.println("city " + person.get(0).getRegion()); 
    }
}