public class ReportService {

    private Ilogger logger;

    public ReportService(Ilogger logger){
        this.logger = logger;
    }

    void generate(){
        logger.log("Generating daily report...");
        System.out.println("Report contents...");
    }
}