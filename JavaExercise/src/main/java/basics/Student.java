package basics;

class Student1 {
    private String name;
    private int age;
    public Student1(String name, int age){
        this.name = name;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void study(){
        System.out.println(name + "is studying");
    }
}
 class Student{
    public static void main(String[] args) {
        Student1 student1 = new Student1("Alice",18);
        System.out.println(student1.getName());
        student1.setAge(19);
        student1.study();
    }
}
