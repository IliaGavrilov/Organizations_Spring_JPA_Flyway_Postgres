package com.example.organizations;

import com.example.organizations.domain.Organization;
import com.example.organizations.domain.OrganizationSpecs;
import com.example.organizations.repos.OrganizationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.List;


@Controller
public class IndexController {
    @Autowired
    private OrganizationRepo organizationRepo;

    @GetMapping(value = {"/", "add", "search"})
    public String main(Map<String, Object> model) {
        Iterable<Organization> organizations = organizationRepo.findAll();
        model.put("organizations", organizations);
        return "index";
    }

    @PostMapping("add")
    public String add(@RequestParam String tax, @RequestParam String reg, @RequestParam String name, @RequestParam String region,
                      @RequestParam String city, @RequestParam String address,
                      Map<String, Object> model) {
        Organization organization = new Organization(tax, reg, name, region, city, address);
        organizationRepo.save(organization);
        Iterable<Organization> organizations = organizationRepo.findAll();
        model.put("organizations", organizations);
        return "index";
    }

    @PostMapping("search")
    public String search(@RequestParam(name="tax", required=false, defaultValue="*") String tax,
                         @RequestParam(name="reg", required=false, defaultValue="*") String reg,
                         @RequestParam(name="name", required=false, defaultValue="*") String name,
                         @RequestParam(name="region", required=false, defaultValue="*") String region,
                         @RequestParam(name="city", required=false, defaultValue="*") String city,
                         @RequestParam(name="address", required=false, defaultValue="*") String address,
                         Map<String, Object> model) {
        Iterable<Organization> organizations;
        List<String> list = new ArrayList<>(Arrays.asList(tax, reg, name, region, city, address));

        if (list.stream().anyMatch(e -> !e.equals("*"))) {
            organizations = organizationRepo.findAll(OrganizationSpecs.getOrganizationsByTaxAndRegAndNameAndRegionAndCityAndAddress(tax, reg, name, region, city, address));
        } else {
            organizations = organizationRepo.findAll();
        }
        model.put("organizations", organizations);
        return "index";
    }
}
