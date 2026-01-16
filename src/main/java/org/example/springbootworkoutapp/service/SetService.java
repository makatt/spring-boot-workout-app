package org.example.springbootworkoutapp.service;

import jakarta.persistence.Id;
import org.example.springbootworkoutapp.dto.SetRequest;
import org.example.springbootworkoutapp.dto.SetResponse;
import org.example.springbootworkoutapp.entity.Set;
import org.example.springbootworkoutapp.repository.SetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SetService {

    @Autowired
    private SetRepo setRepo;

    public List<SetResponse> getAllSets() {
        return setRepo.findAll()
                .stream()
                .map(this::mapToSets)
                .collect(Collectors.toList());
    }

    public SetResponse getSetById(Long id) {
        Set set = setRepo.findById((long)id)
                .orElseThrow(() -> new RuntimeException("Sets problems"));
        return mapToSets(set);

    }

    public SetResponse addSet(SetRequest setRequest) {
        Set set = new Set();
        set.setReps(setRequest.getReps());
        set.setWeight(setRequest.getWeight());
        Set setSaved = setRepo.save(set);
        return mapToSets(setSaved);
    }

    public void deleteSetById(Long id) {
        setRepo.deleteById(id);
    }
    public void deleteAllSets() {
        setRepo.deleteAll();
    }


    public SetResponse updateSet(SetRequest setRequest, Long id) {
        Set set = new Set();
        set.setSet_id(Math.toIntExact((id)));
        set.setReps(setRequest.getReps());
        set.setWeight(setRequest.getWeight());
        Set setSaved = setRepo.save(set);
        return mapToSets(setSaved);
    }


    public SetResponse mapToSets(Set set) {
        return new SetResponse(
                set.getSet_id(),
                set.getReps(),
                set.getWeight());

    }
}
