package org.toy_project.account.application.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.toy_project.account.adapter.out.persistence.Account;
import org.toy_project.account.application.port.in.GetAccountUseCase;
import org.toy_project.account.application.port.out.LoadAccountPort;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
class AccountService implements GetAccountUseCase {

    private final LoadAccountPort loadAccountPort;


    @Override
    public Mono<Account> getAccount(Long id) {
        return loadAccountPort.loadAccount(id);
    }
}
