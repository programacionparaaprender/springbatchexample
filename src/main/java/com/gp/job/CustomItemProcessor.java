package com.gp.job;

import com.gp.domain.DataIn;
import com.gp.domain.DataOut;
import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<DataIn,DataOut> {

    @Override
    public DataOut process(DataIn item) throws Exception {
        DataOut dataOut = new DataOut();
        dataOut.setText1(item.getText1().toUpperCase());
        dataOut.setText2(item.getText2().toUpperCase());
        return dataOut;
    }

}
