package ru.polovinko.springbootcustomstarter.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class DeprecatedClassesResponse {

    private List<DeprecatedClassDto> deprecatedClasses;
}
