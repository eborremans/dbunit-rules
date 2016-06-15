package com.github.dbunit.rules.assertion;

import org.dbunit.DatabaseUnitException;
import org.dbunit.assertion.FailureHandler;
import org.dbunit.dataset.ITable;

/**
 * Created by rmpestano on 5/28/16.
 */
public class DataSetAssertion {

    private static final DataSetAssert INSTANCE = new DataSetAssert();



    public static void assertEquals(ITable expectedDataSet,
                                    ITable actualDataSet, String[] ignoreCols)
            throws DatabaseUnitException {
        INSTANCE.assertEqualsIgnoreCols(expectedDataSet, actualDataSet, ignoreCols);
    }


}
