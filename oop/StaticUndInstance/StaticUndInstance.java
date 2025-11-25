package oop.StaticUndInstance;

public class StaticUndInstance {

	public static void main(String[] args) {
		System.out.println(A.num); // 
		A.num++; // static-way
		A a = new A();
		a.num++; // Veränderung über ein Objekt: Instanzen können auf Klassen-Members zugreifen.
		System.out.println(A.num); // 
		
	}

}
class A{
	static int num;
}
	{

    public static void main(String[] args) {
        // создай трёх студентов
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Clara");

        // вызови printInfo() для каждого
        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
    }


class Student {
    String name;
    static int count = 0;

    // конструктор
    public Student(String name) {
        this.name = name;
        count++;
    }

    public void printInfo() {
        System.out.println("Меня зовут " + name + ", всего студентов: " + count);
    }
}
	}
	}




