package date;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Objects.nonNull;

public class DateWorkout {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //long value = -55159488000000L;
        long value = -14825289600000l;
//        ISODate("2021-03-07T00:00:00.000Z"),
        Date date = new Date(value);
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.sss'Z'");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
//            Date formatedDate = format.parse("1677-11-11T00:00:00.000Z");
            Date formatedDate = format.parse("1677-11-11");
            System.out.println(formatedDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        String dateValue = format.format(date);
        System.out.println(dateValue);
        String year = "2022";

        dateValue = year + dateValue.substring(4);

        System.out.println(dateValue);
        BigInteger decimal = new BigDecimal("2.11105130082902221E+18").toBigInteger();
//        System.out.println(decimal);
        Map<String,Object> map = getValueMap("2.22044604925031E-16 Pieces");
        map.values().forEach(System.out::println);
    }

    private static Map<String, Object> getValueMap(String value) {
        Map<String, Object> valueMap = new LinkedHashMap<>();
        valueMap.put("VALUE", 0.0);
        valueMap.put("UOM", "");
        try {
            if (nonNull(value)) {
                String[] values = value.trim().split(" ");
                if (values.length == 2) {
                    if(values[0].contains("E") || values[0].contains("e")) {
                        valueMap.put("VALUE", new BigDecimal(values[0]).toBigInteger());
                    } else {
                        valueMap.put("VALUE", Double.valueOf(values[0]));
                    }
                    valueMap.put("UOM", values[1]);
                }
            }
        } catch (Exception ex) {
//            log.info("Error in conversion", ex);
        }
        return valueMap;
    }
}