public class Student {
    String name;
    int age;
    String cardId;
    boolean validId;
    int semester;
    double avgGrade;


    void sayHello() {
        System.out.println("Hello from "+name);
    }
    void displayName() {
        System.out.println("Name "+name);
    }
    void displayAge() {
        System.out.println("Age: "+age);
    }

    void displayStudentInfo(){
        System.out.println(name+" "+semester+" "+avgGrade);
    }

    void cardValid() {
        validId=true;
        System.out.println("Is id valid: "+validId);
    }
    void cardInvalid() {
        validId=false;
        System.out.println("Is id valid: "+validId);
    }
    void changeValid() {
        validId = !validId;
    }
    void displayIdInfo() {
        System.out.println(name+" "+cardId+" "+((validId)? "Valid":"Invalid"));
    }
}