package lis.controllers;

import lis.exceptions.NotFoundException;
import lis.models.Patient;
import lis.models.SinglePatient;
import lis.models.requests.PatientRequest;
import lis.services.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/patients")
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public List<Patient> findAll(){
        return patientService.findAll(Patient.class);
    }

    @GetMapping("/single-patient/{id}")
    public SinglePatient findSinglePatientById(@PathVariable Integer id) throws NotFoundException{
        return patientService.findById(id, SinglePatient.class);
    }

    @GetMapping("/{id}")
    public Patient findById(@PathVariable Integer id) throws NotFoundException {
        return patientService.findById(id, Patient.class);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SinglePatient insert(@RequestBody PatientRequest patientRequest) throws NotFoundException {
        return patientService.insert(patientRequest,SinglePatient.class);
    }
    @PutMapping("/{id}")
    public SinglePatient update(@PathVariable Integer id,@RequestBody PatientRequest countryRequest) throws NotFoundException{
        return patientService.update(id,countryRequest,SinglePatient.class);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id)throws NotFoundException{
        patientService.delete(id);
    }
}
