package com.demoproject.controller;

import com.demoproject.Service.KaliyCalcService;
import com.demoproject.Service.PercentCalcService;
import com.demoproject.model.KaliyCalc;
import com.demoproject.model.PercentCalc;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class PercentCalcController {
    private final PercentCalcService percentCalcService;


    @GetMapping("/percentcalc")
    public String main(Model model) {
        model.addAttribute("calcs", percentCalcService.calculations());
        return "percentcalc";
    }

    @PostMapping("/percentcalc/сalculate")
    public String create(PercentCalc calc) {
        percentCalcService.saveCalc(calc);
        return "redirect:/percentcalc";
    }



}
