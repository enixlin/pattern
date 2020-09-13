package simple.Factory;

public class SettlementReportFactory implements  IReportFactory {


    @Override
    public IReport create() {
        return new SettlementReport();
    }
}
