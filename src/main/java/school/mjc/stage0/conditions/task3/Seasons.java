package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month==1||month==2||month==12){
            System.out.println("Winter");
        }else if(month<=11&&month>=9){
            System.out.println("Autumn");
        }else if(month<=8&&month>=6){
            System.out.println("Summer");
        }
        else if (month>=3&&month<=5){
            System.out.println("Spring");
        }
        else{
            System.out.println("wrong number!");
        }
    }
}
