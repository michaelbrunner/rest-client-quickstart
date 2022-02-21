package org.acme.rest.provider;

import org.acme.rest.client.StarShip;
import org.acme.rest.client.SwapiService;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/starwars")
public class StartWarsRessource {
    @Inject
    @RestClient
    SwapiService swapiService;

    @GET
    @Path("/starships/{id}")
    public StarShip getStarShipById(@PathParam String id) {
        return swapiService.getStarshipById(id);
    }
}
