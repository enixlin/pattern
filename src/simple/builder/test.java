package simple.builder;

public class test {
    public static void main(String[] args) {
        Builder builder = new Builder();
        SettlementReport settlementReport1 = builder
                .setTitle("title1")
                .setStart("20101231")
                .setEnd("20211231")
                .setUnit("donghuan")
                
                .build();
        SettlementReport settlementReport2 = builder.setTitle("title1").setStart("20101231").setEnd("20211231").setUnit("donghuan").build();



        String s1 = settlementReport1.toString();
        System.out.println(s1);

        String s2 = settlementReport2.toString();
        System.out.println(s2);
    }
}
