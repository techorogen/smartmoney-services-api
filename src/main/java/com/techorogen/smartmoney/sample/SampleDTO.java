package com.techorogen.smartmoney.sample;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

import static com.techorogen.smartmoney.util.SmartMoneyUtil.COMMON_ISO8601_DATE_FORMAT;

@Data
public class SampleDTO {
    @ApiModelProperty(hidden = true)
    private Integer id;

    @NotBlank(message = "Name must be specified")
    @Size(max = 50, message = "Name must not exceed 50 characters")
    private String name;

    @Size(max = 255, message = "Description must not exceed 255 characters")
    private String description;

    @NotNull(message = "Start date must be specified")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = COMMON_ISO8601_DATE_FORMAT)
    private LocalDate startDate;

    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = COMMON_ISO8601_DATE_FORMAT)
    private LocalDate endDate;
}
