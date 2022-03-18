public class Avatar implements IHuman, INavi{
    Human human;

    public Avatar(IHuman human){
        this.human = (Human) human;
    }

    public String getName(){
        return this.human.getName();
    }

    public void communicate(INavi navi) {
        System.out.println(this.getName() + " communicates with " + navi.getName());
    }


    public void communicate(IHuman human) {
        System.out.println(this.getName() + " communicates with " + human.getName());
    }
}
