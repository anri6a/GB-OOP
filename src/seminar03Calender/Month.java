package seminar03Calender;

public enum Month {
    JAN(1),
    FEB(2),
    Mar(3),
    APR(4),
    MAY(5),
    JUN(6),
    JUL(7),
    AUG(8),
    SEN(9),
    OKT(10),
    NOV(11),
    DEC(12);

    private int numberMonth;

    Month(int numberMonth) {
        this.numberMonth = numberMonth;
    }

    public int getNumberMonth() {
        return numberMonth;
    }
}
