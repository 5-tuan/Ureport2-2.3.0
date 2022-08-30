package djpf.master.ureport2.ureport.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import djpf.master.ureport2.ureport.entity.ReportEntity;
import djpf.master.ureport2.ureport.mapper.ReportMapper;
import djpf.master.ureport2.ureport.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl extends ServiceImpl<ReportMapper, ReportEntity> implements ReportService  {
    @Autowired
    private ReportMapper reportMapper;

    @Override
    public int checkExistByName(String name) {
        QueryWrapper<ReportEntity> queryWrapper = new QueryWrapper<>();
        return this.count(queryWrapper);
    }

    @Override
    public ReportEntity queryReportByName(String name) {
        QueryWrapper<ReportEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(ReportEntity::getFullName, name);
        return this.getOne(queryWrapper);
    }

    @Override
    public List<ReportEntity> queryReportList() {
        return reportMapper.queryReportList();
    }

    @Override
    public int deleteReportByName(String name) {
        QueryWrapper<ReportEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(ReportEntity::getId, name);
        return this.baseMapper.delete(queryWrapper);
    }

    @Override
    public void insertReport(ReportEntity entity) {
        this.save(entity);
    }

    @Override
    public boolean updateReport(ReportEntity entity) {
        return this.updateById(entity);
    }
}
