package combinator;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0897979797979",
                LocalDate.of(2000, 1, 1)
        );

        System.out.println(CustomerValidatorService.isValid(customer));

        // If valid, we can store customer in db
    }
}
