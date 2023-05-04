package idea.scr.familyTree;

import java.util.Objects;

public class Human {
    // используем инкапсуляцию (private) для скрытия от вмешательств извне
    private String signsOfgender;   // признаки пола
    //private SignsOfgender signsOfgender;
    private String surname;         // фамилия
    private String name;            // имя
    private String patronymic;      // отчество
    private String ateOfBirth;      // дата рождения
    private int age;                // возраст
    private String note;            // примечание
    private String maritalStatus;   // семейное положение
    private int numberOfChildren;   // количество детей
    private String dateOfDeath;     // дата смерти

    // todo:    2 конструктора
    /** 1. Конструктор
     * @param signsOfgender признаки пола
     * @param surname фамилия
     * @param name имя
     * @param patronymic отчество
     * @param ateOfBirth дата рождения
     * @param age возраст
     * @param note примечание
     */
    public Human(String signsOfgender, String surname,
                 String name, String patronymic,
                 String ateOfBirth, int age, String note) {
        this.signsOfgender = signsOfgender;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.ateOfBirth = ateOfBirth;
        this.age = age;
        this.note = note;
    }

    /** 2 Конструктор (полный конструктор)
     * @param signsOfgender признаки пола
     * @param surname фамилия
     * @param name имя
     * @param patronymic отчество
     * @param ateOfBirth дата рождения
     * @param age возраст
     * @param note примечание
     * @param maritalStatus семейное положение
     * @param numberOfChildren количество детей
     * @param dateOfDeath дата смерти
     */
    public Human(String signsOfgender, String surname, String name, String patronymic, String ateOfBirth, int age, String note, String maritalStatus, int numberOfChildren, String dateOfDeath) {
        this.signsOfgender = signsOfgender;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.ateOfBirth = ateOfBirth;
        this.age = age;
        this.note = note;
        this.maritalStatus = maritalStatus;
        this.numberOfChildren = numberOfChildren;
        this.dateOfDeath = dateOfDeath;
    }

    // Для получения значения полей используем геттеры (“get” — “получать”)
    // Для установки значения полей используются сеттеры (set — “устанавливать”)

    /**
     * @return признаки пола (Getter)
     */
    public String getSignsOfgender() {
        return signsOfgender;
    }
    /**
     * @param signsOfgender признаки пола (Setter)
     */
    public void setSignsOfgender(String signsOfgender) {
        this.signsOfgender = signsOfgender;
    }
    /**
     * @return фамилия (Getter)
     */
    public String getSurname() {
        return surname;
    }
    /**
     * @param surname фамилия (Setter)
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    /**
     * @return имя (Getter)
     */
    public String getName() {
        return name;
    }
    /**
     * @param name имя (Setter)
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return отчество (Getter)
     */
    public String getPatronymic() {
        return patronymic;
    }
    /**
     * @param patronymic отчество (Setter)
     */
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    /**
     * @return дата рождения (Getter)
     */
    public String getAteOfBirth() {
        return ateOfBirth;
    }
    /**
     * @param ateOfBirth дата рождения (Setter)
     */
    public void setAteOfBirth(String ateOfBirth) {
        this.ateOfBirth = ateOfBirth;
    }
    /**
     * @return возраст (Getter)
     */
    public int getAge() {
        return age;
    }
    /**
     * @param age возраст (Setter)
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * @return примечание (Getter)
     */
    public String getNote() {
        return note;
    }
    /**
     * @param note примечание (Setter)
     */
    public void setNote(String note) {
        this.note = note;
    }
    /**
     * @return семейное положение (Getter)
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }
    /**
     * @param maritalStatus семейное положение (Setter)
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    /**
     * @return количество детей (Getter)
     */
    public int getNumberOfChildren() {
        return numberOfChildren;
    }
    /**
     * @param numberOfChildren количество детей (Setter)
     */
    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }
    /**
     * @return дата смерти (Getter)
     */
    public String getDateOfDeath() {
        return dateOfDeath;
    }
    /**
     * @param dateOfDeath дата смерти (Setter)
     */
    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    // Переопределили:
    // Методы equals и hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && signsOfgender.equals(human.signsOfgender) &&
                surname.equals(human.surname) && name.equals(human.name) &&
                patronymic.equals(human.patronymic) &&
                ateOfBirth.equals(human.ateOfBirth) && note.equals(human.note);
    }
    @Override
    public int hashCode() {
        return Objects.hash(signsOfgender, surname, name, patronymic, ateOfBirth, age, note);
    }

    @Override
    public String toString() {
        return "Human{" +
                "signsOfgender='" + signsOfgender + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", ateOfBirth='" + ateOfBirth + '\'' +
                ", age=" + age +
                ", note='" + note + '\'' +
                '}';
    }


}
