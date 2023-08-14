package com.gp.job;

import com.gp.domain.DataIn;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomRowMapper implements RowMapper<DataIn> {

    private static final String COLUMN_TEXT1 = "text1";
    private static final String COLUMN_TEXT2 = "text2";

    @Override
    public DataIn mapRow(ResultSet resultSet, int i) throws SQLException {
        DataIn data = new DataIn();
        data.setText1(resultSet.getString(COLUMN_TEXT1));
        data.setText2(resultSet.getString(COLUMN_TEXT2));
        return data;
    }
}
