import java.util.Random;
import java.util.Scanner;

public class weather {
int [] temperature = new int[30];
String month;

 weather(String month){
    month = this.month;
     for (int i = 0; i < 30; i++) {
         Random random = new Random();
         temperature[i] = random.nextInt(20);
     }
   }
   public void calendar(){
        for (int i = 0; i < 30 ; i++) {
            System.out.print(temperature[i] + "\t");

        }
       System.out.println();
    }
    public int average(){
     int av1=0;
     int av3=0;
     int av2=0;
        for (int i = 0; i < 30; i++) {
            av1 += temperature[i];
        }
        av1/=30;
        av2 = Math.abs(temperature[0]- av1);
        for (int i = 1; i < 30; i++) {
            if(Math.abs(temperature[i]-av1)>av2){
                av2 =Math.abs(temperature[i]-av1);
                av3 = i;
            }
        }
        System.out.println("Средняя температура: "+ av2);
        return av3;
        }
}