package simple.builder;

public class SettlementReport implements IReport {

    private String title;
    private String  start;
    private String end;
    private String unit;

    public SettlementReport() {
    }


    public  String toString(){
        return "title:"+title +
                ",start:"+start +
                ",end:"+end +
                ",unit:"+unit ;
        }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public void query() {
        System.out.println("settlement query run...");
    }

    @Override
    public void export() {

    }

    @Override
    public void showChart() {
        this.export();
        System.out.println("");
        /**
         #控制台日志彩色
         spring.output.ansi.enabled=ALWAYS
         #热部署默认会重启
         spring.devtools.restart.enabled=true
         #添加那个目录的文件需要restart
         spring.devtools.restart.additional-paths=src/main/java
         #排除那个目录的文件不需要restart
         spring.devtools.restart.exclude=static/**,public/**
         */

    }
}
