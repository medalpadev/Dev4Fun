package com.dev4fun.reporting;
import org.springframework.stereotype.Component;

@Component
public class ReportCamt implements Report {

	public ReportCamt() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean formatReport() {
		System.out.println("printing the report ..... ");
		return false;
	}

}
