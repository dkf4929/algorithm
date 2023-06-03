import lv2.rate70.BinaryTranslation;

public class Main {
    public static void main(String[] args) {
        BinaryTranslation s = new BinaryTranslation();
        int[] solution = s.solution("110010101001");

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}