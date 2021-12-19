package reto2.interfaces;

import reto2.modelo.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author shania vargas
 */

public interface InterfaceSupplements extends MongoRepository<Supplements, String> {

}