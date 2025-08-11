import java.util.Scanner;
class Item {
    private String id;
    private int code;
    public Item(){
        this.id = "codetree";
        this.code = 50;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getId(){
        return id;
    }
    public int getCode() {
        return code;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.
        Item item = new Item();
        System.out.println("product " + item.getCode() + " is " + item.getId());
        item.setId(id2);
        item.setCode(code2);
        System.out.println("product " + item.getCode() + " is " + item.getId());
    }
}