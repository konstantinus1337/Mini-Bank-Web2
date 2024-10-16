package com.java.bank.utils;

import com.java.bank.controllers.DTO.BankAccountDTO;
import com.java.bank.controllers.DTO.CardTransDTO;
import com.java.bank.controllers.DTO.AuthDTO;
import com.java.bank.models.BankAccount;
import com.java.bank.models.Card;
import com.java.bank.models.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class MapperForDTO {
    private final ModelMapper modelMapper;

    public BankAccountDTO convertToBankAccountDTO(BankAccount bankAccount) {
        return this.modelMapper.map(bankAccount, BankAccountDTO.class);
    }

    public BankAccount convertToBankAccount(BankAccountDTO bankAccountDTO) {
        return this.modelMapper.map(bankAccountDTO, BankAccount.class);
    }

    public User convertToUser(AuthDTO userDTO) {
        return this.modelMapper.map(userDTO, User.class);
    }

    public Card convertCard(Card card) {
        return this.modelMapper.map(card, Card.class);
    }

    public Card convertToCard(CardTransDTO cardTransDTO) {
        return this.modelMapper.map(cardTransDTO, Card.class);
    }

}
