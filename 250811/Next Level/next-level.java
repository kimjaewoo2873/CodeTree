import java.util.Scanner;

class CodeTree {
    private String id;
    public CodeTree() {
        this.id = "codetree";
    }
    public void setId(String id) {
        this.id = id;
    }
    public void printFun(){
        System.out.print("user " + id + " ");
    }
}

class Level {
    private int level;
    public Level() {
        this.level = 10;
    }
    public void setLevel(int level) { 
        this.level = level;
    }
    public void printFun() {
        System.out.print("lv " + level + " ");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.
        CodeTree ct = new CodeTree();
        Level lv = new Level();

        ct.printFun();
        lv.printFun();

        ct.setId(id);
        lv.setLevel(level);
        System.out.println();
        
        ct.printFun();
        lv.printFun();
    }
}