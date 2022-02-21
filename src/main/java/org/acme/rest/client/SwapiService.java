package org.acme.rest.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/api")
@RegisterRestClient(configKey="starwars-api")
public interface SwapiService {

    @GET
    @Path("/starships/{id}")
    StarShip getStarshipById(@PathParam String id);
}
