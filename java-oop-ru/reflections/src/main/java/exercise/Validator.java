package exercise;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Validator {
    private static final String LESS_THAN = "length is less than 4";
    private static final String CANT_BE_NULL = "can't be null";
    public static List<String> validate(Address obj) throws IllegalAccessException {
        List<String> result = new ArrayList<>();

        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                NotNull annotation = field.getAnnotation(NotNull.class);
                field.setAccessible(true);
                Object value = field.get(obj);
                if (value == null && annotation != null) {
                    int index = String.valueOf(field).lastIndexOf(".");
                    String nameOfField = String.valueOf(field).substring(index + 1);
                    result.add(nameOfField);
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static Map<String, List<String>> advancedValidate(Address address) {
        Map<String, List<String>> result = new HashMap<>();
        Field[] fields = address.getClass().getDeclaredFields();

        for (Field field : fields) {
            List<String> errMsg = new ArrayList<>();
            field.setAccessible(true);

            if (field.getAnnotation(MinLength.class) != null) {
                try {
                    MinLength min = field.getAnnotation(MinLength.class);
                    String value = (String) field.get(address);
                    if (value.length() < min.minLength()) {
                        errMsg.add(LESS_THAN);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }

            if (field.getAnnotation(NotNull.class) != null) {
                try {
                    if (field.get(address) == null) {
                        errMsg.add(CANT_BE_NULL);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }

            if (errMsg.size() != 0) {
                result.put(field.getName(), errMsg);
            }
        }
        return result;
    }
}
