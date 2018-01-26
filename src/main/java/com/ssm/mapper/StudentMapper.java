package com.ssm.mapper;

import com.ssm.domain.Student;
import com.ssm.page.PageBean;

import java.util.List;

/**
 * Created by dllo on 18/1/26.
 */
/*Student操作的对外接口声明
* 具体实现见Student.xml
* */
public interface StudentMapper {
    /*
    * 查询所有学生列表
    * 1.方法名对应Student.xml中的id属性
    * 2.方法参数对应Student.xml中的parameterType属性
    * 3.方法返回值对应Student.xml中的resultType属性
    * */
    List<Student> selectAll();

    /*
    * 分页查询
    * @param pageBean 包含分页信息对象
    * */
    List<Student> pageSelect(PageBean<Student> pageBean);

    /*
    * 获取学生表总条数
    * */
    Integer getTotalRecord(PageBean<Student> pageBean);
}
