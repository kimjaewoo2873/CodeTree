import java.util.Scanner;
class Agent {
    private String name;
    private int score;
    public Agent(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        String name;
        int score;
        Agent arr[] = new Agent[5];
        
        for(int i=0;i<5;i++){
            name = sc.next();
            score = sc.nextInt();
            arr[i] = new Agent(name, score);
        }    

        Agent fucker = arr[0];
        for(int i=1;i<5;i++) {
            if(fucker.getScore() > arr[i].getScore())
                fucker = arr[i];
        }

        System.out.println(fucker.getName() + " " + fucker.getScore());
    }
}