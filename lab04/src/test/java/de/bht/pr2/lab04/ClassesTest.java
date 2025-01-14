package de.bht.pr2.lab04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassesTest {
    @Test
    public void test1(){
        Student s1 = new Student("Max Mustermann", 123456);
        assertEquals("Max Mustermann", s1.getName());
        assertEquals(123456, s1.getRegistrationNumber());
        
        Course c1 = new Course("Programmierung 2", "MedienInformatik");
        assertEquals("Programmierung 2", c1.getName());
        
        Subscription b1 = new Subscription(s1, c1);
        assertEquals("Max Mustermann", b1.getStudent().getName());
        assertEquals("Programmierung 2", b1.getCourse().getName());
        
        Grade g1 = new Grade(b1, 1.7);
        assertEquals("Max Mustermann", g1.getSubscription().getStudent().getName());
        assertEquals("Programmierung 2", g1.getSubscription().getCourse().getName());
        assertEquals(1.7, g1.getGrade());

        Certificate z1 = new Certificate(s1);
        z1.addGrade(g1);
        assertEquals(1, z1.getGrades().size());
    }
}
