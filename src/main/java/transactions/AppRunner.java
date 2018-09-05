package transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import transactions.controller.BookingController;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    private BookingController bookingController;

    @Override
    public void run(String... args) throws Exception {

        bookingController.addBooking("Alice", "Bob", "Carol");

        bookingController.addBooking("Chris", "Samuel");

        bookingController.addBooking("Buddy", null);

    }

}
