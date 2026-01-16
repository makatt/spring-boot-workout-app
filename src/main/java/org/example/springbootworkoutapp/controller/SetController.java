package org.example.springbootworkoutapp.controller;


import jakarta.validation.Valid;
import org.example.springbootworkoutapp.dto.ExerciseResponse;
import org.example.springbootworkoutapp.dto.SetRequest;
import org.example.springbootworkoutapp.dto.SetResponse;
import org.example.springbootworkoutapp.entity.Set;
import org.example.springbootworkoutapp.service.SetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/set")
public class SetController {

    @Autowired
    private SetService setService;

    @GetMapping("")
    public List<SetResponse> getAllSet() { return setService.getAllSets();}

    @GetMapping("{id}")
    public SetResponse getSetById(@PathVariable Long id) {
        return setService.getSetById(id);
    }

    @PostMapping("")
    public SetResponse addSet(@Valid @RequestBody SetRequest request) {
        return setService.addSet(request);
    }

    @PostMapping("/{id}")
    public SetResponse updateSet(@PathVariable Long id, @Valid @RequestBody SetRequest request) {
        return setService.updateSet(request,id);
    }

    @DeleteMapping("/{id}")
    public void deleteSet(@Valid @PathVariable Long id) {
        setService.deleteSetById(id);
    }

    @DeleteMapping("")
    public void deleteAllSets() {
        setService.deleteAllSets();
    }


}
