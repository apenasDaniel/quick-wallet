package com.danieloliveira.quick_wallet.service;


import com.danieloliveira.quick_wallet.controller.dto.CreateWalletDto;
import com.danieloliveira.quick_wallet.entity.Wallet;
import com.danieloliveira.quick_wallet.exception.WalletDataAlreadyExistsException;
import com.danieloliveira.quick_wallet.repository.WalletRepository;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    private final WalletRepository walletRepository;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public Wallet createWallet(CreateWalletDto dto) {

        var walletDb = walletRepository.findByCpfCnpjOrEmail(dto.cpfCnpj(), dto.email());
        if (walletDb.isPresent()) {
            throw new WalletDataAlreadyExistsException("CpfCnpj or Email already exists");
        }

        return walletRepository.save(dto.toWallet());
    }
}
