package org.example.springbootworkoutapp.dto;

public class SetResponse {
    private int set_id;
    private int reps;
    private Float weight;

    public SetResponse(int set_id, int reps, Float weight) {
        this.set_id = set_id;
        this.reps = reps;
        this.weight = weight;
    }
    public int getSet_id() {
        return set_id;
    }
    public int getReps() {
        return reps;
    }
    public Float getWeight() {
        return weight;
    }
}
