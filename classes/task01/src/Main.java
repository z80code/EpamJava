import by.gsu.epamlab.BusinessTrip;
import by.gsu.epamlab.CurrencyByn;

public class Main {

    public static void main(String[] args) {

        /**
         * Create an array of minimum 5 objects (the element with index 2 should be empty;
         * the last element of the array should be created by default constructor;
         * * other elements are valid and should be created by general-purpose constructor). */
        BusinessTrip businessTrips[] = new BusinessTrip[]{
                new BusinessTrip("Anton Shumsky", new CurrencyByn(16000), 3),
                new BusinessTrip("Kiril Shumsky", new CurrencyByn(105000), 5),
                null,
                new BusinessTrip("Ihor Shumsky", new CurrencyByn(162000), 8),
                new BusinessTrip("Pavel Shumsky", new CurrencyByn(162000), 5),
                new BusinessTrip(),
        };

        // 2. Print the array content to the console, using show( ) method.
        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null) {
                businessTrip.show();
                System.out.println();
            }
        }

        // 3. Change the employee`s transportation expenses for the last object of the array.

        businessTrips[businessTrips.length - 1].setTransportationExpensesBYN(150100);

        // 4. Print the total duration of two initial business trips by the single operator.

        System.out.println(businessTrips[0].getNumberOfDays()+businessTrips[1].getNumberOfDays());
        System.out.println();

        // 5. Print the array content to the console (one element per line), using toString( ) method implicitly.

        for (BusinessTrip businessTrip : businessTrips) {
            System.out.println(businessTrip);
        }
    }
}
