// 测试不必要导入
import com.jogamp.common.util.*;
import java.util.List;
import java.util.Map;

public class demo {
  int a = 0;
  String name; // 名字
  String description; // 描述
  String age; // 年龄
  String address; // 地址

  private String name(String name) {
    return name + a;
  }

  // 测试类型转换
  public void getName(List list) {
    Map map = (Map) list.get(0);
    String name1 = (String) map.get("name");
    return;
  }
  // 测试空方法
  public void getDescription() {}
}
