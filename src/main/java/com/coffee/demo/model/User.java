package com.coffee.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {


    @NotNull(message = "longitude required")
    @Min(value = -180,message = "Longitude out of bounds")
    @Max(value = 180,message = "Longitude out of bounds")
    private Double longitude;

    @NotNull(message = "longitude required")
    @Min(value = -90,message = "Longitude out of bounds")
    @Max(value = 90,message = "Longitude out of bounds")
    private Double latitude;

    private String name;

}
