package org.evil.service;

import org.evil.domain.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/shop")
public class JerseyRest {
    //store Cars assortment
    private static Cars[] carsData = {
            new Cars("1", "BMW", "E", "BMW E60", "White",20000),
            new Cars("2", "BMW", "E", "BMW E90", "Blue",15000),
            new Cars("3", "Mercedes", "F", "Mercedes-Benz F200", "Red",12000),
            new Cars("4", "Mercedes", "F", "Mercedes-Benz F400", "Black",15000),
            new Cars("5", "Porsche", "S", "Porsche 911 Turbo S", "Red",20000)
    };
    // the number of products in the store
    private static int[] quantityData = {0, 2, 3, 5, 1};
    private static StoreAssortment storeAssortment = new StoreAssortment(carsData, quantityData);

    /**
     * // EXAMPLE POST REQUEST
     *
     * POST http://localhost:8081/RestExample/rest/shop/payment
     * Accept: application/json
     * Content-Type: application/json
     *
     * {
     *   "productId": "123",
     *   "quantity": 2
     * }
     *
     */

    @POST
    @Path("/payment")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response buyCars(UserOrder userOrder) {
        int size = storeAssortment.getCarss().length;
        for (int i = 0; i < size; i++) {
            Cars currentCars = storeAssortment.getCarss()[i];
            if (currentCars.getId().equals(userOrder.getProductId())) {
                double orderPrice = currentCars.getPrice() * userOrder.getQuantity();
                PaymentResult goodResult = new PaymentResult(
                        currentCars.toString(),
                        userOrder.getQuantity(),
                        orderPrice,
                        "Buy successful!");
                return Response.ok(goodResult).build();
            }
        }
        PaymentResult badResult = new PaymentResult(
                userOrder.getProductId(),
                userOrder.getQuantity(),
                0,
                "Buy failure! Model with id = " + userOrder.getProductId() + " not found");
        return Response.ok(badResult).build();
    }

/*
    @GET
    @Path("/assortment")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStoreCatalog() {
        return Response.ok(storeAssortment).build();
    }

 */
}
