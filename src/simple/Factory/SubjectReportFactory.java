package simple.Factory;

public class SubjectReportFactory implements IReportFactory {


    @Override
    public IReport create() {
        return new SubjectReport();
    }
}
