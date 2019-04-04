/*
	FileReader contains a mapper that maps a CSV file to a list of ActivityBean's.

	You may specify the mapper (the "Strategy") in initialization and may change it later.
*/
public class FileReader {
    
    private CsvFileMapper mapper;

    public FileReader(CsvFileMapper mapper){
        this.mapper = mapper;
    }

    public void setMapper(CsvFileMapper newMapper){
    	this.mapper = newMapper;
    }

    public List<ActivityBean> read(File file){
        return mapper.mapToBeans(file);
    }
}