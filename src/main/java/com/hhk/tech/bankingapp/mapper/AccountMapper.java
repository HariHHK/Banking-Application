package com.hhk.tech.bankingapp.mapper;

import com.hhk.tech.bankingapp.dto.AccountDto;
import com.hhk.tech.bankingapp.entity.Account;

public class AccountMapper {

    //Introduced Record class for DTO

    public static Account mapToAccount(AccountDto accountDto) {
        Account account = new Account(
                accountDto.id(),
                accountDto.accountHolderName(),
                accountDto.balance()
        );
        return account;
    }

    public static AccountDto mapToAccountDto(Account account) {
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
