package com.stackroute.commonjavaclasses;
import com.sun.jdi.connect.IllegalConnectorArgumentsException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/* Complete the class as per the requirements given in PROBLEM.md */
public class BankDeposit {
    public String getMaturityDate(String investmentDate, Period duration)
    {
        if (investmentDate == null || investmentDate.isEmpty())
        {
            throw new IllegalArgumentException();

        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate maturityDate = LocalDate.parse(investmentDate, formatter).plus(duration);
        return maturityDate.format(formatter);
    }
    public  String getInvestmentDuration(String investmentDate,String maturityDate)
    {
        if(investmentDate==null|| maturityDate==null||investmentDate.isEmpty()||maturityDate.isEmpty())
        {
            throw new IllegalArgumentException();
        }
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        Period duration = Period.between(LocalDate.parse(investmentDate, formatter),LocalDate.parse(maturityDate, formatter));
        return "Years " +duration.getYears() + " Months " +duration.getMonths()+ " Days " +duration.getDays();
        //Period duration=Period.between(LocalDate.parse(investmentDate,formatter),LocalDate.parse(maturityDate,formatter).plus(getInvestmentDuration(String (investmentDate,String maturityDate)));
        //  return "years"+duration.getYears()+ "Months"+duration.getMonths()+"Days"+duration.getDays();
    }
}

