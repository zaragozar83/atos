package com.coffee.demo.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    private Integer id;
    private String country;
    private String region;
    private String city;
    private Double latitude;
    private Double longitude;
}
