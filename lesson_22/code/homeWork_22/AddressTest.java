package homeWork_22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddressTest {

    Address address;

    String street = "52 - street.GB";
    String hauseNumber = "1A";
    int index = 42119;
    String city = "New York";
    String country = "USA";


    @BeforeEach
    void setUp() {
        address = new Address(street, hauseNumber, index, city, country);
    }

    @Test
    void tesValidStreet() {
        address.setStreet(street);
        assertEquals("52 - street.GB", address.getStreet());
    }

    @Test
    void testStreetTooShort() {
        address.setStreet("f1");
        assertEquals("52 - street.GB", address.getStreet());
    }

    @Test
    void testStreetTooLong() {
        address.setStreet("12345678901234567890A");
        assertEquals("52 - street.GB", address.getStreet());
    }

    @Test
    void testStreetLowercaseFirstLetter() {
        address.setStreet("kennedy");
        assertEquals("52 - street.GB", address.getStreet());
    }

    @Test
    void testStreetSpaceFirstLetter() {
        address.setStreet(" 52-street.GB");
        assertEquals("52 - street.GB", address.getStreet());
    }

    @Test
    void testStreetSpecialSymbol() {
        address.setStreet("52-st#reet.GB");
        assertEquals("52 - street.GB", address.getStreet());
    }

    @Test
    void tesValidHauseNumber() {
        address.setHouseNumber(hauseNumber);
        assertEquals("1A", address.getHouseNumber());
    }

    @Test
    void testHauseNumberTooLong() {
        address.setHouseNumber("132AB");
        assertEquals("1A", address.getHouseNumber());
    }

    @Test
    void testHauseWihtSlash() {
        address.setHouseNumber("13/2");
        assertEquals("13/2", address.getHouseNumber());
    }

    @Test
    void testHauseWihtDot() {
        address.setHouseNumber("13.2");
        assertEquals("13.2", address.getHouseNumber());
    }


    @Test
    void testValidIndex() {
        address.setIndex(index);
        assertEquals(42119, address.getIndex());
    }

    @Test
    void testIndexTooShort() {
        address.setIndex(4211);
        assertEquals(42119, address.getIndex());
    }

    @Test
    void testIndexTooLong() {
        address.setIndex(123456);
        assertEquals(42119, address.getIndex());
    }

       @Test
    void testValidCity() {
        address.setCity(city);
        assertEquals("New York", address.getCity());
    }

    @Test
    void testCityTooShort() {
        address.setCity("N");
        assertEquals("New York", address.getCity());
    }

    @Test
    void testCityTooLong() {
        address.setCity("New YorkNew York New ");
        assertEquals("New York", address.getCity());
    }

    @Test
    void testCityWihtDigit() {
        address.setCity("New York3");
        assertEquals("New York", address.getCity());
    }

    @Test
    void testCityWihtSpecialSymbol() {
        address.setCity("New York!");
        assertEquals("New York", address.getCity());
    }

    @Test
    void testCityLowercaseFirstLetter() {
        address.setCity("new York");
        assertEquals("New York", address.getCity());
    }

    @Test
    void testValidCountry() {
        address.setCountry(country);
        assertEquals("USA", address.getCountry());
    }

    @Test
    void testCountryTooShort() {
        address.setCountry("US");
        assertEquals("USA", address.getCountry());
    }

    @Test
    void testCountryTooLong() {
        address.setCity("Democratic Republic of the CongoA");
        assertEquals("USA", address.getCountry());
    }

    @Test
    void testCountryWihtDigit() {
        address.setCountry("USA3");
        assertEquals("USA", address.getCountry());
    }

    @Test
    void testCountryWihtSpecialSymbol() {
        address.setCountry("USA!");
        assertEquals("USA", address.getCountry());
    }

    @Test
    void testCountryLowercaseFirstLetter() {
        address.setCountry("uSA");
        assertEquals("USA", address.getCountry());
    }

    @Test
    void testCountryWihtSpace() {
        address.setCountry("United Arab Emirates");
        assertEquals("United Arab Emirates", address.getCountry());
    }

}