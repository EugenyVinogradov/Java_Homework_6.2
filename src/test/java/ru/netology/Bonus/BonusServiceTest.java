package ru.netology.Bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.Bonus.BonusService;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource (resources = "/TestData.csv")
    void shouldCalculateForRegisteredAndUnderLimit(String text, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();
        long actual = service.calculate (amount, registered);
        assertEquals(expected, actual);
    }
}
