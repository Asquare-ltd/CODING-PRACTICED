class Time {
    int hour, minute, second;

    Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    void displayTime() {
        System.out.println(hour + ":" + minute + ":" + second);
    }

    Time addTime(Time t) {
        int s = this.second + t.second;
        int m = this.minute + t.minute + s / 60;
        int h = this.hour + t.hour + m / 60;
        s = s % 60;
        m = m % 60;
        return new Time(h, m, s);
    }
}

public class TimeMain {
    public static void main(String[] args) {
        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(3, 30, 30);
        Time sum = t1.addTime(t2);
        sum.displayTime();
    }
}
