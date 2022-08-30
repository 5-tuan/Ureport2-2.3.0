package djpf.master.ureport2.ureport.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import djpf.master.ureport2.ureport.entity.ReportEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReportMapper extends BaseMapper<ReportEntity> {
    /**
     * 查询全部报表
     * @return
     */
    List<ReportEntity> queryReportList();
}
