package number;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

import static java.util.Objects.nonNull;

public class ExponentialWorkout {
    public static void main(String[] args) {

//        String exponentialNumber = "1.2345678901234567890E10";
//        BigDecimal bigDecimal = new BigDecimal(exponentialNumber);
//        double number = bigDecimal.doubleValue();
//        System.out.println(number);
        Map<String, Object> valueMap = getValueMap("3.391051852E7 Yards");
//        value.setScale(5, RoundingMode.HALF_UP);
        System.out.println((Double) valueMap.get("VALUE"));

//        String s = "3.391051852E-7";
//        double decimalValue = Double.parseDouble(s);
//        var df = new DecimalFormat("#.##");
//        System.out.println(df.format(decimalValue));

        String scientificNotation = "3.391051852E7";
//        DecimalFormat formatter = new DecimalFormat("#.##");
//        System.out.println(formatter.format(Double.parseDouble(scientificNotation)));
//        String format = formatter.format(Double.parseDouble(scientificNotation));
//        System.out.println(Double.parseDouble(format));
//        BigDecimal result = new BigDecimal(scientificNotation);
//        Double doublevalue = result.doubleValue();
//        System.out.println(doublevalue);
//
//        BigDecimal formattedResult = result.setScale(5, BigDecimal.ROUND_HALF_UP);
//        double value = formattedResult.doubleValue();
//        System.out.println(value);

    }

    private static Map<String, Object> getValueMap(String value) {
        Map<String, Object> valueMap = new LinkedHashMap<>();
        valueMap.put("VALUE", 0.0);
        try {
            if (nonNull(value)) {
                String[] values = value.trim().split(" ");
                if (values.length == 2) {
                     if (values[0].contains("E") || values[0].contains("e")) {
                         BigDecimal exponentialNumber = new BigDecimal(values[0]);

                         BigDecimal formattedValue = exponentialNumber.setScale(5, RoundingMode.HALF_UP);
                         BigInteger bigInteger = new BigDecimal(values[0]).toBigInteger();
                         valueMap.put("VALUE", bigInteger.doubleValue());
                    } else {
//                        valueMap.put("VALUE", Double.valueOf(values[0]));
                    }
                }
            }
        } catch (Exception ex) {
        }
        return valueMap;
    }
}
