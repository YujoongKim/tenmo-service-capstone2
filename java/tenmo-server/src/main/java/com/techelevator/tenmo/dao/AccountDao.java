package com.techelevator.tenmo.dao;


import java.math.BigDecimal;

public interface AccountDao {

    BigDecimal retrieveBalance(int userID);

    BigDecimal updateReceiverAccountBalance(int userId, BigDecimal transferAmount );

    BigDecimal updateSenderAccountBalance(int userId, BigDecimal transferAmount );
}
