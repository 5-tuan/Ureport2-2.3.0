package djpf.master.ureport2.ureport.provider;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import djpf.master.ureport2.ureport.entity.ReportEntity;
import djpf.master.ureport2.ureport.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.bstek.ureport.provider.report.ReportFile;
import com.bstek.ureport.provider.report.ReportProvider;

import lombok.Setter;

/**
 * Mysql 报表存储
 * @author lgg
 * @version 2022.08.09
 *
 */

@Setter
@Component
@ConfigurationProperties(prefix = "ureport.mysql.provider")
public class MySQLProvider implements ReportProvider{
	private static final String NAME = "mysql-provider";
	
	private String prefix = "mysql:";
	
	private boolean disabled;

	@Autowired
	private ReportService reportService;
	
	@Override
	public InputStream loadReport(String file) {
		ReportEntity reportEntity = reportService.queryReportByName(getCorrectName(file));
		byte[] content = reportEntity.getContent().getBytes();
		ByteArrayInputStream inputStream = new ByteArrayInputStream(content);
		return inputStream;
	}

	@Override
	public void deleteReport(String file) {
		reportService.deleteReportByName(getCorrectName(file));
	}

	@Override
	public List<ReportFile> getReportFiles() {
		List<ReportEntity> list = reportService.queryReportList();
		List<ReportFile> reportList = new ArrayList<>();
		for (ReportEntity reportEntity : list) {
			reportList.add(new ReportFile(reportEntity.getFullName(), reportEntity.getLastModifyTime()));
		}
		return reportList;
	}

	@Override
	public void saveReport(String file, String content) {
		file = getCorrectName(file);
		ReportEntity reportEntity = reportService.queryReportByName(file);
		Date currentDate = new Date();
		if(reportEntity == null){
			reportEntity = new ReportEntity();
			reportEntity.setFullName(file);
			reportEntity.setContent(content);
			reportEntity.setCreatorTime(currentDate);
			reportEntity.setLastModifyTime(currentDate);
			reportService.insertReport(reportEntity);
		}else{
			reportEntity.setContent(content);
			reportEntity.setLastModifyTime(currentDate);
			reportService.updateReport(reportEntity);
		}
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public boolean disabled() {
		return disabled;
	}

	@Override
	public String getPrefix() {
		return prefix;
	}

	/**
	 * 获取没有前缀的文件名
	 * @param name
	 * @return
	 */
	private String getCorrectName(String name){
		if(name.startsWith(prefix)){
			name = name.substring(prefix.length(), name.length());
		}
		return name; 
	}
}
