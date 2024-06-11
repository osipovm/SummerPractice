package com.demoproject.Service;


import com.demoproject.model.KaliyCalc;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KaliyCalcService {
    private List<KaliyCalc> KaliyCalcList = new ArrayList<>();
    private long ID = 0;

    {
        KaliyCalcList.add(new KaliyCalc(++ID, 4, 20, 1));
        KaliyCalcList.add(new KaliyCalc(++ID, 5, 13, 1));
    }


     public List<KaliyCalc> calculations () {
        return KaliyCalcList;
     }

     public void saveCalc(KaliyCalc calc) {
        calc.setId(++ID);
        calc.setPotassium(((5 - calc.getKaliy()) * 0.2 * calc.getWeight()));
         KaliyCalcList.add(calc);
     }

     public void deleteCalc(Long id) {
         KaliyCalcList.removeIf(kaliyCalc -> kaliyCalc.getId().equals(id));
     }

}
