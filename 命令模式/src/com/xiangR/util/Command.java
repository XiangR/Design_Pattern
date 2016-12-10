package com.xiangR.util;

/**
 * 命令接口
 * @author xiangrui
 *
 */
public interface Command {
	
	/**
	 * 执行方法
	 */
	public void execute();
	
	/**
	 * 撤销方法
	 */
	public void undo();
}

