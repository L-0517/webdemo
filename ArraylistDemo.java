import java.util.ArrayList;
public class ArraylistDemo {
    public static void main(String[] args){
        // 1. 创建一个专门装字符串的列表（空箱子）
        ArrayList<String> rollCall=new ArrayList<>();
        // 2. 往里面加 3 个人（add）
        rollCall.add("张三");
        rollCall.add("李四");
        rollCall.add("王五");
        System.out.println("加了3个人"+rollCall);
        // 3. 查看现在有几个人（size）
        System.out.println(rollCall.size());
        // 4. 拿出第 0 号人来看看（get）
        System.out.println("第 0 号人是：" +rollCall.get(0));
        // 5. 把 0 号人换成 "新来的"（set）
        rollCall.set(0,"新来的");
        System.out.println("0号被替换后：" + rollCall);
        // 7. 判断名单里有没有 "王五"（contains）
        boolean re=rollCall.contains("王五");
        System.out.println(re);
    }
}
