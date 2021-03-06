package cn.cxh.entry;


import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;


import javax.json.bind.annotation.JsonbDateFormat;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class User {
	private Integer id; //id
	@NotEmpty(message = "用户名不能为空")
	private String userCode; //用户编码
	@NotEmpty(message = "用户名不能为空")
	private String userName; //用户名称
	@NotEmpty(message = "密码不能为空")
	@Length(max = 10,min = 9,message = "密码长度为6-10")
	private String userPassword; //用户密码
	private Integer gender;  //性别
	@DateTimeFormat(pattern = "yyyy-MM-dd")//注入实体自动转换为年月日
	@JSONField(format = "yyyy-MM-dd") //输出json的时候按照年月日
	private Date birthday;  //出生日期
	private String phone;   //电话
	private String address; //地址
	private Integer userRole;    //用户角色
	private Integer createdBy;   //创建者
	private Date creationDate; //创建时间
	private Integer modifyBy;     //更新者
	private Date modifyDate;   //更新时间
	private Integer age;//年龄
	private String userRoleName;    //用户角色名称
	private Role role;
	private String idPicPath;
	private String workPicPath;

	public void setAge(Integer age) {
		this.age = age;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getUserRoleName() {
		return userRoleName;
	}
	public void setUserRoleName(String userRoleName) {

		this.userRoleName = userRoleName;
	}
	public Integer getAge() {
		/*long time = System.currentTimeMillis()-birthday.getTime();
		Integer age = Long.valueOf(time/365/24/60/60/1000).IntegerValue();*/
		Date date = new Date();
		Integer age = date.getYear()-birthday.getYear();
		return age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getUserRole() {
		return userRole;
	}
	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Integer getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getIdPicPath() {
		return idPicPath;
	}
//要在实体类中写入这个方法 ，在控制器才能解析到，这个方法
	public void setIdPicPath(String idPicPath) {
		this.idPicPath = idPicPath;
	}

	public String getWorkPicPath() {
		return workPicPath;
	}

	public void setWorkPicPath(String workPicPath) {
		this.workPicPath = workPicPath;
	}
}
