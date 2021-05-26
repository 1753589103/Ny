package ChainofReponsibilityPattern;

public class Director extends Approver{

    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000){
            System.out.println("主任"+this.name+"采购金额"+request.getAmount()+"订单编号"+
                    request.getNumber()+"目的"+request.getPurpose());
        }else{
            //转发请求
            this.approver.processRequest(request);
        }
    }
}
