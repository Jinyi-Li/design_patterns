public class DailyActivityFileMapper implements CsvFileMapper {
    @Override
    public List<ActivityBean> mapToBeans(File file){
        List<ActivityBean> res = new ArrayList<>();
        
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){            
            String line;
            while((line = reader.readLine()) != null){
                DailyBean bean = new DailyBean(line);
                res.add(bean);
            }
        }catch(IOException e){
            // handle exception
        }
        return res;
    }
}