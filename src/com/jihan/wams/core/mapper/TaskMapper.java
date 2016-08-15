package com.jihan.wams.core.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.Mapper;

import com.jihan.wams.core.entity.Task;

@Mapper("mapper")
public interface TaskMapper extends SqlMapper{

	public List<Task> getAllTask();

	public Task getTaskById(String id);
	
	public Task getTaskByNames(String spring);
	
	@Select("select task_id,taskname,taskdetails from t_task where taskname = #{name}")
	public Task getTaskByName(String name);
	
	public void addTask(Task task);
	
	public void editTask(Task task);
	
	public void removeTask(Task task);
}
