package de.bht.pr2.lab01;

import java.util.List;
import java.util.ArrayList;

public class Student {

  //-------------------------------------------
  // Attribute
  private String name = "";

  // Matrikelnummer
  private int registrationNumber = 0;

  // Medieninformatik, Technische Informatik, Druck- und Medientechnik und Screen Based Media
  private String courseOfStudies = "";

  // Rückmeldegebühr
  public static final int TUITION_FEE = 312;

  /**
   * This contructor parses a comma-separated row describing a student object.
   *
   * @param dataRow a comma-separated row describing a student object
   */

   // add the other exceptions to throws
   // finish the rest of the excercices
  public Student(String dataRow) throws StudentParseException, RegistrationNumberException, WrongCourseOfStudiesException, NotPaidTuitionFeeException {
    // Check number of Elements
    String[] tab = dataRow.split(",");

    // Check the validity of the Data line
    if(tab.length != 4){
      throw new StudentParseException("faulti line : " + dataRow);
    }
    // Check the validity of MartrikelNr.
    if(!tab[1].matches("^\\d+$") || tab[1].length() < 5){
      throw new RegistrationNumberException("Invalid Registration number : " + tab[1]);
    }
    // Check the validity of Studiengang
    List<String> coursesList = new ArrayList<String>();
    coursesList.add("Medieninformatik");
    coursesList.add("Technische Informatik");
    coursesList.add("Druck- und Medientechnik");
    coursesList.add("Screen Based Media");

    if(!coursesList.contains(tab[2])){
      throw new WrongCourseOfStudiesException("Invalid Course of Studies : " + tab[2]);
    }
    //Check the validity Rückmeldungsgebühr
    int gebuhr = 0;
    try {
      gebuhr = Integer.parseInt(tab[3]);
    } catch (NumberFormatException e) {
      throw new StudentParseException("Wrong tuition paid in data: '" + dataRow + "'.");
    }

    if(gebuhr < 312){
      throw new NotPaidTuitionFeeException("Missing paiment, need to pay " + (312 - gebuhr) + "€");
    }

    // Creating the Object
    this.name = tab[0];
    this.registrationNumber = Integer.valueOf(tab[1]);
    this.courseOfStudies = tab[2];

  }

  public String toString(){
    return "Student : " + this.name + ", MatrikelNr. : " + this.registrationNumber + ", Studiengang : " + this.courseOfStudies ;
  }
}
