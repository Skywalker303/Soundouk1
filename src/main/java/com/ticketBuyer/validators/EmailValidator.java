package com.ticketBuyer.validators;

        import com.ticketBuyer.model.Buyer;
        import org.springframework.stereotype.Component;
        import org.springframework.validation.Errors;
        import org.springframework.validation.ValidationUtils;
        import org.springframework.validation.Validator;

@Component
public class EmailValidator implements Validator {

    public boolean supports(Class<?> cls) {
        return Buyer.class.isAssignableFrom(cls);
    }

    public void validate(Object target, Errors errors) {
        Buyer buyer = (Buyer) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "","Email is empty");
        if (!buyer.getEmail().contains("@")) {
            errors.rejectValue("email","", "Email is not valid.");
        }
    }
}
