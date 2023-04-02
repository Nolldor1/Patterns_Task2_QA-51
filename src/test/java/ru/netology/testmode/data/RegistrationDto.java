package ru.netology.testmode.data;
import lombok.AllArgsConstructor;
import lombok.Data;
    @AllArgsConstructor
    @Data

    public class RegistrationDto{
        private final String login;
        private final String password;
        private final String status;
    }

