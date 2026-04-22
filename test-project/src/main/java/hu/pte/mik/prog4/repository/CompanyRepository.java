package hu.pte.mik.prog4.repository;

import hu.pte.mik.prog4.model.Company;

import java.util.List;
import java.util.Objects;

public class CompanyRepository implements ClientRepository<Company> {

    private final DataSource dataSource = DataSource.getInstance();

    @Override
    public List<Company> listAll() {
        return this.dataSource.getAllCompany();
    }

    @Override
    public void save(Company client) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Company findById(Long id) {
        return this.dataSource.getAllCompany()
                .stream().filter(company ->
                        Objects.equals(id, company.getId()))
                .findFirst()
                .orElse(null);
    }

    public Company update(Company company) {
        Company existingCompany = this.findById(company.getId());
        if(existingCompany == null) {
            return null;
        } else {
            return this.dataSource.update(company);
        }
    }

    public Company create(Company company) {
        return this.dataSource.create(company);
    }

}
