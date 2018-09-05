package transactions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import transactions.model.Booking;
import transactions.model.BookingRepository;

import javax.transaction.Transactional;

@Controller
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    @Transactional
    public void addBooking(String...names) {
        for(String name : names) {

            Booking booking = new Booking(name);
            bookingRepository.save(booking);
        }
    }

    public Iterable<Booking> allBookings() {

        return bookingRepository.findAll();
    }
}
