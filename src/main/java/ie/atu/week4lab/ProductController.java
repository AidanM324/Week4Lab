package ie.atu.week4lab;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/product")
public class ProductController {
    List<Product> productList = new ArrayList<>();

    @GetMapping("/getProducts")
    public List<Product> getProducts()
    {
        return productList;
    }

    @PostMapping("/addProduct")
    public List<Product> Product(@Valid @RequestBody Product product)
    {
        productList.add(product);
        return productList;
    }
}
