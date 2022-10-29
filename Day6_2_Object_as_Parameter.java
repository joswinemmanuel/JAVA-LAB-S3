public class Day6_2_Object_as_Parameter {
    public static void main(String[] args) {
        Time T1 = new Time(6, 50, 30);
        System.out.print("T1 Time - ");
        T1.giveTime();

        Time T2 = new Time(5, 20, 30);
        System.out.print("T2 Time - ");
        T2.giveTime();
        
        T1.addTime(T2);
        System.out.print("T1 + T2 - ");
        T1.giveTime();
    }
}

public class Time {
    int hour, minute, second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void addTime(Time t) {
        hour += t.hour;

        int minute_sum = minute + t.minute;
        if(minute_sum >= 60) {
            hour++;
            minute_sum -= 60;
        }
        minute = minute_sum;
        

        int second_sum = second + t.second;
        if(second_sum >= 60) {
            minute++;
            second_sum -= 60;
        }
        second = second_sum;
    }

    void giveTime() {
        System.out.println(hour + " : " + minute + " : " + second);
    }
}

/*
T1 Time - 6 : 50 : 30
T2 Time - 5 : 20 : 30
T1 + T2 - 12 : 11 : 0
*/
