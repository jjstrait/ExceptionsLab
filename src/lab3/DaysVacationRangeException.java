/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author jstra
 */
public class DaysVacationRangeException extends Exception{
    
    private static  String msg = "Args out of range";
    public DaysVacationRangeException() {
    }

    public DaysVacationRangeException(String message) {
        super(msg);
    }

    public DaysVacationRangeException(String message, Throwable cause) {
        super(msg, cause);
    }

    public DaysVacationRangeException(Throwable cause) {
        super(msg,cause);
    }

    public DaysVacationRangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    public static void main(String[] args) {
        DaysVacationRangeException e = new DaysVacationRangeException();
        String msg = e.getMessage();
    }
    
}
