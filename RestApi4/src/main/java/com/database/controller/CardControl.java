package com.database.controller;
import java.util.regex.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.database.entity.CardEntity;
@RestController
public class CardControl {
    
   @GetMapping("/")
    public String showPage() {
        return "Enter your Credit Card Name and Number!.....";
    }
   
   @PostMapping("/creditcard")
   public String isCardValid(@RequestBody CardEntity card) {
      if(card.getCardNo().equalsIgnoreCase("enRoute") && Pattern.matches( "^2(?:014|149)[0-9]{12}$" , card.getCardNo()))
          return "Valid EnRoute Card";
      else if(card.getCardName().equalsIgnoreCase("JCB") && Pattern.matches( "^{3528,3589}[0-9]{16,19}$" , card.getCardNo()))
          return "Valid JCB Card";
      if(card.getCardName().equalsIgnoreCase("Master") && (Pattern.matches( "^5[1-5]{1}[0-9]{14}$" , card.getCardNo()) || Pattern.matches( "^2[2-7]{1}[0-9]{14}$" , card.getCardNo())))
          return "Valid MasterCard Card";
      if(card.getCardName().equalsIgnoreCase("Visa") && Pattern.matches( "^4[0-9]{18}$" , card.getCardNo()))
          return "Valid Visa Card";
      return card.getCardName()+"Card is Not Valid";
   }
}