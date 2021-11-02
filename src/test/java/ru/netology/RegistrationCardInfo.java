package ru.netology;

import com.github.javafaker.PhoneNumber;

import java.util.Objects;

public class RegistrationCardInfo {
    private String cityName;
    private String name;
    private PhoneNumber phone;

    public RegistrationCardInfo(String cityName, String name, PhoneNumber phone) {
        this.cityName = cityName;
        this.name = name;
        this.phone = phone;
    }

    public String getCityName() {
        return cityName;
    }

    public String getName() {
        return name;
    }

    public PhoneNumber getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistrationCardInfo that = (RegistrationCardInfo) o;
        return Objects.equals(cityName, that.cityName) && Objects.equals(name, that.name) && Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, name, phone);
    }

    @Override
    public String toString() {
        return "RegistrationCardInfo{" +
                "city='" + cityName + '\'' +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}