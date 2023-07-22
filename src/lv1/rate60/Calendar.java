package lv1.rate60;

//2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
//
//        입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
//
//        제한 조건
//        2016년은 윤년입니다.
//        2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
//        입출력 예
//        a	b	result
//        5	24	"TUE"


import java.util.HashMap;
import java.util.Map;

public class Calendar {
    public String solution(int a, int b) {
        String answer = "";
        int plusDay = 0;
        Map<Integer, Integer> map = new HashMap<>();

        map.put(1, 31);
        map.put(2, 29);
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);

        for (Integer i = 1; i < a; i++) {
            plusDay += map.get(i);
        }

        plusDay += b - 1;

        switch (plusDay % 7) {
            case 0:
                return "FRI";
            case 1:
                return "SAT";
            case 2:
                return "SUN";
            case 3:
                return "MON";
            case 4:
                return "TUE";
            case 5:
                return "WED";
            case 6:
                return "THU";
        }

        return answer;
    }
}