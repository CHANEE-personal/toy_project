package org.toy_project.post.account.application.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.toy_project.post.account.adapter.out.persistence.Account;
import org.toy_project.post.account.adapter.out.persistence.AccountImage;
import org.toy_project.post.account.adapter.out.persistence.AccountMapper;
import org.toy_project.post.account.application.port.out.LoadAccountPort;
import org.toy_project.post.account.domain.AccountEntity;
import org.toy_project.post.account.domain.AccountImageEntity;

@ExtendWith(MockitoExtension.class)
class AccountServiceTest {

    @InjectMocks
    private AccountService accountService;

    @Mock
    private LoadAccountPort loadAccountPort;


    @Test
    @DisplayName("계정 조회")
    void getAccountTest() {

        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setId(1L);
        accountEntity.setAccountName("jennierubyjane");

        AccountImageEntity accountImageEntity = new AccountImageEntity();
        accountImageEntity.setId(1L);
        accountImageEntity.setType("profile");
        accountImageEntity.setImageUrl(
                "https://scontent-ssn1-1.cdninstagram.com/v/t51.2885-19/71533411_449636125903525_7464596574253875200_n.jpg?stp=dst-jpg_s320x320&_nc_ht=scontent-ssn1-1.cdninstagram.com&_nc_cat=1&_nc_ohc=46Hei6zgefcAX_ZYID0&edm=AOQ1c0wBAAAA&ccb=7-5&oh=00_AfBDTYWtogBWVxTSXTuu1-SZpHe4C9nrPXByBa98E7ljmQ&oe=645B8991&_nc_sid=8fd12b");
        accountEntity.setAccountImageEntity(accountImageEntity);

        Account account = new Account();
        account.setId(1L);
        account.setAccountName("jennierubyjane");

        AccountImage accountImage = new AccountImage();
        accountImage.setId(1L);
        accountImage.setType("profile");
        accountImage.setImageUrl(
                "https://scontent-ssn1-1.cdninstagram.com/v/t51.2885-19/71533411_449636125903525_7464596574253875200_n.jpg?stp=dst-jpg_s320x320&_nc_ht=scontent-ssn1-1.cdninstagram.com&_nc_cat=1&_nc_ohc=46Hei6zgefcAX_ZYID0&edm=AOQ1c0wBAAAA&ccb=7-5&oh=00_AfBDTYWtogBWVxTSXTuu1-SZpHe4C9nrPXByBa98E7ljmQ&oe=645B8991&_nc_sid=8fd12b");
        account.setAccountImage(accountImage);

        given(loadAccountPort.loadAccount(1L)).willReturn(account);

        Account getAccount = accountService.getAccount(1L);
        Assertions.assertThat(getAccount.getAccountName()).isEqualTo("jennierubyjane");
    }
}
