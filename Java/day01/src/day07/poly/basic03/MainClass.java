package day07.poly.basic03;

public class MainClass {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("선생님1", 45, "수학");
        Teacher t2 = new Teacher("선생님2", 45, "영어");
        Teacher t3 = new Teacher("선생님3", 45, "과학");
        Teacher t4 = new Teacher("선생님4", 45, "국어");

        Student s1 = new Student("학생1", 13, "학생A");
        Student s2 = new Student("학생2", 11, "학생B");
        Student s3 = new Student("학생3", 17, "학생C");

        Employee e1 = new Employee("근로자1", 38, "근로자A");
        Employee e2 = new Employee("근로자2", 40, "근로자B");
        Employee e3 = new Employee("근로자3", 52, "근로자C");
        Employee e4 = new Employee("근로자4", 23, "근로자D");
        Employee e5 = new Employee("근로자5", 43, "근로자E");

        printPerson(s2);
        printPerson(s3);
        printPerson(t4);
        printPerson(e2);

    }

    public static void printPerson(Person p){
        if(p instanceof Employee){
            Employee e = (Employee)p;
            System.out.println(e.info());
        }else if(p instanceof Student){
            Student s = (Student)p;
            System.out.println(s.info());
        }else if(p instanceof Teacher){
            Teacher t = (Teacher)p;
            System.out.println(t.info());
        }
        p.info();
    }
}
