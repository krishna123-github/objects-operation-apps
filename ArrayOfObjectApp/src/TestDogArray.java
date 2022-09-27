 
/**
 *
 * @author krishna pal
 */
class Dog{
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void eat(){
        System.out.println("..Dog eating-------->"+name+" "+age);
    }
 }

public class TestDogArray {
 
    public static void main(String[] args) {
        Dog[] dogs = new Dog[] { new Dog("tommy",11), new Dog("sizu",22)};  //we can direct initilised  the Objects in the Array Object..
        
        for(Dog d : dogs){
            System.out.println(d.hashCode());
            d.eat();
        }
    }
    
}
