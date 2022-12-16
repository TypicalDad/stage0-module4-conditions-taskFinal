package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
                int dayInMonth = 0;
        int isItOk = 0;
        if (year<0){
            System.out.println("invalid date");
            System.exit(0);
        }
        if (month>12 || month<0){
            System.out.println("invalid date");
            System.exit(0);
        }
        switch (year){
            case 1904,1908,1912,1916,1920,1924,1928,1932,1936,1940,1944,1948,1952,1956,1960,1964,1968,1972,1976,1980,1984,1988,1992,1996,2000,
                2004,2008,2012,2016,2020:
                isItOk = 1;
            break;
            default:
                isItOk = 0;
                break;
        }
        if (isItOk==1){
            switch (month){
                case 4,6,9,11:
                    dayInMonth = 30;
                    break;
                case 2:
                    dayInMonth = 29;
                    break;
                default:
                    dayInMonth = 31;
                    break;
            }
        }
        else if (isItOk==0){
            switch (month){
                case 4,6,9,11:
                    dayInMonth = 30;
                    break;
                case 2:
                    dayInMonth = 28;
                    break;
                default:
                    dayInMonth = 31;
                    break;
            }
        }
        System.out.println(dayInMonth);

    }
}
