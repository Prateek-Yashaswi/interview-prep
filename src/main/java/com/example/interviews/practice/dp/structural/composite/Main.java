package com.example.interviews.practice.dp.structural.composite;

import com.example.interviews.practice.dp.structural.composite.departments.FinancialDepartment;
import com.example.interviews.practice.dp.structural.composite.departments.SalesDepartment;

public class Main {
    public static void main(String[] args) {
        Department sales = new SalesDepartment(1, "Sales A");
        Department financial = new FinancialDepartment(1, "Financial A");

        HeadDepartment head = new HeadDepartment(1, "HEAD A");
        head.addDepartment(sales);
        head.addDepartment(financial);

        head.printDepartment();
    }
}
