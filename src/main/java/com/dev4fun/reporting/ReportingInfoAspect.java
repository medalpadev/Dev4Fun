package com.dev4fun.reporting;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ReportingInfoAspect {

	public ReportingInfoAspect() {
	}

	@Before("execution(** com.dev4fun.reporting.Report.formatReport(..) )")
	public void preparePrinting() {
		System.out.println("****** Prepare printing report ****** ");
	}
	
	@After("execution(** com.dev4fun.reporting.Report.formatReport(..) )")
	public void ClearPrintingRessources() {
		System.out.println("****** Clearing ressources for printing report ****** ");
	}
}
