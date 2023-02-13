package oh.study.makeprojectbygradle;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Japanesswords.
 */
@Data
@Entity
@NoArgsConstructor
public class Words {
    @Builder
    public Words(Integer id, String japaness, String korean) {
        Id = id;
        this.japaness = japaness;
        this.korean = korean;
    }

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Integer Id;

    String japaness;
    String korean;


}
