public class Navi implements INavi{
    private String name ;
    public Navi(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void communicate(INavi navi){
        System.out.println(this.getName() + " communicates with " + navi.getName() +".");
    }
}
