package com.ks.springsecurityclient.event;

import com.ks.springsecurityclient.entity.Users;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationCompleteEvent {
    private final Users user;
    private final String applicationUrl;

    public RegistrationCompleteEvent(Users user, String applicationUrl) {
        super();
        this.user = user;
        this.applicationUrl = applicationUrl;
    }
}
