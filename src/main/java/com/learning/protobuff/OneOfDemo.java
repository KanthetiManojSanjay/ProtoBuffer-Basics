package com.learning.protobuff;

import com.learning.models.Credentials;
import com.learning.models.EmailCredentials;
import com.learning.models.PhoneOTP;

public class OneOfDemo {
    public static void main(String[] args) {

        EmailCredentials emailCredentials = EmailCredentials.newBuilder()
                .setEmail("kansanjay@gmail.com")
                .setPassword("123456")
                .build();

        PhoneOTP phoneOtp = PhoneOTP.newBuilder()
                .setCode(1234)
                .setNumber(1234567890)
                .build();

        Credentials credentials = Credentials.newBuilder()
                .setEmailMode(emailCredentials)
                .setPhoneMode(phoneOtp)  // phoneMode erased previously assigned emailMode due to oneOf in proto file
                .build();

        login(credentials);
    }

    private static void login(Credentials credentials) {

        switch (credentials.getModeCase()) {
            case EMAILMODE:
                System.out.println(credentials.getEmailMode());
                break;
            case PHONEMODE:
                System.out.println(credentials.getPhoneMode());
                break;
        }
    }
}
