package oh.study.makeprojectbygradle;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Random;

@Service
public class TestServcie {
    public String Service(String a)
    {
        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("사과", "りんご");
        dictionary.put("바나나", "バナナ");
        dictionary.put("귤", "オレンジ");
        dictionary.put("오렌지", "オレンジ");
        dictionary.put("딸기", "いちご");
        dictionary.put("멜론", "メロン");
        dictionary.put("사자", "ライオン");
        dictionary.put("고양이", "ネコ");
        dictionary.put("강아지", "子犬");
        dictionary.put("곰", "グマ");
        dictionary.put("양", "羊");
        dictionary.put("토끼", "ウサギ");
        dictionary.put("여우", "キツネ");
        dictionary.put("사슴", "カモ");
        dictionary.put("개", "犬");
        dictionary.put("돼지", "ブタ");
        dictionary.put("소", "牛");
        dictionary.put("말", "馬");
        dictionary.put("도시", "都市");
        dictionary.put("마을", "村");
        dictionary.put("숲", "森林");
        dictionary.put("하천", "川");
        dictionary.put("산", "山");
        dictionary.put("바다", "海");
        dictionary.put("우주", "宇宙");
        dictionary.put("해", "日");
        dictionary.put("달", "月");
        dictionary.put("별", "星");
        dictionary.put("빛", "光");
        dictionary.put("어둠", "暗闇");
        dictionary.put("새", "鳥");
        dictionary.put("생쥐", "ハムスター");
        dictionary.put("연꽃", "恋花");
        dictionary.put("나무", "木");
        dictionary.put("잎", "葉");
        dictionary.put("꽃", "花");
        dictionary.put("그림자", "影");
        dictionary.put("색", "色");
        dictionary.put("소리", "音");
        dictionary.put("말", "言葉");

        Random random = new Random();
        Object[] keys = dictionary.keySet().toArray();
        String randomKey = (String)keys[random.nextInt(keys.length)];
        String randomValue = dictionary.get(randomKey);
        String randomKeyValue = randomKey + "-" + randomValue;

        return randomKeyValue;
    }
}
