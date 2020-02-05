package com.coffee.demo.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DataSource {

    private String country;
    private String region;
    private String city;
    private Double latitude;
    private Double longitude;
}
