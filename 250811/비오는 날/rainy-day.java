import java.util.Scanner;
import java.util.ArrayList;
class Data {
    private String date;
    private String day;
    private String weather;
    public Data(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
    public String getDate(){
        return date;
    }
    public int getYear(){
        String str[] = date.split("-");
        int year = Integer.parseInt(str[0]);
        return year;
    }
    public int getMonth(){
        String str[] = date.split("-");
        int month = Integer.parseInt(str[1]);
        return month;
    }
    public int getDays(){
        String str[] = date.split("-");
        int days = Integer.parseInt(str[0]);
        return days;
    }
    public String getDay() {
        return day;
    }
    public String getWeather() {
        return weather;
    }
}
public class Main {
    public static void closeDay(ArrayList<Data> list) {
        Data min = list.get(0);
        Data target;
        for(int i = 1; i < list.size(); i++) {
            target = list.get(i);
            if(min.getYear() > target.getYear()) {
                min = target;
            } else if(min.getYear() == target.getYear()) {
                if(min.getMonth() > target.getMonth()) {
                    min = target;
                } else if(min.getMonth() == target.getMonth()) {
                    if(min.getDays() > target.getDays()) {
                        min= target;
                    }
                }
            }
        }
        System.out.println(min.getDate() + " " + min.getDay() + " " + min.getWeather());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Data> dataList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            if(weather.equals("Rain")) {
                Data data = new Data(date, day, weather);
                dataList.add(data);
            }
        }
       closeDay(dataList);

    }
}