package com.xiangR.util;

public class LightOnCommand implements Command{

	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.off();
	}

	public void undo() {
		light.on();
	}

}
