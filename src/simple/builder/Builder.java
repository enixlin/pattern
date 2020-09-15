package simple.builder;

public class Builder {

    private SettlementReport settlementReport = new SettlementReport();

    public Builder() {
        this.settlementReport =new  SettlementReport();
    }

    public Builder setTitle(String title) {
        settlementReport.setTitle(title);
        return this;
    }

    public Builder setStart(String start) {
        settlementReport.setStart(start);
        return this;
    }

    public Builder setEnd(String end) {
        settlementReport.setEnd(end);
        return this;
    }

    public  Builder setUnit(String unit){
        settlementReport.setUnit(unit);
        return this;
    }
    public String toString(){
        return this.settlementReport.toString();
    }


    public SettlementReport build(){
        return this.settlementReport;
    }
}