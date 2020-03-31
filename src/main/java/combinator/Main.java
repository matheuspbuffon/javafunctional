package combinator;

import java.time.LocalDate;

import static combinator.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0897979797979",
                LocalDate.of(2000, 1, 1)
        );

//        System.out.println(CustomerValidatorService.isValid(customer));

        // If valid, we can store customer in db

        // Using combinator patten
        CustomerRegistrationValidator result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult());

//        System.out.println(result);
//
//        if(result != ValidationResult.SUCCESS) {
//            throw new IllegalStateException(result.name());
//        }
    }
}
