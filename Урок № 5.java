public class Main
{
	public static void main(String[] args) {
		Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Иванов Иван", "инженер", "ivivan@mailbox.com", 892312312, 30000, 30); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person("Пахомчик Виталий", "программист", "vitaliy@mail.com", 877777777, 50000, 19);
        persArray[2] = new Person("Петров Петр", "заместитель директора", "petrov@yande.com", 879767472, 100000, 45);
        persArray[3] = new Person("Базаров Евгений", "системный аналитик", "jenia@google.ru", 839745632, 80000, 41);
        persArray[4] = new Person("Гринев Петр", "директор", "grinev1967@bing.ru", 880053475, 200000, 55);
        for (int i = 0; i < persArray.length; i++){
            persArray[i].age();
	}
}
}
class Person
{   String FIO;
    String position;
    String email;
    int phone;
    int salary;
    int age;
    public Person(String FIO, String position, String email, int phone, int salary, int age){
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary =  salary;
        this.age = age;
    }
    
    public void print(){
        System.out.println (FIO + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age);
    }
    public void age(){
        if (age > 40){
            System.out.println (FIO + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age);
        }
    }
    }

