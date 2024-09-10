package ru.polovinko.springbootcustomstarter.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class DeprecatedClassDto {

    private String name;
}
