package ChainofReponsibilityPattern;

public abstract class Approver{
    //后继者对象
    protected Approver approver;
    //审批者姓名
    protected String name;

    public Approver(String name) {
        this.name = name;
    }
    //设置后继者
    public void setApprover(Approver approver){
        this.approver = approver;
    }
    //抽象请求处理方法
    public abstract void processRequest(PurchaseRequest request);
}
