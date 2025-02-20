package com.mindsprint.project1.student;

public class Student {
    String name;
    int[] grades;
    public Student(String name,int[] grades){
        this.name=name;
        this.grades=grades;
    }
    public float average(){
        int i=0;
        float sum=0;
        int n=grades.length;
        for(i=0;i<n;i++) {
            sum += grades[i];
        }
        float average=0;
        average=sum/(n+1);
        return average;
    }
    public void display(){
        System.out.println("Name:"+name);

        System.out.println("Average:"+average());
    }

    public static void main(String[] args) {
        Student s1=new Student("Vinutha",new int[] {2,3,4,7});
        s1.display();
    }
}
