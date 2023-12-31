package es.upm.miw.iwvg_devops.code;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchTest {

    @Test
    void testFindDecimalFractionByUserName() {
        assertEquals(List.of(0.0, -0.0, 0.0), new Searches().findDecimalFractionByUserName("Antonio")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserIdByAllProperFraction() {
        assertEquals(List.of(), new Searches().findUserIdByAllProperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindDecimalImproperFractionByUserName() {
        assertEquals(List.of(2.0, -0.5), new Searches().findDecimalImproperFractionByUserName("Oscar")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserFamilyNameBySomeImproperFraction() {
        assertEquals(List.of("Fernandez", "Blanco", "López", "Blanco", "Torres"),
                new Searches().findUserFamilyNameBySomeImproperFraction()
                .collect(Collectors.toList()));
    }

}
