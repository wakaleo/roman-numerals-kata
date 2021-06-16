package dojo.roman;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenConvertingRomanNumeralsToIntegers {

    @Test
    public void iConvertsTo1() {
        assertThat(RomanNumbers.asInt("I")).isEqualTo(1);
    }

    @Test(expected = InvalidRomanNumeralException.class)
    public void emptyStringsAreNotPermitted() {
        RomanNumbers.asInt("");
    }

    @Test
    public void iiConvertsTo2() {
        assertThat(RomanNumbers.asInt("II")).isEqualTo(2);
    }

    @Test
    public void ivConvertsTo4() {
        assertThat(RomanNumbers.asInt("IV")).isEqualTo(4);
    }

    @Test
    public void ixConvertsTo9() {
        assertThat(RomanNumbers.asInt("IX")).isEqualTo(9);
    }
}
