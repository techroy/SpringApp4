package com.nested.beans;

public class LoanApprover {

	private EmiCalculator emiCalculator;

	public void setEmiCalculator(EmiCalculator emiCalculator) {
		this.emiCalculator = emiCalculator;
	}

	public void approve(int principal, int rateOfInt, int years) {

		int cal = emiCalculator.calculate(principal, rateOfInt, years);

		if (cal > 0) {

			System.out.println("Loan is Approved");
		} else {

			System.out.println("Loan is not Approved");
		}

	}

}
