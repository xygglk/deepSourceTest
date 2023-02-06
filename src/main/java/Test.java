/**
 * @author XYGG
 * @description TODO
 * @date 2023/1/6 13:28
 */
public class Test {
    public static void main(String[] args) {
        Pig pig1 = new Pig();//拿到一个没有属性的猪对象
        pig1.setName("猪一");//给这个猪设置名字为猪1
        String type = "小香猪";
        pig1.setType(type);

        String na = "猪二";
        Pig pig2 = new Pig(na, "white");//拿到一个名字为猪2的白色的猪对象
        pig2.setName("猪三");//给猪二 设置名字成猪三  对象.非static方法
        System.out.println("===================================================================================");

        Pig.printPigInfo();//类名.静态方法   输出猪类的百科信息
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Butcher butcher = new Butcher();//拿到一个屠夫对象
        butcher.killPig(pig2);//屠夫杀猪方法  public void killPig(Pig pig){}
        System.out.println("-------------------------------------------------------------------------------------");

        int money = butcher.sellPorkGetMoney(pig2);//屠夫销售猪肉卖钱方法  有返回值钱数
        System.out.println("屠夫卖掉" + pig2.getName() + "的肉,买了" + money + "块钱");//pig2没有设置重量所以卖了0块钱
        System.out.println("===================================================================================");

        pig1.setWight(200);//给pig1设置200斤
        int pig1Money = butcher.sellPorkGetMoney(pig1);
        System.out.println("屠夫卖掉" + pig1.getName() + "的肉,买了" + pig1Money + "块钱");//卖pig1
    }
}
