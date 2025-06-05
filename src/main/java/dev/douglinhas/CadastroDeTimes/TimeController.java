package dev.douglinhas.CadastroDeTimes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class TimeController {

    @GetMapping("/boasvindas")
    public String bemVindo () {
        return "SPORT CLUB DO RECIFE";
    }




}
