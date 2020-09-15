package simple.Factory;

public class SubjectReportFactory implements IReportFactory {


    @Override
    public SettlementReport create() {
        return new SubjectReport();
    }
}
