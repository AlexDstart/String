public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //task1
        String firstName=" Иван";
        String middleName=" Иванович";
        String lastName=" Иванов";
        String fullName="Иванов Иван Иванович";
        System.out.println(" Фио Сотрудника "+lastName+firstName+middleName);
        //task2
        System.out.println(fullName.toUpperCase());

        //task3
        String fullname1="Иванов Семён Семёнович";
        System.out.println(fullname1.replace("ё","е"));
    }
}