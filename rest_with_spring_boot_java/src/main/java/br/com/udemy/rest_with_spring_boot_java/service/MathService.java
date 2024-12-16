package br.com.udemy.rest_with_spring_boot_java.service;

import br.com.udemy.rest_with_spring_boot_java.utils.NumberConverter;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    private final MathValidateService mathValidateService = new MathValidateService();
    private final NumberConverter numberConverter  = new NumberConverter();

    public Double sum(String numberOne, String numberTwo) {
        mathValidateService.validateNumber(numberOne, numberTwo);
        return numberConverter.convertToDouble(numberOne) + numberConverter.convertToDouble(numberTwo);
    }

    public Double subtraction(String numberOne, String numberTwo) {
        mathValidateService.validateNumber(numberOne, numberTwo);
        return numberConverter.convertToDouble(numberOne) - numberConverter.convertToDouble(numberTwo);
    }

    public Double multiplication(String numberOne, String numberTwo) {
        mathValidateService.validateNumber(numberOne, numberTwo);
        return numberConverter.convertToDouble(numberOne) * numberConverter.convertToDouble(numberTwo);
    }

    public Double division(String numberOne, String numberTwo) {
        mathValidateService.validateNumber(numberOne, numberTwo);
        return numberConverter.convertToDouble(numberOne) / numberConverter.convertToDouble(numberTwo);
    }

    public Double average(String numberOne, String numberTwo) {
        mathValidateService.validateNumber(numberOne, numberTwo);
        return  (numberConverter.convertToDouble(numberOne) + numberConverter.convertToDouble(numberTwo)) / 2;
    }

    public Double squareRoot(String number) {
        mathValidateService.validateNumber(number);
        return  Math.sqrt(numberConverter.convertToDouble(number)) ;
    }


}
