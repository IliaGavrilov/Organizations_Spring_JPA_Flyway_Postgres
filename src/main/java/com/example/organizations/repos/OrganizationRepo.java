package com.example.organizations.repos;

import com.example.organizations.domain.Organization;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface OrganizationRepo extends CrudRepository<Organization, Long>, JpaSpecificationExecutor<Organization> {

}
