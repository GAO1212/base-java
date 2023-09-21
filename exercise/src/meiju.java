class meijutest{
    public static void main(String[] args) {
        System.out.println(meiju.summer.getSeasondesc());
//        System.out.println(meiju.autumn.getClass().getSuperclass());
//        System.out.println(meiju.autumn.getClass());
meiju[] values=meiju.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        meiju valueof=meiju.valueOf("spring");
        System.out.println(valueof);
    }
}
public enum meiju {spring("春天","春暖花开"),
    summer("夏天","夏日炎炎"),
    autumn("秋天","秋高气爽"),
    winter("冬天","白雪皑皑");
    private final String seasonname;
    private final String seasondesc;

    meiju(String seasonname, String seasondesc) {
        this.seasonname = seasonname;
        this.seasondesc = seasondesc;
    }

    public String getSeasonname() {
        return seasonname;
    }

    public String getSeasondesc() {
        return seasondesc;
    }

    @Override
    public String toString() {
        return "meiju{" +
                "seasonname='" + seasonname + '\'' +
                ", seasondesc='" + seasondesc + '\'' +
                '}';
    }



}
