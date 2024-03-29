package org.toy_project.account.adapter.out.persistence;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Account {

    private Long id;
    private String accountName;

    private AccountImage accountImages;

    private String hashTag;
    private String youtubeUrl;

    private int postCount;

    private int followCount;
    private int followerCount;
}
