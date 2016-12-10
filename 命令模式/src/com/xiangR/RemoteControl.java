package com.xiangR;

import com.xiangR.util.Command;
import com.xiangR.util.NoCommand;

/**
 * 这是一个遥控器的示例  来加入多条的指令
 * @author xiangrui
 *
 */
public class RemoteControl {

	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		undoCommand = new NoCommand(); 
		
		Command noCommand = new NoCommand();
		for(int i = 0; i < 7; i ++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int solt, Command onCommand, Command offCommand) {
		onCommands[solt] = onCommand;
		offCommands[solt] = offCommand;
	}
	
	public void onButtonWasPushed(int solt) {
		onCommands[solt].execute();
		undoCommand = onCommands[solt];			// 使用 undoComand  来保存此命令
	}
	
	public void offButtonWasPushed(int solt) {
		offCommands[solt].execute();
		undoCommand = offCommands[solt];
	}
	
	public void undoButtonWasPushed(int solt) {
		undoCommand.undo();
	}

	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
				+ "    " + offCommands[i].getClass().getName() + "\n");
		}
		stringBuff.append("[undo] " + undoCommand.getClass().getName() + "\n");
		return stringBuff.toString();
	}
}
