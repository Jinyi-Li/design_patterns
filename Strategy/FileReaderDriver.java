/*
	The driver demonstrates the use case and context of Strategy Pattern. 

	The pattern provides a great decoupling between business logic and strategies.
	The strategies may be specified in initiation and may be changed later.

	When you want to update the implementation details of any strategy, it won't
	require you to maintain the business logic - good separate of concerns!
*/
public class FileReaderDriver {
    public static void main(String[] args){
    	
    	// You may initiate the reader with a specific strategy "DailyActivityFileMapper".
    	FileReader reader = new FileReader(new DailyActivityFileMapper());
    	List<ActivityBean> dailyBeans = reader.read(new File("daily_activity_data_2019_04_04_01"));

    	// You may change the strategy to "MonthlyActivityFileMapper" later.
    	reader.setMapper(new MonthlyActivityFileMapper());
    	List<ActivityBean> monthlyBeans = reader.read(new File("monthly_activity_data_2018_12_31_02"));

    	// do something else
    }

    
}