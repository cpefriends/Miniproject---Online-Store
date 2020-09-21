package com.onlinestore.onlinestore.Core.Security;

public class SecurityConstants {
    public static final String SECRET = "458c169661c0434787e200efccdd2b62";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/user/sign-up";
}
