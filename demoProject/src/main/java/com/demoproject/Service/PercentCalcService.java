package com.demoproject.Service;



import com.demoproject.model.KaliyCalc;
import com.demoproject.model.PercentCalc;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PercentCalcService{
    private List<PercentCalc> PercentCalcList= new ArrayList<>();

    private long ID = 0;

    {
        PercentCalcList.add(new PercentCalc(++ID, 4, 20, 1));
        PercentCalcList.add(new PercentCalc(++ID, 5, 13, 1));
    }


    public List<PercentCalc> calculations () {
        return PercentCalcList;
    }


    public void saveCalc(PercentCalc PercentCalc) {
        PercentCalc.setId(++ID);
        PercentCalc.setCalculation((int) (PercentCalc.getPercent() * PercentCalc.getVolume() * 10));
        PercentCalcList.add(PercentCalc);
    }

    public void deleteCalc(Long id) {
        PercentCalcList.removeIf(PercentCalc -> PercentCalc.getId().equals(id));
    }
}
