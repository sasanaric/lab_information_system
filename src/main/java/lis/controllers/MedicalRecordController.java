package lis.controllers;

import lis.exceptions.NotFoundException;
import lis.models.MedicalRecord;
import lis.models.requests.MedicalRecordRequest;
import lis.services.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medical-records")
public class MedicalRecordController {
    private final MedicalRecordService service;

    public MedicalRecordController(MedicalRecordService service) {
        this.service = service;
    }

    @GetMapping
    public List<MedicalRecord> getAll(){
        return service.findAll(MedicalRecord.class);
    }

    @GetMapping("/{id}")
    public MedicalRecord getById(@PathVariable Integer id) throws NotFoundException {
        return service.findById(id, MedicalRecord.class);
    }

    @PostMapping()
    public MedicalRecord insert(@RequestBody MedicalRecordRequest record) throws NotFoundException{
        return service.insert(record, MedicalRecord.class);
    }

    @PutMapping("/{id}")
    public MedicalRecord update(@PathVariable Integer id, @RequestBody MedicalRecordRequest request) throws NotFoundException {
        return service.update(id, request, MedicalRecord.class);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) throws NotFoundException {
        service.delete(id);
    }
}
