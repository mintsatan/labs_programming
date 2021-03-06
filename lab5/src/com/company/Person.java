package com.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Объекты класса Person являются владельцами продуктов
 */
@XmlRootElement(name = "Person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private int weight; //Значение поля должно быть больше 0
    private Color eyeColor; //Поле может быть null
    private Color0 hairColor; //Поле не может быть null
    private Country nationality; //Поле не может быть null

    Person() {}

    Person (String name, int weight, Color eyeColor, Color0 hairColor, Country nationality) {
        this.name = name;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public Color getEyeColor() {
        return eyeColor;
    }

    public Color0 getHairColor() {
        return hairColor;
    }

    public Country getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "владелец: " + getName() + " вес: " + getWeight() + " цвет глаз: " + getEyeColor() + " цвет волос: " + getHairColor() + " национальность: " + getNationality();
    }
}
