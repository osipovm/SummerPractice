package com.demoproject.controller;

import com.demoproject.Service.NatriyCalcServce;
import com.demoproject.Service.PercentCalcService;
import com.demoproject.model.NatriyCalc;
import com.demoproject.model.PercentCalc;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class NatriyCalcController {
    private final NatriyCalcServce natriyCalcServce;


    @GetMapping("/natriycalc")
    public String main(Model model) {
        model.addAttribute("calcs", natriyCalcServce.calculations());
        return "natriycalc";
    }

    @PostMapping("/natriycalc/сalculate")
    public String create(NatriyCalc calc) {
        natriyCalcServce.saveCalc(calc);
        return "redirect:/natriycalc";
    }
}
