public final class Student {
    //финальные переменные не могут быть изменены, как и финальный класс
    private final String Name;
    private final String School;
    private final int age;
    public static final String nationality = "Russian Federation"; 

    Student(){ //конструктор по умолчанию
        Name = "";
        School = "";
        age = 0;
    }
    //стандартный конструктор
    Student(String Name, String School, int age){
        this.Name = Name;
        this.School = School;
        this.age = age;
    }

    //создание внутреннего класса с выбором значений переменных
    public Interests setter(String Hobby, String Sports, 
        String VideoGames){
        Interests inter = new Interests(Hobby, Sports, VideoGames);
        return inter;
    }

    //Сам внутренний класс, который может быть изменен
    public class Interests{
        public String Hobby;
        public String Sports;
        public String VideoGames;
        //конструктор по умолчанию
        Interests(){}
        
        //конструктор с выбором значений переменных
        Interests(String Hobby, String Sports, String VideoGames){
            this.Hobby = Hobby;
            this.Sports = Sports;
            this.VideoGames = VideoGames;
        }
        //вывод значений внутреннего класса в консоль
        public void display(){
            System.out.println("Hobby: " + Hobby + ", Sports: " + 
                Sports + ", Video Games: " + VideoGames);
        }
    }

    //вывод значений внешнего класса в консоль
    public void display(){
        System.out.println("Name: " + Name + ", School: " + School + 
        ", age: " + age);
    }

    //основной метод класса
    public static void main(String[] args) {
        //создать 2 учеников
        Student s0 = new Student("Masha", "CATS", 17);
        s0.display();
        Student s1 = new Student();
        s1.display();
        //статичная переменная
        System.out.println(Student.nationality);

        //инициализировать внутренний класс и показать его содержимое
        Student.Interests SI = s0.setter("Books", "Football", "Starcraft");
        SI.display(); 

        //изменить переменные внутреннего класса и продемонстрировать это
        SI.Hobby = "Film";
        SI.Sports = "Soccer";
        SI.VideoGames = "Counter-Strike";
        SI.display();
    }
}
