package org.example.springbootworkoutapp.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;
@Schema(description = "Запрос на создание/обновление занятия")
public class WorkoutRequest {

    @NotBlank(message = "Дата должна быть заполнена")
    private Date date;

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

}
