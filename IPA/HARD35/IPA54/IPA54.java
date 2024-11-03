import java.util.*;
public class IPA54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] course = new Course[4];
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble();sc.nextLine();
            String d = sc.nextLine();
            boolean e = sc.nextBoolean();sc.nextLine();
            course[i] = new Course(a,b,c,d,e);
        }
        double g = sc.nextDouble();sc.nextLine();
        String f = sc.nextLine();
        int ans = CountCourse(course,f,g);
        if(ans>0){
            System.out.println("Output: "+ans);
        }
        else{
            System.out.println("No course found: ");
        }
    }
    public static int CountCourse(Course[] c,String f,double g){
        int count = 0;
        for (int i=0;i<c.length;i++){
            if(c[i].getCertificate()==true && c[i].getRating()>=g && c[i].getMode().equalsIgnoreCase(f)){
                count++;
            }
        }
        return count;
    }
}

class Course{
    private int CourseId;
    private String CourseName;
    private double Courserating;
    private String Mode;
    private boolean HaveCertificate;
    public Course(int CourseId,  String CourseName, double Courserating, String Mode, boolean HaveCertificate) {
        this.CourseId=CourseId;
        this.CourseName=CourseName;
        this.Courserating=Courserating;
        this.Mode=Mode;
        this.HaveCertificate=HaveCertificate;
    }
    public int getId(){
        return  CourseId;
    }
    public String getName(){
        return  CourseName;
    }
    public double  getRating(){
        return Courserating;
    }
    public String getMode(){
        return  Mode;
    }
    public boolean getCertificate(){
        return   HaveCertificate;
    }

    public void setId(int CourseId){
        this.CourseId = CourseId;
    }
    public void setName(String CourseName){
        this.CourseName = CourseName;
    }
    public void setRating(double Courserating){

        this.Courserating=Courserating;
    }
    public void setMode(String Mode){
        this.Mode=Mode;
    }
    public void setCertificate(boolean certificate){
        this.HaveCertificate = certificate;
    }
}
