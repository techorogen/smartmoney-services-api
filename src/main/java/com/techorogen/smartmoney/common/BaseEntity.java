package com.techorogen.smartmoney.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Generated(GenerationTime.INSERT)
    private Integer id;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseEntity)) {
            return false;
        }
        return id != null && id.equals(((BaseEntity) o).getId());
    }

    //to make sure that in each Hibernate state the hashcode is the same
    //WARN: don't change this unless you know what you are doing!
    @Override
    public int hashCode() {
        return 31;
    }
}
