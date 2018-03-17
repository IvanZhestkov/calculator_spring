package ru.kpfu.itis.util;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.kpfu.itis.model.Calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorFormValidator implements Validator {

    static Pattern p = Pattern.compile("^[0-9]*[.,][0-9]+$");

    @Override
    public boolean supports(Class<?> aClass) {
        return Calculator.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Calculator calc = (Calculator) o;
        if (calc.getDigit() == null) {
            errors.rejectValue("error", "", "Некорректные введенные данные");
        }
        try {
            Double digit = Double.valueOf(calc.getDigit());
        } catch (NumberFormatException e) {
            errors.rejectValue("error", "", "Допустимы только цифры!");
        }
        /*Matcher a = p.matcher(digit.toString());
        if (a.matches()) {
            errors.rejectValue("error", "", "Допустимы только цифры!");
        }*/
    }
}
