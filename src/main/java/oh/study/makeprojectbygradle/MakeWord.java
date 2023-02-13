package oh.study.makeprojectbygradle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class MakeWord {

    WordsRepository wordsRepository;
    public MakeWord(@Autowired WordsRepository wordsRepository)
    {
        this.wordsRepository = wordsRepository;
    }
    public String Service()
    {

        int max =  wordsRepository.getMaxId()+1;
        Random random = new Random();
        int rnum = random.nextInt(max);
        Optional<Words> words = wordsRepository.findById(rnum);
        String randomKey = words.orElseThrow().getKorean();
        String randomValue = words.orElseThrow().getJapaness();
        String randomKeyValue = randomKey + "-" + randomValue;

        return randomKeyValue;
    }
}
