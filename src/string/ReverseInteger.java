package string;


public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        int x = 123;
//        Integer x = Integer.MAX_VALUE;
        System.out.println(reverseInteger.reverse(x));
    }
//    public int reverse() {
//        Long x = 9646324351L;
//        String value =  String.valueOf(x);
//
//        StringBuilder stringBuilder = new StringBuilder();
//        int reversedElement = 0;
//        if(value.charAt(0) == '-') {
//            stringBuilder.append(String.valueOf(x).substring(1));
//            stringBuilder.reverse();
//            reversedElement = Integer.parseInt("-" + stringBuilder.toString());
//        } else {
//            stringBuilder.append(value);
//            stringBuilder.reverse();
//            reversedElement = Integer.parseInt(stringBuilder.toString());
//        }
//        return reversedElement;
//    }

    public int reverse(int x) {
        if(x > Integer.MAX_VALUE) {
            return 0;
        }
        int sum = 0;
        while(x != 0) {
            if ((sum * 10l) > Integer.MAX_VALUE || (sum * 10l) < Integer.MIN_VALUE) {
                return 0;
            }
            sum = sum * 10  + x % 10;
            x = x / 10;
        }
        return sum;
    }



}
