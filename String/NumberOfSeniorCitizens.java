package String;

public class NumberOfSeniorCitizens {
    public static void main(String[] args) {
        String[] details = { "9751302862F0693", "3888560693F7262", "5485983835F0649", "2580974299F6042",
                "9976672161M6561",
                "0234451011F8013", "4294552179O6482" };

        System.out.println(countSeniors(details));
    }

    static int countSeniors(String[] details) {
        int count = 0;

        for (String str : details) {
            int age = Integer.parseInt(str.substring(11, 13));

            if (age > 60) {
                count++;
            }
        }
        return count;
    }
}
