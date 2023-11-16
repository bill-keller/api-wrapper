package com.ibm.zosconnect.api;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath(RestResourceRoot.APPLICATION_PATH)
public class RestApplication extends Application {

    /*
     * Per instance JAX-RS classes
     */
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(com.ibm.zosconnect.api.UpdateApi.class);
        return classes;
    }
}
