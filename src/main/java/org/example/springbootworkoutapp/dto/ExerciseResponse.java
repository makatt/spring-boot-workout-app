package org.example.springbootworkoutapp.dto;

public class ExerciseResponse {
    private Long id;
    private String name;
    private String muscleGroup;

    public ExerciseResponse(Long id, String name, String muscleGroup) {
        this.id = id;
        this.name = name;
        this.muscleGroup = muscleGroup;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

}
