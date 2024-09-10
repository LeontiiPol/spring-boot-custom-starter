package ru.polovinko.springbootcustomstarter.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.polovinko.springbootcustomstarter.dto.DeprecatedClassesResponse;
import ru.polovinko.springbootcustomstarter.service.DeprecatedClassesService;

@RequestMapping("/v1/api/classes")
@RestController
@RequiredArgsConstructor
public class DeprecatedController {

    private final DeprecatedClassesService deprecatedClassesService;

    @GetMapping("/deprecated")
    public ResponseEntity<DeprecatedClassesResponse> deprecatedClasses() {
        return ResponseEntity.ok(deprecatedClassesService.getDeprecatedClasses());
    }
}
