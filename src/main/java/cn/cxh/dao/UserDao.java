package cn.cxh.dao;

import cn.cxh.entry.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
   User findByCode(@Param("userCode") String userCode);
//   根据条件查询用户总数
   int findUserCount(@Param("userName") String userNme,@Param("role") int role);
//   用户分页数据
   List<User> findAll(@Param("userName") String userNme,@Param("role") int role,@Param("currentPageNo") int currentPageNo,@Param("pageSize") int pageSize);
 //做增删改查的方法
      int insert(User user);
      User findById(@Param("id") int id);//要注解参数的才能够传进去
      int update(User user);
      int delById(@Param("id") int id);

}
