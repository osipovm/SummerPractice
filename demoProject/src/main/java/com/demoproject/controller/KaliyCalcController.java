package com.demoproject.controller;

import com.demoproject.Service.KaliyCalcService;
import com.demoproject.Service.PercentCalcService;
import com.demoproject.model.KaliyCalc;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class KaliyCalcController {
    private final KaliyCalcService kaliyCalcService;
    private final PercentCalcService percentCalcService;


    @GetMapping("/kaliycalc")
    public String main(Model model) {
        model.addAttribute("calcs", kaliyCalcService.calculations());
        return "kaliycalc";
    }

    @PostMapping("/kaliycalc/calculate")
    public String create(KaliyCalc calc) {
        kaliyCalcService.saveCalc(calc);
        return "redirect:/kaliycalc";
    }



}
