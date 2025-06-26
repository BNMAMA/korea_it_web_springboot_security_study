package com.koreait.SpringSecurityStudy.dto;

import com.koreait.SpringSecurityStudy.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ModifyEmailReqDto {
    private String email;

    public User toEntity(Integer userid) {
        return User.builder()
                .userId(userid)
                .email(this.email)
                .build();
    }
}
