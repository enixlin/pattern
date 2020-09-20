package simple.Factory;

public class SubjectReportFactory implements IReportFactory {


    @Override
    public SubjectReport create() {
        return new SubjectReport();
    }
}
