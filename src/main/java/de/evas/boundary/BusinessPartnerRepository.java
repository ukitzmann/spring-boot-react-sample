package de.evas.boundary;

import de.evas.domain.BusinessPartner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BusinessPartnerRepository extends JpaRepository<BusinessPartner, Long> {

    List<BusinessPartner> findAll();

}
