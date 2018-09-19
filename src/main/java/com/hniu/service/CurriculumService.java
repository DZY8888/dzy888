package com.hniu.service;

import com.hniu.entity.Curriculum;
import com.hniu.entity.CurriculumWithBLOBs;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurriculumService {

    //分页查询课程信息
    List<CurriculumWithBLOBs> selectCurriculumList(int currentPage,int pageSize);

    //查询课程信息
    CurriculumWithBLOBs selectCurriculum(int curriculum_id);

    //添加课程信息
    int inputCurriculum(CurriculumWithBLOBs curriculum);

    //修改课程信息
    int updateCurriculum(int curriculum_id,CurriculumWithBLOBs curriculum);

    //删除课程信息
    int deleteCurriculum(int curriculum_id);

}
