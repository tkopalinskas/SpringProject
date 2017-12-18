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
    List<Products> produktai = new ArrayList<>();
   @RequestMapping(method = RequestMethod.GET)
    public List<Products> getProducts(){
       return produktai;
   }
   @RequestMapping(method = RequestMethod.GET,value = "/create")
    public void createProduct(){
        Products produktas = new Products(1,"justas","img","good",2.2);
        produktai.add(produktas);

   }
   @RequestMapping(path="/delete/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser (@PathVariable final String name){
       Products produktas2 = new Products(2,"Phone1","img","good",2.2);
       produktai.add(produktas2);
       System.out.println("Deleting user: " + name);
       produktai.remove(produktas2);
   }
   @Autowired
    public ProductControler(ProductDao productDao){
        this.productDao = productDao;
   }
   @RequestMapping(method = RequestMethod.GET,value = "/dao")
    public List<Products> getProduktai(){
        return productDao.getProducts();
   }
}
