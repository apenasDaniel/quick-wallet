package com.danieloliveira.quick_wallet.repository;

import com.danieloliveira.quick_wallet.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
}
