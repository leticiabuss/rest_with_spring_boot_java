package br.com.udemy.rest_with_spring_boot_java.service;

import br.com.udemy.rest_with_spring_boot_java.exceptions.UnsupportedMathOperationException;

public class MathValidateService {

    private static final String MESSAGE_ERROR = "Please set a numeric value!";

    public void validateNumber(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException(MESSAGE_ERROR);
        }
    }

    public void validateNumber(String number) {
        if (!isNumeric(number) ) {
            throw new UnsupportedMathOperationException(MESSAGE_ERROR);
        }
    }

    public boolean isNumeric(String strNumber){
        if(strNumber == null){
            return false;
        }
        String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
