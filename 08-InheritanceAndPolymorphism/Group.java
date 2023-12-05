public class Group {
    static Person[] people =new Person[2];

    public static void main(String[] args) {
        Person p = new Person();
        Student s = new Student();

        people[0] = p;
        people[1] = s;

        for(Person i: people){
            i.display();
        }
    }
}
