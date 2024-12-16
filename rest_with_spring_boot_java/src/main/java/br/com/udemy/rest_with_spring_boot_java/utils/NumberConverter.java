package br.com.udemy.rest_with_spring_boot_java.utils;

import br.com.udemy.rest_with_spring_boot_java.service.MathValidateService;

public class NumberConverter {

    private MathValidateService mathValidateService;

    public Double convertToDouble(String strNumber){
        if(strNumber == null)
            return 0D;
        String number = strNumber.replaceAll(",", ".");
        if(mathValidateService.isNumeric(number))
            return Double.parseDouble(number);
        return 0D;
    }
}
