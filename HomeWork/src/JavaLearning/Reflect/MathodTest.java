package JavaLearning.Reflect;

public class MathodTest {
    public boolean login(String name,String password){
        if (name.equals("nyf") || password.equals("nyf622424")){
            System.out.println("登陆成功");
        }
        return true;
    }

    public void Exit(){
        System.out.println("退出系统");
    }

}