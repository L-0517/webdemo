public class Student {
    private String name;
    private double score;
    public Student(String name,double score){
        this.name=name;
        this.score=score;
    }
    // 获取名字和分数的方法（供后面排序和打印使用）
    public String getName(){
        return name;
    }
    public double getScore(){
        return score;
    }
    public void introduce(){
        System.out.println("我叫"+name+"成绩是"+score);
    }

}
