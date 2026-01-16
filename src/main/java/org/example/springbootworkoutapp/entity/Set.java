package org.example.springbootworkoutapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "set", schema = "workout")
public class Set {
    @Id
    @Column(name = "set_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int set_id;

    @Column(name = "reps")
    private int reps;

    @Column(name = "weight")
    private Float weight;

    public int getSet_id() {
        return set_id;
    }
    public void setSet_id(int set_id) {
        this.set_id = set_id;
    }
    public int getReps() {
        return reps;
    }
    public void setReps(int reps) {
        this.reps = reps;
    }
    public Float getWeight() {
        return weight;
    }
    public void setWeight(Float weight) {
        this.weight = weight;
    }


}
