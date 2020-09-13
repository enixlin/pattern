package simple.Factory;

public class SettlementReport  implements  IReport {
    @Override
    public void query() {
        System.out.println("settlement query run...");
    }

    @Override
    public void export() {

    }

    @Override
    public void showChart() {

    }
}
