public class FileReader {
    private CsvFileMapper mapper;

    public FileReader(CsvFileMapper mapper){
        this.mapper = mapper;
    }

    public List<ActivityBean> read(File file){
        return mapper.mapToBeans(file);
    }
}