package simple.Factory;

public class Test {

    public static void main(String[] args) {
        IReportFactory iReportFactory = new SettlementReportFactory();
        IReport settlementReport = iReportFactory.create();
        settlementReport.query();

        IReportFactory subjectReportFactory = new SubjectReportFactory();
        IReport subjectReport = subjectReportFactory.create();
        subjectReport.query();
    }
}
