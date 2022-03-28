package com.globant.tc.scooter.accountmercado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMercadoRepository extends JpaRepository<LinkAccountMercado, Integer> {

}
