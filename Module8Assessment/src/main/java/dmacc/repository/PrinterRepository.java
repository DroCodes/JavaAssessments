/**
 * @author deondaigh - dmdaigh
 * CIS175 - Spring 2024
 * Mar 7, 2024
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Printers;

@Repository
public interface PrinterRepository extends JpaRepository<Printers, Integer> {

}
