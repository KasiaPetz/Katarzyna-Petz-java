package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {

    @Autowired
    CompanyDao companyDao;

    public List<Company> getCompaniesByFieldFragment(String field, String fragment) {
        return companyDao.getCompaniesByFieldFragment(field, "%"+fragment+"%");
    }



}
