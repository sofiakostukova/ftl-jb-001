package animals;

public class Duck extends Bird{
    public Duck(){

    }

    @Override
    public void voice(){
        System.out.println("qiack");
    }

    public void showSpeed(){
        if(this.flyModeActive == true){
            System.out.println("40");
        }else{
            System.out.println("4");
        }
    }
}
