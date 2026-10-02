import java.util.ArrayList;
import java.util.Scanner;

public class ScoreManager {
    public static void main(String[] args) {
        // 1. 创建“学生名单”列表
        ArrayList<Student> students = new ArrayList<>();

        // 2. 创建扫描器，用来接收键盘输入
        Scanner scanner = new Scanner(System.in);

        // 3. 用 while 循环，让程序一直运行，直到用户选择退出
        while (true) {
            // 4. 打印菜单
            System.out.println("\n===== 学生成绩管理系统 =====");
            System.out.println("1. 录入学生成绩");
            System.out.println("2. 显示全部学生");
            System.out.println("3. 按分数从高到低排序");
            System.out.println("4. 退出系统");
            System.out.print("请输入你的选择（1-4）：");

            // 5. 读取用户输入的数字
            int choice = scanner.nextInt();

            // 6. 根据用户的选择，执行不同的操作（if-else 判断）
            if (choice == 1) {
                // 录入成绩
                System.out.print("请输入学生姓名：");
                String name = scanner.next();
                System.out.print("请输入学生分数：");
                double score = scanner.nextDouble();

                // 创建一个新学生，并放进列表
                students.add(new Student(name, score));
                System.out.println("录入成功！");

            } else if (choice == 2) {
                // 显示全部学生
                if (students.isEmpty()) {
                    System.out.println("目前还没有学生记录。");
                } else {
                    System.out.println("--- 学生名单 ---");
                    for (Student s : students) {
                        s.introduce(); // 让每个学生自我介绍
                    }
                }

            } else if (choice == 3) {
                // 按分数排序
                if (students.isEmpty()) {
                    System.out.println("没有数据可以排序。");
                } else {
                    // 使用 Lambda 表达式进行排序（抄下来，以后会细讲）
                    students.sort((s1, s2) -> Double.compare(s2.getScore(), s1.getScore()));
                    System.out.println("排序完成！请选择 2 查看。");
                }

            } else if (choice == 4) {
                // 退出程序
                System.out.println("感谢使用，再见！");
                break; // break 的作用就是“跳出循环”，结束程序

            } else {
                System.out.println("输入有误，请重新输入 1-4 之间的数字。");
            }
        }

        // 关闭扫描器
        scanner.close();
    }
}