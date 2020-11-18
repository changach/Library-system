package bilha.moses.faith.sharon.library;

import java.time.LocalDate;
import java.util.Date;

public class LogIn {
    //LogIn Details
    String first_name;
    String Last_name;
    String Institution;
    int year_of_study;
     int CurrentDate;
    int DueDate;

    //Default Constructor
    public LogIn() {

    }

    //Parameterized Constructor
    public LogIn(String first_name, String Last_name, String Institution, int year_of_study) {
        this.first_name = first_name;
        this.Last_name = Last_name;
        this.Institution = Institution;
        this.year_of_study = year_of_study;
        this.CurrentDate=CurrentDate;
        this.DueDate=DueDate;
    }
//parameterized getters and setters


    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public int getCurrentDate() {
        return CurrentDate;
    }

    public void setCurrentDate(int currentDate) {
        CurrentDate = currentDate;
    }

    public int getDueDate() {
        return DueDate;
    }

    public void setDueDate(int dueDate) {
        DueDate = dueDate;
    }

    public void setLast_name(String last_name) { Last_name = last_name;

    }

    public String getInstitution() {
        return Institution;
    }

    public void setInstitution(String institution) {
        Institution = institution;
    }

    public int getYear_of_study() {
        return year_of_study;
    }

    public void setYear_of_study(int year_of_study) {
        this.year_of_study = year_of_study;
    }


}