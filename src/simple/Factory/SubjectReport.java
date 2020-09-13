package simple.Factory;

public class SubjectReport implements  IReport {
    @Override
    public void query() {
        System.out.println("subejct query run...");
    }

    @Override
    public void export() {

    }

    @Override
    public void showChart() {

    }
}
