package com.xiangR.util;

/**
 * GargeDoor 指令
 * @author xiangrui
 *
 */

public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
}
