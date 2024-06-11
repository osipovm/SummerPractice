package com.demoproject.controller;

import com.demoproject.Service.KaliyCalcService;
import com.demoproject.Service.NatriyCalcServce;
import com.demoproject.Service.PercentCalcService;
import com.demoproject.model.KaliyCalc;
import com.demoproject.model.PercentCalc;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MainController{
    private final PercentCalcService percentCalcService;
    private final KaliyCalcService kaliyCalcService;
    private final NatriyCalcServce natriyCalcServce;

    @GetMapping("/")
    public String main() {
        return "main";
    }

}
