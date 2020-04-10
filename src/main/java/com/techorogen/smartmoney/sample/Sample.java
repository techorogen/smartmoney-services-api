package com.techorogen.smartmoney.sample;

import com.techorogen.smartmoney.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Sample extends BaseEntity {
    @Column(nullable = false, length = 50)
    private String name;

    private String description;

    @Column(nullable = false)
    private LocalDate startDate;

    private LocalDate endDate;
}
