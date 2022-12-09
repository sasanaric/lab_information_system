package lis.controllers;

import lis.base.CrudController;
import lis.base.CrudService;
import lis.models.Biochemistry;
import lis.models.requests.BiochemistryRequest;
import lis.services.BiochemistryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/results/biochemistry")
public class BiochemistryController extends CrudController<Integer, BiochemistryRequest, Biochemistry> {
    public BiochemistryController(BiochemistryService service) {
        super(Biochemistry.class,service);
    }
}
