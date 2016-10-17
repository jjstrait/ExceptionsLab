package lab0;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }
    
    //Vvaildation rules:
    //- Days vacation must be between 0 and 120 inclusive
    public void setDaysVacation(int daysVacation) {
        if(daysVacation <0||daysVacation>120){
         throw new IllegalArgumentException("Not between 0 and 120");
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    //Validation Rules:
    //- no nullvalues
    //- no empty Strings
    //- no names larger then 50 char
    //- no only spaces
    //- does not start with a space
    //- names must only contain Letters or numbers, plus apostrophe,
    //plus hyphens 
    public final void setFirstName(String firstName) {
       if(firstName == null || firstName.isEmpty()||firstName.trim().length() == 0){
           throw new IllegalArgumentException("firstNsme is null or empty");
       }
       if(firstName.startsWith(" ")){
           throw new IllegalArgumentException("Spaces in the begining of the name");
       }
       if(firstName.length()>50){
           throw new IllegalArgumentException("Last name is more then 50 characters");
       }
       
       
        this.firstName = firstName;
    } 

    public String getLastName() {
        return lastName;
    }
    
    //Validation Rules:
    //- no nullvalues
    //- no empty Strings
    //- no names larger then 50 char
    //- no only spaces
    //- does not start with
    //- names must only contain Letters or numbers, plus apostrophe,
    //plus hyphens 
    public void setLastName(String lastName) {
        if(lastName == null || lastName.isEmpty()||lastName.trim().length() == 0){
           throw new IllegalArgumentException("firstNsme is null or empty");
       }
       if(lastName.startsWith(" ")){
           throw new IllegalArgumentException("Spaces in the begining of the name");
       }
       if(lastName.length()>50){
           throw new IllegalArgumentException("Last name is more then 50 characters");
       }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }
    
    //Validation Rules:
    //- 9 digits long
    //- can't be all 0's
    //- middle two (2) digits) range from 01 to 99
    //- last four (4) digits) run consecutively from 0001 through 9999
    public void setSsn(String ssn) {
        String[] parts = ssn.split("-");
        if(ssn.length() != 9){
            throw new IllegalArgumentException("The social security number is not 9 digits long");
            
        }
        if(ssn.length() < 9 || ssn.length()>11){
            throw new IllegalArgumentException("The social security number is not 9 digits long");
        }
        if(parts.length != 3||  parts.length!=1){
            throw new IllegalArgumentException("The social security number is not 9 digits long");
        }
        
        
        char[] charArray = ssn.toCharArray();
        for(char c: charArray){
            if(!Character.isDigit(c));
        }
        
        this.ssn = ssn;
    }
    
    
    
}
