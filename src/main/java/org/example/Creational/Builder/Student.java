package org.example.Creational.Builder;

public class Student {
    private String name;
    private long id;
    private double percentage;
    private String batch;

    public Student(Builder b) {
        if(b.name.contains("r")){
            throw new RuntimeException("can't contain r");
        }
        if(b.id==0){
            throw new RuntimeException("0 is invalid");
        }
        if(b.percentage==0){
            throw new RuntimeException("0 is invalid perc");
        }
        if (b.batch.contains("r")){
            throw new RuntimeException("can't contain r in batch");
        }
        this.name=b.name;
        this.id=b.id;
        this.percentage=b.percentage;
        this.batch=b.batch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", percentage=" + percentage +
                ", batch='" + batch + '\'' +
                '}';
    }

    public static class Builder{
        private String name;
        private long id;
        private double percentage;
        private String batch;
        public Builder(){
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setPercentage(double percentage) {
            this.percentage = percentage;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }

}
