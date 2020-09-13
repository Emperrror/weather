public class weather {
    protected int[] temperature= new int[30];
     String month;

    weather(String month){
        this.month=month;
    }

    public  void randWeather() {

        for (int j = 0; j < 30; j++) {

            temperature[j] = (int) ((Math.random() * 26)-13);
        }
    }
    public void cold(){
        int coldest= temperature[0];
        for (int i = 1; i <30 ; i++) {
            if (coldest>temperature[i]) {
                coldest = temperature[i];
            }
        }
        System.out.println(coldest);
    }
    public void displayMon(){

        System.out.println("Month is "+month);
        for (int i = 0; i < 30; i++) {
            System.out.print(temperature[i]+"\t");
        }
    }

}