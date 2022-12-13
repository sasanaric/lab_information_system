package lis.controllers;

import lis.base.CrudController;
import lis.base.CrudService;
import lis.models.Hematology;
import lis.models.requests.HematologyRequest;
import lis.services.HematologyService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/results/hematology")
public class HematologyController extends CrudController<Integer, HematologyRequest, Hematology> {
    public HematologyController(HematologyService service) {
        super(Hematology.class,service);
    }
}
