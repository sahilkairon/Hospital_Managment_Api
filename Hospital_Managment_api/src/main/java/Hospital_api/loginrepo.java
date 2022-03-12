package Hospital_api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface loginrepo extends CrudRepository<login, String> {

}
