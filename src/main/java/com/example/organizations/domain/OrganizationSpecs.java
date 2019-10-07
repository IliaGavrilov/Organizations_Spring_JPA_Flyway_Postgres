package com.example.organizations.domain;

import org.springframework.data.jpa.domain.Specification;
import javax.persistence.criteria.Predicate;

public class OrganizationSpecs {

    public static Specification<Organization> getOrganizationsByTaxAndRegAndNameAndRegionAndCityAndAddress(String tax,
                  String reg, String name, String region, String city, String address) {
        return Specification.where(getOrganizationsByTax(tax)).and(getOrganizationsByReg(reg)).and(getOrganizationsByName(name)).and(getOrganizationsByRegion(region)).and(getOrganizationsByCity(city)).and(getOrganizationsByAddress(address));
    }

    public static Specification<Organization> getOrganizationsByTax(String tax) {
        return (root, query, criteriaBuilder) -> {
            Predicate likePredicate = criteriaBuilder.like(root.get("tax"), tax.replace("*", "%"));
            return likePredicate;
        };
    }

    public static Specification<Organization> getOrganizationsByReg(String reg) {
        return (root, query, criteriaBuilder) -> {
            Predicate likePredicate = criteriaBuilder.like(root.get("reg"), reg.replace("*", "%"));
            return likePredicate;
        };
    }

    public static Specification<Organization> getOrganizationsByName(String name) {
        return (root, query, criteriaBuilder) -> {
            Predicate likePredicate = criteriaBuilder.like(root.get("name"), name.replace("*", "%"));
            return likePredicate;
        };
    }

    public static Specification<Organization> getOrganizationsByRegion(String region) {
        return (root, query, criteriaBuilder) -> {
            Predicate likePredicate = criteriaBuilder.like(root.get("region"), region.replace("*", "%"));
            return likePredicate;
        };
    }

    public static Specification<Organization> getOrganizationsByCity(String city) {
        return (root, query, criteriaBuilder) -> {
            Predicate likePredicate = criteriaBuilder.like(root.get("city"), city.replace("*", "%"));
            return likePredicate;
        };
    }

    public static Specification<Organization> getOrganizationsByAddress(String address) {
        return (root, query, criteriaBuilder) -> {
            Predicate likePredicate = criteriaBuilder.like(root.get("address"), address.replace("*", "%"));
            return likePredicate;
        };
    }
}