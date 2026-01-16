package org.example.springbootworkoutapp.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Schema(description = "Запрос на создание/обновление подхода")
public class SetRequest {

    @NotBlank(message = "Название подхода обязательно")
    private int reps;

    @NotBlank(message = "Название веса обязательно")
    private Float weight;

    public Float getWeight() {
        return weight;
    }
    public void setWeight(Float weight) {
        this.weight = weight;
    }
    public int getReps() {
        return reps;
    }
    public void setReps(int reps) {
        this.reps = reps;
    }

}
