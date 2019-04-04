public class MonthlyActivityFileMapper implements CsvFileMapper {
    @Override
    public List<ActivityBean> mapToBeans(File file){
        List<ActivityBean> res = new ArrayList<>();
        
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){            
            String line;
            while((line = reader.readLine()) != null){
                MonthlyBean bean = new MonthlyBean(line);
                res.add(bean);
            }
        }catch(IOException e){
            // handle exception
        }
        return res;
    }
}