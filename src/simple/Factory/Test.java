package simple.Factory;

public class Test {

    public static void main(String[] args)

{
        IReportFactory iReportFactory = new SettlementReportFactory();
        IReport settlementReport = (IReport) iReportFactory.create();
        settlementReport.query();

        IReportFactory subjectReportFactory = new SubjectReportFactory();
        IReport subjectReport = (IReport) subjectReportFactory.create();
        subjectReport.query();


//        这个是一个比较有意思的想法
//        thinkpad的键盘的确是比较好用，有手感，所以工作用的手提电脑还是要首先苹果和thinkpad


        }}