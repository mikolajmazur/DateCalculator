import org.junit.Test;
import sun.security.util.Debug;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

public class FormatterTests {
    @Test
    public void shouldParseJavaFormattedDuration() {
        String text = "P1DT2H3M5S";
        int formatId = DateCalculatorParser.PrzedzialCzasuJava;
        Duration expected = Duration.parse(text);

        Duration result = Formatter.parseDuration(text, formatId);
        assertEquals(0, expected.compareTo(result));
    }

    @Test
    public void shouldParseDotFormattedDuration(){
        String text = "T:2:15:20";
        int formatId = DateCalculatorParser.PrzedzialCzasuDwukropki;
        Duration expected = Duration.parse("PT2H15M20S");

        Duration result = Formatter.parseDuration(text, formatId);
        assertEquals(0, expected.compareTo(result));
    }

    @Test
    public void shouldParseDataDMMMMR(){
        String text = "20 marca 2015";
        int formatId = DateCalculatorParser.DataDMMMMR;
        LocalDateTime expected = LocalDateTime.parse("2015-03-20T00:00:00");

        LocalDateTime result = Formatter.parseDate(text, formatId);

        assertEquals(0, expected.compareTo(result));
    }

    @Test
    public void shouldParseDataDMRKropka(){
        String text = "20.3.2015";
        int formatId = DateCalculatorParser.DataDMRKropka;
        LocalDateTime expected = LocalDateTime.parse("2015-03-20T00:00:00");

        LocalDateTime result = Formatter.parseDate(text, formatId);

        assertEquals(0, expected.compareTo(result));
    }

    @Test
    public void shouldParseDataDMRMyslnik(){
        String text = "20-03-2015";
        int formatId = DateCalculatorParser.DataDMRMyslnik;
        LocalDateTime expected = LocalDateTime.parse("2015-03-20T00:00:00");

        LocalDateTime result = Formatter.parseDate(text, formatId);

        assertEquals(0, expected.compareTo(result));
    }

    @Test
    public void shouldParseDataMDRSlash(){
        String text = "3/20/2015";
        int formatId = DateCalculatorParser.DataMDRSlash;
        LocalDateTime expected = LocalDateTime.parse("2015-03-20T00:00:00");

        LocalDateTime result = Formatter.parseDate(text, formatId);

        assertEquals(0, expected.compareTo(result));
    }

    @Test
    public void shouldParseDataCzasDMMMMR(){
        String text = "20 marca 2015 12:05:30";
        int formatId = DateCalculatorParser.DataCzasDMMMMR;
        LocalDateTime expected = LocalDateTime.parse("2015-03-20T12:05:30");

        LocalDateTime result = Formatter.parseDateTime(text, formatId);

        assertEquals(0, expected.compareTo(result));
    }

    @Test
    public void shouldParseDataCzasDMRKropka(){
        String text = "20.3.2015 11:05:30AM";
        int formatId = DateCalculatorParser.DataCzasDMRKropka;
        LocalDateTime expected = LocalDateTime.parse("2015-03-20T11:05:30");

        LocalDateTime result = Formatter.parseDateTime(text, formatId);

        assertEquals(0, expected.compareTo(result));
    }

    @Test
    public void shouldParseDataCzasMDRSlash(){
        String text = "3/20/2015 11:05:30AM";
        int formatId = DateCalculatorParser.DataCzasMDRSlash;
        LocalDateTime expected = LocalDateTime.parse("2015-03-20T11:05:30");

        LocalDateTime result = Formatter.parseDateTime(text, formatId);

        assertEquals(0, expected.compareTo(result));
    }

    @Test
    public void shouldParseDataCzasISO(){
        String text = "20-3-2015T11:05:30";
        int formatId = DateCalculatorParser.DataCzasISO;
        LocalDateTime expected = LocalDateTime.parse("2015-03-20T11:05:30");

        LocalDateTime result = Formatter.parseDateTime(text, formatId);

        assertEquals(0, expected.compareTo(result));
    }
}