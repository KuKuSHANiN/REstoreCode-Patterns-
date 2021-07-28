import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public final class Person {


    private static String name;
    private static LocalDate birthDay;
    private static String sex;
    private static List<String> phoneList;

    private Person() {
    }

    public static String getName() {
        return name;
    }

    public static LocalDate getBirthDay() {
        return birthDay;
    }

    public static String getSex() {
        return sex;
    }

    public static List<String> getPhoneList() {
        return phoneList;
    }

    public static Builder builder() {
        return new Person().new Builder();
    }

    public class Builder {


        private Builder() {
        }

        ;

        public Builder setName(String name) {
            Person.name = name;
            return this;
        }

        public Builder setBirthDay(LocalDate birthDay) {
            Person.birthDay = birthDay;
            return this;
        }

        public Builder setSex(String sex) {
            Person.sex = sex;
            return this;
        }

        public Builder setPhoneList(List<String> phoneList) {
            Person.phoneList = phoneList;
            return this;
        }

        public Person build() {
            return Person.this;
        }
    }

    Person person = Person.builder()
            .setName("Ivan")
            .setBirthDay(LocalDate.of(1993,Month.JULY,14))
            .setSex("m")
            .setPhoneList(Arrays.asList("123", "12344"))
            .build();
}
