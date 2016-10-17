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
public class NumericRangeException extends Exception{
    
    private static  String msg = "Args out of range";
    public NumericRangeException() {
    }

    public NumericRangeException(String message) {
        super(msg);
    }

    public NumericRangeException(String message, Throwable cause) {
        super(msg, cause);
    }

    public NumericRangeException(Throwable cause) {
        super(msg,cause);
    }

    public NumericRangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    public static void main(String[] args) {
        NumericRangeException e = new NumericRangeException();
        String msg = e.getMessage();
    }
    
}
