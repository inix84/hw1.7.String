public class Main {
    public static void main(String[] args) {
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName+" "+firstName+" "+middleName;
        System.out.println("ФИО сотрудника — "+fullName);
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName1);
        boolean OutSymbol=fullName.contains("ё");
        if (OutSymbol=true) {
            System.out.print("Будет произведена замена буквы Ё на Е: ");
            String fullName2 = fullName.replace('ё','е');
            System.out.println("Данные ФИО сотрудника — "+fullName2);
        }


    }
}