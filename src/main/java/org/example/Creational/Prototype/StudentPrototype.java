package org.example.Creational.Prototype;

public class StudentPrototype implements Cloneable {
    private int id;
    private String name;
    private String batch;
    private String psp;

    @Override
    public StudentPrototype clone() throws CloneNotSupportedException {
        return new StudentPrototype(this.batch,this.psp);
    }

    public StudentPrototype(String batch, String psp) {
        this.batch = batch;
        this.psp = psp;
    }

    @Override
    public String toString() {
        return "StudentPrototype{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", batch='" + batch + '\'' +
                ", psp='" + psp + '\'' +
                '}';
    }

    public StudentPrototype() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getPsp() {
        return psp;
    }

    public void setPsp(String psp) {
        this.psp = psp;
    }
}
