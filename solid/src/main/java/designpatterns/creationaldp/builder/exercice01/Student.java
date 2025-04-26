package designpatterns.creationaldp.builder.exercice01;

public class Student {
    private String name;
    private String  university;
    private int age;

    public Student(Builder builder) {
        this.name = builder.name;
        this.university = builder.university;
    }

    public static class Builder {
        private String name;
        private String university;
        private int age;

        public Builder() {

        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder university(String university) {
            this.university = university;
            return this;
        }

        public Builder getAge(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public String getName() {
        return this.name;
    }
}
