package oh.study.makeprojectbygradle;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * The interface Japaness repository.
 */
public interface WordsRepository extends JpaRepository<Words,Integer> {
    @Query(value = "SELECT max(Id) FROM Words ")
    Integer getMaxId();
}
