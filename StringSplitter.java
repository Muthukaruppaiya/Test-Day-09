package DAY09;

import java.util.Scanner;

public class StringSplitter {

    public static class Result {
        String output1;
        String output2;
        String output3;

        public Result(String output1, String output2, String output3) {
            this.output1 = output1;
            this.output2 = output2;
            this.output3 = output3;
        }
    }

    public static Result encodeStrings(String input1, String input2, String input3) {
        String[] parts1 = splitString(input1);
        String[] parts2 = splitString(input2);
        String[] parts3 = splitString(input3);

        String output1 = parts1[0] + parts2[1] + parts3[2];
        String output2 = parts1[1] + parts2[2] + parts3[0];
        String output3 = parts1[2] + parts2[0] + parts3[1];
        output3 = toggleCase(output3);

        return new Result(output1, output2, output3);
    }

    private static String[] splitString(String input) {
        int len = input.length();
        int partLen = len / 3;
        int extra = len % 3;

        String front, middle, end;

        if (extra == 0) {
            front = input.substring(0, partLen);
            middle = input.substring(partLen, 2 * partLen);
            end = input.substring(2 * partLen);
        } else if (extra == 1) {
            front = input.substring(0, partLen);
            middle = input.substring(partLen, partLen + partLen + 1);
            end = input.substring(partLen + partLen + 1);
        } else { // extra == 2
            front = input.substring(0, partLen + 1);
            middle = input.substring(partLen + 1, partLen + partLen + 1);
            end = input.substring(partLen + partLen + 1);
        }

        return new String[]{front, middle, end};
    }

    private static String toggleCase(String input) {
        StringBuilder toggled = new StringBuilder(input.length());
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c));
            } else {
                toggled.append(Character.toUpperCase(c));
            }
        }
        return toggled.toString();
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        String input3 = sc.next();

        Result result = encodeStrings(input1, input2, input3);

        System.out.println("Output1: " + result.output1);
        System.out.println("Output2: " + result.output2);
        System.out.println("Output3: " + result.output3);
    }
}
