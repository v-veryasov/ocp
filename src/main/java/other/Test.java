package other;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public void run(Integer[] ints, Double[] doubles) {
        List<Integer> intList = Arrays.asList(ints);
        List<Double> doubleList = List.of(doubles);

        //add() not supported
//        intList.add(1);
//        doubleList.add(1.);

        intList.set(1, 44);

        //add(x, yy) not supported
//        intList.add(1, 41);

//        doubleList.set(1, 44.);
//        System.out.println(doubleList);

        System.out.println("List is " + intList.toString());
        System.out.println("Array chang! " + Arrays.toString(ints));
    }

    private static void testMath() {
        int i = Math.round(1.0F);
        long l = Math.round(1.0);

        double d = Math.random();

    }

    private static void testCompare() {
        String[] s1 = { "Camel", "Peacock", "Llama"};
        String[] s2 = { "Camel", "Llama", "Peacock"};
        String[] s3 = { "Camel"};
        String[] s4 = { "Camel", null};
        System.out.println(Arrays.compare(s1, s2));
        System.out.println(Arrays.mismatch(s1, s2));
        System.out.println();
        System.out.println(Arrays.compare(s3, s4));
        System.out.println(Arrays.mismatch(s3, s4));
        System.out.println();
        System.out.println(Arrays.compare(s4, s4));
        System.out.println(Arrays.mismatch(s4, s4));
    }

//    public static void main(String[] args) {
//        new Test().run(new Integer[]{1, 2, 3}, new Double[]{1., 2., 3.});
//        testCompare();
//        testMath();
//    }
    final static Pattern toDatePattern = Pattern.compile("<(\\w*:?)?toDate>(.*)</(\\w*:?)?toDate>");

    public static void main(String[] args) throws DatatypeConfigurationException, ParseException {
//        DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXXXX");
////        format.setTimeZone(TimeZone.getTimeZone("GMT"));
//        Date date = format.parse("2021-01-21T20:00:55.074+03:00");
//
//        GregorianCalendar c = new GregorianCalendar();
//        c.setTime(new Date());
//        XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(
//                2012, 11, 21, 1, 21, 33, 33, 3);
//        System.out.println(toDate(date2));
        DateTimeFormatter formatter = DateTimeFormatter.ISO_ZONED_DATE_TIME;
        Matcher matcherToDate = toDatePattern.matcher("2021-01-21T20:00:55.074+03:00");
        LocalDate toDate = LocalDate.parse("2021-01-21T00:00:55.074Z", formatter); //Instant.from(formatter.parse("2021-01-21T20:00:55.074+03:00")).atZone(ZoneId.systemDefault()).toLocalDate();
//        LocalDate toDate = Instant.from(formatter.parse("2021-01-21T20:00:55.074+03:00")).atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(toDate);
    }

    private static Date toDate(XMLGregorianCalendar calendar) {
        return calendar == null ? null : calendar.toGregorianCalendar().getTime();
    }
}

