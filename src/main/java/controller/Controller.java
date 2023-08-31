package controller;

import java.time.LocalDateTime;

@RestController
public class Controller {

    @Operation(
        summary = "Gets the ids of the similar product.",
        description= "Returns the similar products to a given one ordered by similarity")
    @ApiResponses(value = {
        @ApiResponse(
            responseCode = "200",
            description = "OK",
            , content =  application/json = schema = $ref: '#/components/schemas/ProductDetail'),
        @ApiResponse(responseCode = "404", description = "Product Not found")
    })
    @GetMapping(value = "localhost:5000/get-product-similarids")
    Response<void> getProductSimilarids(@RequestParam(required = true) final String productId){
        System.out.println("Devolvera similarids");
    }

}
