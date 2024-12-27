package de.bht.pr2.lab02.part1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MyTest {

  @Test
  void testConstructorValid() throws Exception {

    Student s1 = new Student("Zoe Zoo,70026,Technische Informatik,312");
    assertEquals(s1.getName(), "Zoe Zoo");
    assertEquals(s1.getRegistrationNumber(), 70026);
    assertEquals(s1.getCourseOfStudies(), "Technische Informatik");
  }

  // Test für Ungültige Fälle :
  @Test
  void emptyDataLine() {
    assertThrows(StudentParseException.class, () -> {
      Student s1 = new Student(",,");
    });
  }

  @Test
  void invalidRegistrationNr() {
    assertThrows(RegistrationNumberException.class, () -> {
      Student s1 = new Student("Leon Lied,70.012,Screen Based Media,312");
    });
  }

  @Test
  void invalidCourse() {
    assertThrows(WrongCourseOfStudiesException.class, () -> {
      Student s1 = new Student("Ingrid Insel,70009,Musik und Tanz,312");
    });
  }
  
  
  @Test
  void invalidTuitionFee1() {
    assertThrows(StudentParseException.class, () -> {
      Student s1 = new Student("Rafael Raum,70018,Druck- und Medientechnik,20j");
    });
  }
  
  
  @Test
  void invalidTuitionFee2() {
    assertThrows(NotPaidTuitionFeeException.class, () -> {
      Student s1 = new Student("Rafael Raum,70018,Druck- und Medientechnik,200");
    });
  }

}
