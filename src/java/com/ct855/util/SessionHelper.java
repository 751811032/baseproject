package com.ct855.util;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.core.session.SessionRegistry;

public final class SessionHelper {

    @Autowired
    SessionRegistry sessionRegistry;

    private static SessionHelper sessionHelper;

    private SessionHelper() {
        sessionHelper = this;
    }

    public static SessionRegistry getSessionRegistry() {
        return sessionHelper.sessionRegistry;
    }

    public static int getMemberCount(boolean includeExpiredSessions) {
        int count = 0;
        List<Object> principals = getSessionRegistry().getAllPrincipals();
        for (Object principal : principals) {
            count = count + getSessionRegistry().getAllSessions(principal, includeExpiredSessions).size();
        }
        return count;
    }

   
 

 
}
