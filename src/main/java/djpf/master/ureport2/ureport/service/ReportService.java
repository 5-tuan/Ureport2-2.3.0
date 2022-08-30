package djpf.master.ureport2.ureport.service;

import com.baomidou.mybatisplus.extension.service.IService;
import djpf.master.ureport2.ureport.entity.ReportEntity;

import java.util.List;

public interface ReportService extends IService<ReportEntity> {
    /**
     *  根据报表名称检查报表是否存在
     * @param name 报表名称
     * @return
     */
    int checkExistByName(String name);

    /**
     *  根据报表名称查询报表
     * @param name 报表名称
     * @return
     */
    ReportEntity queryReportByName(String name);

    /**
     * 查询全部报表
     * @return
     */
    List<ReportEntity> queryReportList();

    /**
     * 根据报表名称删除报表
     * @param name
     * @return
     */
    int deleteReportByName(String name);


    /**
     *  保存报表
     */
    void insertReport(ReportEntity entity);

    /**
     *  更新报表
     * @param entity
     * @return
     */
    boolean updateReport(ReportEntity entity);
}
