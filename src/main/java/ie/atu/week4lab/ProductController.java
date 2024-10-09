package ie.atu.week4lab;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/product")
public class ProductController {
    List<Product> productList = new ArrayList<>();

    @GetMapping("/getProducts")
    public String getProducts()
    {
        return productList;
    }

    @PostMapping("/addProduct")
    public String Product(@RequestBody Product product)
    {
        productList.add(product);
        return productList;
    }
}
