package ie.atu.week4lab;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/person")
public class ProductController {
    List<Product> personList = new ArrayList<>();

    @GetMapping("/getPersons")
    public List<Product> getPersons()
    {
        return personList;
    }

    @PostMapping("/addProduct")
    public List<Product> Product(@Valid @RequestBody Product product)
    {
        personList.add(product);
        return personList;
    }

    @PostMapping("/createPerson")
    public List<Product> Person(@Valid @RequestBody Product person)
    {
        personList.add(person);
        return personList;
    }
}
