package cn.resulte.eduservice.controller;


import cn.resulte.eduservice.entity.subject.OneSubject;
import cn.resulte.eduservice.service.EduSubjectService;
import cn.resulte.eduservice.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 * 课程科目 前端控制器
 * </p>
 *
 * @author Resulte
 * @since 2020-06-05
 */
@RestController
@RequestMapping("/eduservice/subject")
//@CrossOrigin
public class EduSubjectController {
    @Autowired
    private EduSubjectService subjectService;

    @PostMapping("addSubject")
    public R addSubject(MultipartFile file){
        subjectService.saveSubject(file, subjectService);
        return R.ok();
    }

    //查询所有分类
    @GetMapping("getAllSubject")
    public R getAllSubject(){
        List<OneSubject> list =  subjectService.getAllOneTwoSubject();
        return R.ok().data("list", list);
    }
}

