
import java.util.*;
public class IPA53Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] crs = new Course[4];
        for (int i=0;i<crs.length;i++){
            String n = sc.nextLine();
            int num = sc.nextInt();sc.nextLine();
            String mode = sc.nextLine();
            boolean d = sc.nextBoolean();sc.nextLine();
            crs[i] = new Course(n,mode,num,d);
        }
        String name = sc.nextLine();
        String status = findCourseStatus(crs,name);
        if(status!=null){
            System.out.println("Output: "+status);
        } 
        else{
            System.out.println("Status not found");
        }
    }
    public static String findCourseStatus(Course[] crs, String name){
        for(int i=0;i<crs.length;i++){
            if(crs[i].getName().equalsIgnoreCase(name)){
                if(crs[i].getNum()>=1000){
                    return "High";
                }
                else if(crs[i].getNum()>=500 && crs[i].getNum()<1000){
                    return "Medium";
                }
                else{
                    return "Low";
                }
            }
        }
        return  null;

    }
}

class Course 
{
    private String name;
    private String mode;
    private int num;
    private boolean data;

    public Course(String name, String mode, int num, boolean data) 
    {
        this.name = name;
        this.mode = mode;
        this.num = num;
        this.data = data;
    }
    public String getName(){
        return name;
    }
    public String getMode(){
        return mode;
    }
    public int getNum(){
        return num;
    }
    public boolean getData(){
        return data;
    }
    public void setName(String name){
        this.name = name;
    }
    public void seMode(String mode){
        this.mode = mode;
    }
    public void setNum(int num){
        this.num =  num;
    }
    public void setData(boolean data){
        this.data = data;
    }

}