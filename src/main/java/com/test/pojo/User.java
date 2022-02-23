package com.test.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    private Long id;

    private String name;

    private BigDecimal salary;

    private static final long serialVersionUID = 1L;
}