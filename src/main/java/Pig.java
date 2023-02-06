/**
 * Pig   class类
 */
public class Pig {

    String name = "小花";//猪名
    int wight;//猪重量
    String color;//猪颜色
    String type;//猪品种

//-------------------------------------------------------------------------------------------------   下面是构造函数（构造方法） ，构造方法用于拿到特定的对象

    /**
     * 猪的无参构造方法     构造方法没有返回值   在别的地方可以用new Pig() 拿到一头猪（一个猪类对象）
     * 无参构造默认会有 ，但是写了有参构造无参构造就会被覆盖
     */
    public Pig() {
    }

    /**
     * 猪的有参构造      构造方法没有返回值  在别的地方可以用 new Pig("小花") 拿到一头叫小花的猪
     *
     * @param name 猪名
     */
    public Pig(String name) {
        this.name = name;
    }

    public Pig(String name, String color) {
        this.name = name;
        this.color = color;
    }
    //---------------------------------------------------------------------------------------------------

    ///////////////////////////////////////////////// 中间是get set方法
    public int getWight() {
        return wight;
    }


    public void setWight(int wight) {
        this.wight = wight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    ///////////////////////////////////////////////

    /**
     * 自我介绍方法 返回值是String 字符串
     *
     * @return
     */
    public String selfIntroduction() {
        return getName();
    }


    public static void run(String speed) {
        System.out.println("猪在跑速度是：" + speed);
    }

    public static void main(String[] args) {

    }

    public void run1(String name) {
        System.out.println(name + "猪在跑：");
    }


    public static boolean die(String time) {//"24"
        System.out.println("人死了多久:" + time);
        if (Integer.getInteger(time) > 24) {
            return true;
        } else if (Integer.getInteger(time) <= 24) {
            return false;
        }
        return false;
    }

    /**
     * 吃  方法  返回值为空void
     */
    private void eat() {
        System.out.println("猪吃饭");
    }


    /**
     * 打印猪的百科
     */
    public static void printPigInfo() {
        System.out.println("猪（Pig、Swine）是一种脊椎动物、哺乳动物、家畜，也是古杂食类哺乳动物，主要分为家猪和野猪。当前人们认为猪是猪科动物的简称，猪依据品种的不同，体貌特征也各不相同；通常以耳大，头长，四肢短小，鼻直，身体肥壮，腰背窄为主要形体特征。毛发较粗硬，毛皮颜色通常为白色、粉色、黑色、棕色和花色。\n" +
                "家猪是野猪被人类驯化后所形成的亚种，獠牙较野猪短，是人类所驯养的家畜之一，一般来说，家猪是指人类蓄养多供食用的猪种类型。");
    }


}
