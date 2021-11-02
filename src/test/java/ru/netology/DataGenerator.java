package ru.netology;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGenerator {
    private DataGenerator() {
    }

    public static class Registration {
        private Registration() {
        }

        public static RegistrationCardInfo generateCard(String locale) {
            Faker faker = new Faker(new Locale("ru"));
            return new RegistrationCardInfo(
                    faker.address().cityName(),
                    faker.name().name(),
                    faker.phoneNumber()
            );
        }

        public static String generateDate(int day) {
            String date = LocalDate.now().plusDays(day).format(DateTimeFormatter.ofPattern("dd.MM.uuuu"));
            return date;
        }
    }
}