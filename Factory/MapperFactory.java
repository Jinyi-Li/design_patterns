/*
    
*/
public class MapperFactory {
    public static Mapper getMapper(String name){
        switch(name){
            case "Daily_Activity": return new DailyMapper();
            case "Monthly_Activity": return new MonthlyMapper();
            default: throw new IllegalArgumentException("Illegal type of mapper");
        }
    }
}