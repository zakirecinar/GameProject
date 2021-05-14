package Entities;

import java.time.LocalDate;

public class Seller extends Customer{
    private String Number;

    public Seller(String id, String email, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId, String number) {
        super(id, email, firstName, lastName, dateOfBirth, nationalityId);
        Number = number;
    }
}
