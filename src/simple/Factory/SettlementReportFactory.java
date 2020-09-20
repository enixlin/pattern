package simple.Factory;

public class SettlementReportFactory implements IReportFactory {


    @Override
    public SettlementReport create() {
        return (SettlementReport) new SettlementReport();
    }




}
