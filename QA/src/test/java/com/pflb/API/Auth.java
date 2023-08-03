package com.pflb.API;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Auth {
    public String password;
    public String username;

    public Auth(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public Auth() {
    }
    public static class AuthResponse {
        @JsonProperty("access_token")
        public String access_token;
    }
}
