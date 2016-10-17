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
public class FullNameInputException extends Exception{
    private static String msg = "Full name must contain at least two parts";
    public FullNameInputException() {
        super(msg);
    }

    public FullNameInputException(String message) {
        super(msg);
    }

    public FullNameInputException(String message, Throwable cause) {
        super(msg, cause);
    }

    public FullNameInputException(Throwable cause) {
        super(msg,cause);
    }

    public FullNameInputException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(msg, cause, enableSuppression, writableStackTrace);
    }
    
}
