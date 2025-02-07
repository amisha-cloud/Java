interface India{
    void indianState();
    void capital();
}
class World implements India{
    public void indianState(){
        System.out.println("Best economy:")
    }
    public void Capital(){
        System.out.println("Mumbai is best");
    }
}
public class Interface{
    public static void main(String args[]){
        India add=new World();
        add.indianState();
        add.capital();
    }
}