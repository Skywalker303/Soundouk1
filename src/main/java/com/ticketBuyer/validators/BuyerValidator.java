package com.ticketBuyer.validators;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.ticketBuyer.model.Buyer;
@Component
public class BuyerValidator implements Validator  {

    public boolean supports(Class<?> cls) {
        return Buyer.class.isAssignableFrom(cls);
    }

    public void validate(Object target, Errors errors) {
        Buyer buyer = (Buyer)target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "","Username is empty");
                if (buyer.getName().length()<4) {
            errors.rejectValue("name","", "Username length is less than 4");
        }
    }
}