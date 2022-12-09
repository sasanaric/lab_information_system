package lis.controllers;

import lis.base.CrudController;
import lis.base.CrudService;
import lis.models.Urine;
import lis.models.requests.UrineRequest;
import lis.services.UrineService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/results/urine")
public class UrineController extends CrudController<Integer, UrineRequest, Urine> {
    public UrineController(UrineService service) {
        super(Urine.class,service);
    }
}
