/**
 * Created by ok on 14-6-15.
 */
public class Main {
    public static void main(String[] args) {
        HeadHunter hh = new HeadHunter();
        hh.registerObserver(new JobSeeker("Mike"));
        hh.registerObserver(new JobSeeker("Chris"));
        hh.registerObserver(new JobSeeker("Jeff"));

        //每次添加一个个job，所有找工作人都可以得到通知。
        hh.addJob("Google Job");
        hh.addJob("Yahoo Job");
        hh.addJob("Lenovo Job");
    }
}
