/**
 * Butcher 屠夫类
 */
public class Butcher {
    String name;//名字
    String description;//描述
    String age;//年龄
    String address;//地址

    /**
     * 屠夫的无参构造方法      在别的地方可以用new Butcher() 拿到一个屠夫对象
     */
    public Butcher() {
        System.out.println("调用屠夫类无参构造");
    }

    public Butcher(String name, String description, String age, String address) {
        this.name = name;
        this.description = description;
        this.age = age;
        this.address = address;
        System.out.println("调用屠夫类有参构造：Butcher(String, String, String, String)");
    }

    public Butcher(String name) {
        this.name = name;
        System.out.println("调用屠夫类有参构造：Butcher(String) ");
    }

    /**
     * 屠夫自我介绍方法
     */
    public void selfIntroduction(String name, String description, String age, String address) {
        System.out.println("我是一个屠夫，我叫" + name + "。");
    }

    /**
     * 杀猪方法
     *
     * @param pig
     */
    public void killPig(Pig pig) {
        System.out.println("杀掉这头名字为" + pig.getName() + "的猪");
    }

    /**
     * 销售猪肉方法 一斤猪肉卖10块
     *
     * @return
     */
    public int sellPorkGetMoney(Pig pig) {
        int wight = pig.getWight();//拿到猪被设置的重量
        if (wight != 0) {//猪重量不为0 才乘以单价
            return wight * 10;
        }
        return 0;//猪重量为0 卖出0块钱
    }
}
