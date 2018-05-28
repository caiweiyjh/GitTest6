package com;

public class Person {
    private  int id;
    private  int age;
    private  String name;
    private  String job;

    public Person() {
    }

    public Person(int id, int age, String name, String job) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        System.out.println("jackLove");
        System.out.println("jackLove1");
        System.out.println("hehe");
        System.out.println("");
        for(int i=1;i<10;i++){
            System.out.println(i);
        }
    }
}
