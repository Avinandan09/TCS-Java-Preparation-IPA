
import java.util.*;
public class IPA55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many resort you want: ");
        int n = sc.nextInt();
        Resort[] rs = new Resort[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter resort id: ");
            int a = sc.nextInt();
            System.out.println("Enter resort name: ");
            String b = sc.next();
            System.out.println("Enter resort category: ");
            String c = sc.next();
            System.out.println("Enter price: ");
            double d = sc.nextDouble();
            System.out.println("Enter rate: ");
            double e = sc.nextDouble();
            rs[i] = new Resort(a,b,c,d,e);
        }
        System.out.println("Enter resort Category: ");
        String cat = sc.next();
        double ans = findAvgPrice(rs,cat);
        if(ans!=0){
            System.out.println("The avg price "+ans);
        }
        else{
            System.out.println("No resort found");
        }
    }
    public static double  findAvgPrice(Resort[] rs, String cat){
        double sum = 0;
        int count = 0;
        for (int i=0;i<rs.length;i++){
            String check = rs[i].getCat();
            if(check==cat && rs[i].getRate()>4){
                count++;
                sum = sum + rs[i].getPrice();
            }
        }
        if(count>0){
            double avg = sum/count;
            return  avg;
        }
        else{
            return 0;
        }
        
    }

}

class Resort
{
    private int id;
    private String name;
    private String cat;
    private double price;
    private double rate;
    public Resort (int id, String name,String cat,double price,double rate){
        this.id=id;
        this.name=name;
        this.cat=cat;
        this.price=price;
        this.rate=rate;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCat(){
        return cat;
    }
    public double getPrice(){
        return price;
    }
    public double getRate(){
        return rate;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCat(String cat){
        this.cat=cat;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setRate(double rate){
        this.rate=rate;
    }
}