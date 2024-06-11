package com.demoproject.Service;

import com.demoproject.model.NatriyCalc;
import com.demoproject.model.PercentCalc;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NatriyCalcServce {
    private List<NatriyCalc> NatriyCalcList= new ArrayList<>();

    private long ID = 0;

    {
        NatriyCalcList.add(new NatriyCalc(++ID, 5, 13, 1));
        NatriyCalcList.add(new NatriyCalc(++ID, 5, 13, 1));
    }


    public List<NatriyCalc> calculations () {
        return NatriyCalcList;
    }


    public void saveCalc(NatriyCalc natriyCalc) {
        natriyCalc.setId(++ID);
        natriyCalc.setCalculation((int) (natriyCalc.getNatriy() +  0.024*(natriyCalc.getGlucoza() - 100)));
        NatriyCalcList.add(natriyCalc);
    }

    public void deleteCalc(Long id) {
        NatriyCalcList.removeIf(PercentCalc -> PercentCalc.getId().equals(id));
    }
}
