package lv2.rate70;

//JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
//문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
//
//제한 조건
//s는 길이 1 이상 200 이하인 문자열입니다.
//s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
//숫자는 단어의 첫 문자로만 나옵니다.
//숫자로만 이루어진 단어는 없습니다.
//공백문자가 연속해서 나올 수 있습니다.
//입출력 예
//s	return
//"3people unFollowed me"	"3people Unfollowed Me"
//"for the last week"	"For The Last Week"

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JadenCaseString {
    public String solution(String s) {
        String answer = "";

        List<String> strList = Arrays.stream(s.split(" "))
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        String last = strList.get(strList.size() - 1);
        int blank = 0;

        if (s != null && last != null && s.contains(last)) {
            String substring = s.substring(s.lastIndexOf(last));

            if (substring.contains(" ")) {
                blank = s.substring(s.lastIndexOf(last), s.length()).length() - last.length();
            }
        }

        for (int i = 0; i < strList.size(); i++) {
            strList.get(i).replace(" ", "");

            String first = "";

            if (strList.get(i).length() > 0) {
                first = strList.get(i).substring(0, 1);
            }

            if (first.matches("[a-zA-Z]")) { // 문자인지 확인
                strList.get(i).toLowerCase();
                answer += first.toUpperCase() + strList.get(i).substring(1, strList.get(i).length()) + " ";
            } else {
                answer += strList.get(i) + " ";
            }

            if (i == strList.size() - 1) {
                answer = answer.substring(0, answer.length() - 1);

                for (int j = 0; j < blank; j++) {
                    answer += " ";
                }
            }
        };

        return answer;
    }
}
