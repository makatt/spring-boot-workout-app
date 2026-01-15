package org.example.springbootworkoutapp.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "Запрос на создание/обновление упражнения")
public class ExerciseRequest {

    @NotBlank(message = "Название упражнения обязательно")
    private String name;

    @NotBlank(message = "Группа мышц обязательна")
    private String muscleGroup;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }
    public void setMuscleGroup(String muscleGroup) {
        this.muscleGroup = muscleGroup;
    }
}
