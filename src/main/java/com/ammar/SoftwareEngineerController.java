package com.ammar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
        return List.of(
            new SoftwareEngineer(1, "Ammar", "js, node, react"),
            new SoftwareEngineer(2, "Hana", "js, node, react")
        );
    }
}
