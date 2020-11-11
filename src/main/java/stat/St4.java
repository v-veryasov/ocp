package stat;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class St4 {
    public St4(int i) {
    }

    class In {
    }
}

class B {
    class C extends St4.In {
        public C(St4 st4) {
            st4.super();
        }
    }

    public static void main(String[] args) {
        new B().new C(new St4(10));
        Date date = new Date();
        System.out.println(toXMLGregorianCalendar(date));
    }

    public static XMLGregorianCalendar toXMLGregorianCalendar(Date date) {
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(date);
        try {
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException("Implementation of javax.xml.datatype.DatatypeFactory is not available or cannot be instantiated", e);
        }
    }
}