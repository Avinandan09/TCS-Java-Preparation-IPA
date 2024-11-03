
import java.util.*;
public class IPA49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Bill[] bill = new Bill[n];
        for (int i=0;i<bill.length;i++){
            int billNo = sc.nextInt();sc.nextLine();
            String  name = sc.nextLine();
            String typeOfConnection = sc.nextLine();
            double amount = sc.nextDouble();sc.nextLine();
            boolean status = sc.nextBoolean();sc.nextLine();
            bill[i] = new Bill(billNo, name, typeOfConnection, amount, status);
        }
        boolean param = sc.nextBoolean();sc.nextLine();
        String param2 = sc.nextLine();
        Bill[] ansBill = findBillWithMaxBillAmountBasecOnStatus(bill,param);
        if(ansBill!=null){
            for (int i=0;i<ansBill.length;i++){
                System.out.println(ansBill[i].getBillNo()+"#"+ansBill[i].getName());
            }
        }
        int ans2 = getCountWithTypeOfConnection(bill,param2);
        if(ans2!=0)
        {
            System.out.println(ans2);
        }
        else{
            System.out.println("There asre no bills with given type of Connection");
        }
    }
    public static Bill[] findBillWithMaxBillAmountBasecOnStatus(Bill[] bill,boolean param)
    {
        Bill[] bills = new Bill[0];
        double max = bill[0].getBillAmount();
        for(int i=0;i<bill.length;i++){
            if(bill[i].getBillAmount()>max){
                max = bill[i].getBillAmount();
            }
        }
        for(int j=0;j<bill.length;j++){
            if(bill[j].getStatus()==param && bill[j].getBillAmount()==max){
                bills = Arrays.copyOf(bills,bills.length+1);
                bills[bills.length-1] = bill[j];
            }
        }
        if(bills.length>0){
            for(int k=0;k<bills.length-1;k++){
                for(int l=k;l<bills.length;l++){
                    if(bills[k].getBillNo()>bills[l].getBillNo()){
                        Bill temp = bills[k];
                        bills[k] = bills[l];
                        bills[l] = temp;
                    }
                }
            }
            return bills;
        }
        return null;
    }
    public static int getCountWithTypeOfConnection(Bill[] b, String t){
        int c  = 0;
        for(int i=0;i<b.length;i++){
            if(b[i].getTypeOfConnection().equalsIgnoreCase(t)){
                c++;
            }
        }
        return c;
    }
}

class Bill 
{
    private int billNo;
    private String name,typeOfConnection;
    private double billAmount;
    private boolean status;
    public Bill(int billNo, String name, String typeOfConnection, double billAmount,boolean status)
    {
        this.billNo = billNo;
        this.name = name;
        this.typeOfConnection = typeOfConnection;
        this.billAmount = billAmount;
        this.status = status;
    }
    public int getBillNo(){
        return billNo;
    }
    public String getName(){
        return name;
    }
    public String getTypeOfConnection(){
        return typeOfConnection;
    }
    public double getBillAmount(){
        return  billAmount;
    }
    public boolean getStatus(){
        return  status;
    }
    public void setBillNo(int billNo){
        this.billNo = billNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setTypeOfConnection(String typeOfConnection){
        this.typeOfConnection = typeOfConnection;
    }
    public void setBillAmount(double billAmount){
        this.billAmount = billAmount;
    }
    public void setStatus(boolean  status){
        this.status = status;
    }
}