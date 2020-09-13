import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        weather Jan = new weather("January");
        weather Feb = new weather("February");
        weather Mar = new weather("March");
        weather Apr = new weather("April");
        weather May = new weather("May");
        weather Jun = new weather("June");
        weather Jul= new weather("July");
        weather Aug = new weather("August");
        weather Sep = new weather("September");
        weather Oct = new weather("October");
        weather Nov = new weather("November");
        weather Dec = new weather("December");

        Jan.randWeather();
        Feb.randWeather();
        Mar.randWeather();
        Apr.randWeather();
        May.randWeather();
        Jun.randWeather();
        Jul.randWeather();
        Aug.randWeather();
        Sep.randWeather();
        Oct.randWeather();
        Nov.randWeather();
        Dec.randWeather();

        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("What do you want to know:\n1.");
            byte answer = scan.nextByte();
            if (answer == 1) {
                Jan.displayMon();
                Feb.displayMon();
                Mar.displayMon();
                Apr.displayMon();
                May.displayMon();
                Jun.displayMon();
                Jul.displayMon();
                Aug.displayMon();
                Sep.displayMon();
                Oct.displayMon();
                Nov.displayMon();
                Dec.displayMon();
            // }
            //else if (answer==2){
                Jan.cold();
                Feb.cold();
                Mar.cold();
                Apr.cold();
                May.cold();
                Jun.cold();
                Jul.cold();
                Aug.cold();
                Sep.cold();
                Oct.cold();
                Nov.cold();
                Dec.cold();


            }
        }catch (Exception e) {
        }
    }

}