package com.mystore.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.mystore.base.Flib;

public class DataProviders {
	
	private static final String EXCL_PATH = null;
	Flib obj=new Flib();
	
	@DataProvider(name="crendials")
	public void getCreds() throws IOException
	{
	Flib flib = new Flib();

	int rc = flib.getRowcount("./TestData/Testdata.xlsx","validcreds");

	for(int i=0; i<rc;i++)
	{
		String username = flib.readExcelData(EXCL_PATH, "validcreds", i, 0);
		String password = flib.readExcelData(EXCL_PATH, "validcreds", i, 1);
	
	}
}

	/*public Object[][] getEmailData() throws IOException
	{
		// Total row count
		int rows=obj.getRowcount("./TestData/Testdata.xlsx","validcreds");
		int coloumn=obj.getColoumnCount("./TestData/Testdata.xlsx","validcreds");
		int actRows=rows-1;
		Object[][] data=new Object[actRows][coloumn];
		
		for(int i=0; i<actRows; i++)
		{
			for(int j=0;j<coloumn;j++)
			{
				data[i][j]=obj.readExcelData(EXCL_PATH, "validcreds", j, i+2);
			}
		}
	}
	return data;
*/
}
