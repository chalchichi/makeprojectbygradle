package oh.study.makeprojectbygradle;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * The type Japanesswords.
 */
@Data
@Entity
public class Words {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Integer Id;

    String japaness;
    String korean;
}
