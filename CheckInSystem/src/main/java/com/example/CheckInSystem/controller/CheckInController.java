package com.example.CheckInSystem.controller;


//package com.example.check_in_check_out_system.controller;

import com.example.CheckInSystem.model.CheckIn;
import com.example.CheckInSystem.service.CheckInService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


//This can handle HTTP requests and return responses in JSON format
@RestController
@RequestMapping("/api/v1/checkins")
public class CheckInController {

    @Autowired
    private CheckInService checkInService;

    //http://localhost:8082/api/v1/checkins
    //Check-in
    @PostMapping("/{employeeId}")
    public ResponseEntity<CheckIn> checkIn(@PathVariable Long employeeId) {
        CheckIn checkIn = checkInService.checkIn(employeeId);
        return new ResponseEntity<>(checkIn, HttpStatus.CREATED);
    }

    //http://localhost:8082/api/v1/checkins/9
    //Check-out
    @PutMapping("/checkout/{checkInId}")
    public ResponseEntity<CheckIn> checkOut(@PathVariable Long checkInId) {
        CheckIn checkIn = checkInService.checkOut(checkInId);
        return ResponseEntity.ok(checkIn);
    }

    //http://localhost:8082/api/v1/checkins/checkout/20
    //Get
    @GetMapping
    public ResponseEntity<List<CheckIn>> getAllCheckIns() {
        List<CheckIn> checkIns = checkInService.getAllCheckIns();
        return ResponseEntity.ok(checkIns);
    }

    //http://localhost:8082/api/v1/checkins/20
    //Delete
    @DeleteMapping("/{checkInId}")
    public ResponseEntity<Void> deleteCheckIn(@PathVariable Long checkInId) {
        checkInService.deleteCheckIns(checkInId);
        return ResponseEntity.noContent().build();
    }

}