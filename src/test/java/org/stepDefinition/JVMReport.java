package org.stepDefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateReports(String jsonpath) {

		// 1. add the file path

		File f = new File(System.getProperty("user.dir") + "\\AllReports\\JVMReports");

		// 2.add some details in cofig class

		Configuration con = new Configuration(f, "FACEBOOK APPLICATION");
		con.addClassifications("Platform", "Windows");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("Version", "101");
		con.addClassifications("Jdk", "1.8");

		// 3. add the jsonpath into the list

		List<String> li = new ArrayList<String>();
		li.add(jsonpath);

		// 4.Object creation report builder class

		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();

	}

}
