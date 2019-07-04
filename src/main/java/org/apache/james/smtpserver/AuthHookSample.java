package org.apache.james.smtpserver;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.james.protocols.smtp.SMTPSession;
import org.apache.james.protocols.smtp.hook.AuthHook;
import org.apache.james.protocols.smtp.hook.HookResult;

/**
 * This Auth hook can be used to authenticate against the james user repository
 */
public class AuthHookSample implements AuthHook {
    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void init(Configuration arg0) throws ConfigurationException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public HookResult doAuth(SMTPSession arg0, String arg1, String arg2) {
        // TODO Auto-generated method stub
        return null;
    }
}
