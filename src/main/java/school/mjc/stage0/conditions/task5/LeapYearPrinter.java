package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean isLeap;
        switch (year % 4) {
            case 0:
                switch (year % 100) {
                    case 0:
                        switch (year % 400) {
                            case 0:
                                isLeap = true;
                                break;
                            default:
                                isLeap = false;
                                break;
                        }
                        break;
                    default:
                        isLeap = true;
                        break;
                }
                break;
            default:
                isLeap = false;
                break;
        }

        if (isLeap) {
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }
    }
}
