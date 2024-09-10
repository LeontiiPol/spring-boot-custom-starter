package ru.polovinko.springbootcustomstarter.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import ru.polovinko.springbootcustomstarter.dto.DeprecatedClassDto;
import ru.polovinko.springbootcustomstarter.dto.DeprecatedClassesResponse;

@Log4j2
@RequiredArgsConstructor
public class DeprecatedClassesServiceImpl implements DeprecatedClassesService {

    private final DeprecatedAnnotationProcessor annotationProcessor;

    public DeprecatedClassesResponse getDeprecatedClasses() {
        log.info("Getting deprecated classes from context");
        return new DeprecatedClassesResponse()
                .setDeprecatedClasses(
                        annotationProcessor.getDeprecatedClasses()
                                .stream()
                                .map(dc -> new DeprecatedClassDto().setName(dc.getName()))
                                .toList()
                );
    }
}
