package com.danieloliveira.quick_wallet.controller.dto;

import com.danieloliveira.quick_wallet.entity.Wallet;
import com.danieloliveira.quick_wallet.entity.WalletType;

public record CreateWalletDto(String fullName,
                              String cpfCnpj,
                              String email,
                              String password,
                              WalletType.Enum walletType) {

    public Wallet toWallet() {
        return new Wallet(
            fullName,
                cpfCnpj,
                email,
                password,
                walletType.get()
        );
    }
}
