package xiangR.state;

/**
 * 状态接口
 * @author xiangrui
 *
 */
public interface State {

	// 添加硬币
	public void insertQuarter();
	
	// 退回硬币
	public void ejectQuarter();
	
	// 转动曲轴
	public void turnCrank();
	
	// 发放糖果
	public void dispense();
}
