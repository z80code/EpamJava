package by.gsu.epamlab;

public class BusinessTrip {

    /**
     * Private  daily allowance rate in BYN (the constant)
     */
    public final static CurrencyByn DAILY_ALLOWANCE_RATE = new CurrencyByn(30000);

    /**
     * Employee`s account
     */
    private String employeeAccount;

    /**
     * Transportation expenses in BYN
     */
    private CurrencyByn transportationExpenses;

    /**
     * Number of days
     */
    private int numberOfDays;

    public BusinessTrip() {
        this("", new CurrencyByn(), 0);
    }

    public BusinessTrip(String employeeAccount, CurrencyByn transportationExpenses, int numberOfDays) {
        this.employeeAccount = employeeAccount;
        this.transportationExpenses = transportationExpenses;
        this.numberOfDays = numberOfDays;
    }


    public String getEmployeeAccount() {
        return employeeAccount;
    }

    public CurrencyByn getTransportationExpensesBYN() {
        return transportationExpenses;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setEmployeeAccount(String employeeAccount) {
        this.employeeAccount = employeeAccount;
    }

    public void setTransportationExpensesBYN(int transportationExpensesBYN) {
        transportationExpensesBYN = transportationExpensesBYN;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    //    getTotal( ) – calculating total business trip expenses
    //            (= transportation expenses + daily allowance rate * number of days);
    public int getTotal() {
        return DAILY_ALLOWANCE_RATE.getCoins() * (numberOfDays) + (transportationExpenses.getCoins());
    }

    //    show() – printing all fields to the console
    // (each field and the total business trip expenses
    // should be on the separate line;
    public void show() {
        System.out.println("rate = " + DAILY_ALLOWANCE_RATE.show() + "\n" +
                "account = " + employeeAccount + "\n" +
                "transport = " + transportationExpenses.show() + "\n" +
                "days = " + numberOfDays + "\n" +
                "total = " + getTotal()
        );
    }

    // toString( ) – converting of an object to a string in the csv–format:
    // each non constant field and the total business trip expenses,
    // separated by the ";" symbol.
    @Override
    public String toString() {
        return employeeAccount + ";" +
                transportationExpenses + ";" +
                numberOfDays + ";" +
                getTotal();
    }
}
