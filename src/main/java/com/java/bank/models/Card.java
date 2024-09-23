package com.java.bank.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @Column(name = "card_num")
    private String cardNumber;

    @Column(name = "balance")
    private float balance;

    @Column(name = "open_date")
    private LocalDate openDate;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private CardStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bank_account", referencedColumnName = "id")
    private BankAccount bankAccount;


    public Card(String cardNumber, LocalDate openDate, CardStatus status) {
        this.cardNumber = cardNumber;
        this.openDate = openDate;
        this.status = status;
    }
}
