package AKGB;

import java.util.Arrays;

class Lsn5 {
    public static void main(String[] args) {

        Staff[] staffArray = new Staff[5];
        staffArray[0] = new Staff("Иванов", "Иван", "Иванович", "Директор", "ivanov@mail.ru",
                "8917123456", "40000", 40);
        staffArray[1] = new Staff("Петров", "Петр", "Петрович", "Зам.директора", "petrov@mail.ru",
                "8917123457", "35000", 44);
        staffArray[2] = new Staff("Сидоров", "Сидр", "Сидорович", "Гл.инженер", "sidorov@mail.ru",
                "8917123458", "35000", 37);
        staffArray[3] = new Staff("Иванова", "Наталья", "Юрьевна", "Гл.бухгалтер", "ivanova@mail.ru",
                "8917123459", "35000", 39);
        staffArray[4] = new Staff("Шариков", "Полиграф", "Полиграфович", "Ловец кошек", "sharikov@mail.ru",
                "8917123460", "15000", 7);

        for (Staff staff : staffArray)
            if (staff.getAge() > 40)
                staff.displayInfo();

    }
}



 class Staff {

    private String surname;
    private String name;
    private String patronymic;
    private String post;
    private String email;
    private String tel;
    private String salary;
    private int age;
    private int id;
    private static int counter;


    void setAge(int age){

        if (age < 18){
            this.age = 18;
        }
        else {
            this.age = age;
        }
    }

    int getAge(){ return age;}

    {
        id = ++counter;

    }

      public Staff(String surname, String name, String patronymic, String post, String email, String tel, String salary, int age) {
        //this(surname, name, patronymic);
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        //this.age = age;
          if (age < 18){
              this.age = 18;
          }
          else
              this.age = age;



    }


    void displayInfo(){
        System.out.printf("Фамилия: " + surname + "   Имя: " + name + "         Отчество: " + patronymic);
        System.out.println();
        System.out.printf("Должность: " + post + "    email: " + email + "      Номер тел.: " + tel);
        System.out.println();
        System.out.printf("Зарплата: " + salary + "     Возрост: " + age + "        Номер в журнале: " + id);
        System.out.println();
        System.out.println();
    }


}
