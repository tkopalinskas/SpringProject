package it.akademija;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value= "/api/products")
public class ProductControler {
    private final ProductDao productDao;

   @RequestMapping(method = RequestMethod.GET,value = "/create")
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
    public List<Products> getProduktai(){
        return productDao.getProducts();
   }
}
