package com.ibm.zosconnect.api;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.annotation.security.RolesAllowed;

import org.eclipse.microprofile.metrics.*;
import org.eclipse.microprofile.metrics.annotation.*;

@Path("/update")
@ApplicationScoped

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-11-16T23:05:50.732Z[Etc/UTC]")

public class UpdateApi {

    @Context
    private Application application;

    @Context
    private UriInfo uriInfo;

    @Context
    private HttpHeaders headers;

    @Context
    private SecurityContext securityContext;

    @Inject
    com.ibm.zosconnect.engine.Operation operation;

    @Inject
    MetricRegistry metricRegistry;

    @PUT
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    
    @SimplyTimed(name = "putCScustupdTime", tags = { "method=PUT"}, absolute = true)
    @Counted(name = "putCScustupdCount", absolute = true)
    public Response putCScustupd(@Context HttpServletRequest request, String body) {

        com.ibm.zosconnect.engine.OperationRequest opRequest = new com.ibm.zosconnect.engine.OperationRequest(request,
                                                                                                body,
                                                                                                headers,
                                                                                                uriInfo,
                                                                                                securityContext.getUserPrincipal(),
                                                                                                Thread.currentThread().getContextClassLoader(),
                                                                                                "/update");

        opRequest.setMetricRegistry(metricRegistry);

        com.ibm.zosconnect.engine.OperationResponse opResponse = operation.processOperation(opRequest);

        return Response.status(opResponse.getResponseStatus())
                        .entity(opResponse.getBean())
                        .replaceAll(opResponse.getHeaders())
                        .cookie(opResponse.getCookiesArray())
                        .build();
    }

}
