package com.dev4fun.reporting;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dev4fun.configuration.ReportingAppConfig;
import com.dev4fun.reporting.Report;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ReportingAppConfig.class)
public class ReportingTest {

	@Autowired
	private Report report;
	
	@Test
	public void testComponent() {
		assertNotNull(report);
		report.formatReport();
		report.formatReport();
		report.formatReport();
	}
}
