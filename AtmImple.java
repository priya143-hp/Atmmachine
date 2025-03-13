import java.util.HashMap;
import java.util.Map;
import atm.AtmOperator;
import java.util.Set;


public class AtmImple implements Atm{
    
     
     
    AtmOperator atm=new AtmOperator();
    Map<Double,String> map=new HashMap<>();

    @Override
    public void viewBalance() {
        // TODO Auto-generated method stub
        System.out.println("AvailableBalance:"+atm.getBalance());
    }

    @Override
    public void depositAmount(double depositAmount) {
        // TODO Auto-generated method stub
        System.out.println("depositAmount is:"+depositAmount);
       atm.setBalance(atm.getBalance()+depositAmount);
       map.put(depositAmount, "deposited sucessfully");
       viewBalance();
        
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        // TODO Auto-generated method stub
        if (withdrawAmount%500==0) {
            if(withdrawAmount<=atm.getBalance()){
                System.out.println("collect the cash "+withdrawAmount);
                atm.setBalance(atm.getBalance()-withdrawAmount);
                map.put(withdrawAmount,"amount withdrawn");
                viewBalance();
            }else{
                System.out.println("insufficient Balance");
            }
            
        }else{
            System.out.println("enter the amount in terms of 500");
        }
        
    
    }

    @Override
    public void viewStatement() {
        // TODO Auto-generated method stub
       Set<Double> set= map.keySet();
       for(double d:set){
        System.out.println(d+"="+map.get(d));
       }
    }
    
}
