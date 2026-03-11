public class MyBigNumber {

    public String sum(String stn1, String stn2) {

        StringBuilder result = new StringBuilder();

        int i = stn1.length() - 1;
        int j = stn2.length() - 1;

        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int digit1 = 0;
            int digit2 = 0;

            if (i >= 0) {
                digit1 = stn1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                digit2 = stn2.charAt(j) - '0';
                j--;
            }

            int sum = digit1 + digit2 + carry;

            int digit = sum % 10;
            carry = sum / 10;

            result.append(digit);

            System.out.println(
                    digit1 + " + " + digit2 +
                            " + carry => " + sum +
                            " | write " + digit +
                            " carry " + carry
            );
        }

        return result.reverse().toString();
    }
}
