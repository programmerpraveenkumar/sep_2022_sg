package EnumSample;
/*
MANAGER(1)
USER(2)
ADMIN(3)

 */
public class DaysSample1 {
    enum DAYS{
        SUN(0),
        MON(1),
        TUE(2),
        WED(3),
        THU(4),
        FRI(5),
        SAT(6);
        private int count;
        DAYS(int count){
            this.count = count;
        }
    };

    public static void main(String[] args) {

        System.out.println(DAYS.MON);
        System.out.println(DAYS.MON.count);
        System.out.println(DAYS.FRI.count);

        for(DAYS d :DAYS.values()){
            System.out.println(d+" -- "+d.count);
        }

        System.out.println("access using object ");
        DAYS day = DAYS.MON;
        System.out.println(day.count);
    }
}
