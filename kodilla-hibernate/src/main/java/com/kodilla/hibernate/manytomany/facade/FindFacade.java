package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FindFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(FindFacade.class);
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    @Autowired
    public FindFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> findCompanies(String fragment) {
        LOGGER.info("Finding companies with given name fragment: " + fragment);
        List<Company> companies = companyDao.retrieveCompaniesByFragmentName(fragment);
        if (!companies.isEmpty()) {
            LOGGER.info("System found " + companies.size() + " companies with given fragment of name");
        } else {
            LOGGER.error("Database is empty");
        }
        return companies;
    }

    public List<Employee> findEmployees(String fragment) {
        LOGGER.info("Finding employees with given name fragment: " + fragment);
        List<Employee> employees = employeeDao.retrieveEmployeesByFragmentName(fragment);
        if (!employees.isEmpty()) {
            LOGGER.info("System found " + employees.size() + " employees with given fragment of lastname");
        } else {
            LOGGER.error("Database is empty");
        }
        return employees;
    }
}
