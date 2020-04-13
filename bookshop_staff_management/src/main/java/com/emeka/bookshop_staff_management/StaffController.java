package com.emeka.bookshop_staff_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StaffController {

    @Autowired
    private StaffRepository staffRepository;

    @GetMapping("/staff/{id}")
    public String getStaffName(@PathVariable int id) {
        Optional<Staff> staff = staffRepository.findById(id);
        return String.format("%1$s %2$s", staff.get().getSurname(), staff.get().getFirstName());
    }

    @PostMapping("/staff")
    public String createStaff(@RequestBody Staff staff) {
        staffRepository.save(staff);
        return "Staff created successfully";
    }
}
