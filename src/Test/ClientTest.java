package Test;

import Controller.ClientController;
import Controller.OrderController;
import model.Address;
import model.Client;
import model.CreditDetails;
import model.StaffHour;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {

    private ClientController clientController;


    @BeforeEach
    public void setup() throws Exception {
        clientController = ClientController.getInstance();

    }

    @AfterAll
    public void tearDown() {
        System.out.println("ClientTestsEnded");
    }


    @Test
    public void FailAddNewClientEmptyIdTest() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse("01/01/2001", formatter);

        Assertions.assertThrows(Exception.class, () -> {


            Boolean result = clientController.addNewClient("", "test", "test", "01/01/2001", "test", "12", "test", "test", "test", "12345", "01/01/2001", "123", "0");
            Assertions.assertFalse(result);

        });
    }

    @Test
    public void SuccessAddNewClientTest() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse("01/01/2001", formatter);

        Assertions.assertThrows(Exception.class, () -> {

            Boolean result = clientController.addNewClient("999", "test", "test", "01/01/2001", "test", "12", "test", "test", "test", "12345", "01/01/2001", "123", "0");
            Assertions.assertTrue(result);

        });
    }

    @Test
    public void DeleteClientTest() {


        Assertions.assertThrows(Exception.class, () -> {

            Boolean result = clientController.deleteClient("999");
            Assertions.assertTrue(result);

        });
    }


}

