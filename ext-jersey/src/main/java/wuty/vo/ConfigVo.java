package wuty.vo;

public class ConfigVo {

	private String configId = null;
	private String stageId = null;
	private String targetLabel = null;
	private String operator = null;
	private String curFlag = null;
	private String updateUser = null;
	private String updateTime = null;

	public String getConfigId() {
		return configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}
	public String getStageId() {
		return stageId;
	}
	public void setStageId(String stageId) {
		this.stageId = stageId;
	}
	public String getTargetLabel() {
		return targetLabel;
	}
	public void setTargetLabel(String targetLabel) {
		this.targetLabel = targetLabel;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getCurFlag() {
		return curFlag;
	}
	public void setCurFlag(String curFlag) {
		this.curFlag = curFlag;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
}
