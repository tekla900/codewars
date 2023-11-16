package eight_kyu;

/*
* The purpose of this kata is to work out just how many bottles of duty free
* whiskey you would have to buy such that the savings over the normal high
* street price would effectively cover the cost of your holiday.
*
* For example, if a bottle costs £10 normally and the duty free discount is 10%,
* you would save £1 per bottle. If your holiday will cost £500,
* you would have to purchase 500 bottles to save £500,
* so the answer you return should be 500.
*
* All inputs will be integers. Please return an integer. Round down.
* */

public class HolidayDutyFree {
    public static int dutyFree(int normPrice, int discount, int hol) {
        return (int) Math.floor(hol / ((double) normPrice * discount / 100));
    }
}
