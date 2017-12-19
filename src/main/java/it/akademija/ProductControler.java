package it.akademija;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@Api (value = "Product")
@RestController
@RequestMapping(value= "/api/products")
public class ProductControler {
    private final ProductDao productDao;

   @RequestMapping(method = RequestMethod.GET,value = "/create")
   @ApiOperation(value="Create products",notes="Creates Product")
    public void createProduct(){
        Products produktas = new Products(1,"justas","img","good",2.2);
        productDao.createProduct(produktas);


   }
   @RequestMapping(path="/delete/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser (@PathVariable final String name){
       System.out.println("Deleting user: " + name);
       productDao.deleteProduct("justas");
   }
   @Autowired
    public ProductControler(ProductDao productDao){
        this.productDao = productDao;
   }
   @RequestMapping(method = RequestMethod.GET)
   @ApiOperation(value="Get products",notes="product information")
    public List<Products> getProduktai(){
        return productDao.getProducts();
   }
}
