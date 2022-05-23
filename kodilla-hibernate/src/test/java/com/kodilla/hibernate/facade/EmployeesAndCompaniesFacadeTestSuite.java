package com.kodilla.hibernate.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.FindFacade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class EmployeesAndCompaniesFacadeTestSuite {

    @Autowired
    private FindFacade findFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testFindEmployee() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieSmarckson = new Employee("Stephanie", "Smarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieSmarckson);
        employeeDao.save(lindaKovalsky);

        //When
        List<Employee> employees = findFacade.findEmployees("Sm");

        //Then
        assertEquals(2, employees.size());

        //CleanUp
        employeeDao.deleteAll();
    }

    @Test
    public void testFindCompany() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //When
        List<Company> companies = findFacade.findCompanies("er");

        //Then
        assertEquals(2, companies.size());

        //CleanUp
        companyDao.deleteAll();
    }
}
