package lis.controllers;

import lis.base.CrudController;
import lis.models.Borders;
import lis.models.requests.BordersRequest;
import lis.services.BordersService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/borders")
public class BordersController extends CrudController<Integer, BordersRequest, Borders> {
    public BordersController(BordersService service){
        super(Borders.class,service);
    }
}
