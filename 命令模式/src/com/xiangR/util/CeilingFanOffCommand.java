package com.xiangR.util;

/**
 * Ceiling 指令
 * @author xiangrui
 *
 */
public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.off();
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
}
