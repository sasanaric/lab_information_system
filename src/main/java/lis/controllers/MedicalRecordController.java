package lis.controllers;

import lis.exceptions.NotFoundException;
import lis.models.MedicalRecord;
import lis.models.requests.MedicalRecordRequest;
import lis.services.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
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

    @GetMapping("paginated")
    public Page<MedicalRecord> findAll(Pageable page) {
       return service.findAll(page, MedicalRecord.class);
    }

    @GetMapping("/{id}")
    public MedicalRecord getById(@PathVariable Integer id) throws NotFoundException {
        return service.findById(id, MedicalRecord.class);
    }

    @GetMapping("/invalid-records")
    public List<MedicalRecord> getInvalidRecords() {
        return service.getAllInvalidRecords();
    }

    @PostMapping()
    public MedicalRecord insert(@RequestBody MedicalRecordRequest record) throws NotFoundException {
        record.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        return service.insert(record, MedicalRecord.class);
    }

    @PutMapping("/{id}")
    public MedicalRecord update(@PathVariable Integer id, @RequestBody MedicalRecordRequest request) throws NotFoundException {
        return service.update(id, request, MedicalRecord.class);
    }

    @PostMapping("/validate/{id}")
    public MedicalRecord validate(@PathVariable Integer id) throws NotFoundException {
        return service.validate(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) throws NotFoundException {
        service.delete(id);
    }
}
