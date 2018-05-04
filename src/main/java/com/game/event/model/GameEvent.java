package com.game.event.model;

public class GameEvent {

	private int userId;
	private String userName;
	private int topicId;
	private String topicName;
	private String gender;
	private String userLabel;
	private String userCountry;
	private String gameStatus;
	private int questionId;
	private String questionOption;
	private String userFinalScore;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUserLabel() {
		return userLabel;
	}

	public void setUserLabel(String userLabel) {
		this.userLabel = userLabel;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public String getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(String gameStatus) {
		this.gameStatus = gameStatus;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionOption() {
		return questionOption;
	}

	public void setQuestionOption(String questionOption) {
		this.questionOption = questionOption;
	}

	public String getUserFinalScore() {
		return userFinalScore;
	}

	public void setUserFinalScore(String userFinalScore) {
		this.userFinalScore = userFinalScore;
	}

	public GameEvent(int userId, String userName, int topicId, String topicName, String gender, String userLabel,
			String userCountry, String gameStatus, int questionId, String questionOption, String userFinalScore) {

		this.userId = userId;
		this.userName = userName;
		this.topicId = topicId;
		this.topicName = topicName;
		this.gender = gender;
		this.userLabel = userLabel;
		this.userCountry = userCountry;
		this.gameStatus = gameStatus;
		this.questionId = questionId;
		this.questionOption = questionOption;
		this.userFinalScore = userFinalScore;
	}

	public GameEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String data = String.format(
				"{'userId':%d,'userName':%s,"
						+ "'topicId':%d,'topicName':%s,'gender':%s,'userLabel':%s,'userCountry':%s,"
						+ "'gameStatus':%s,'questionId':%d,'questionOption':%s,'userFinalScore':%s}",
				userId, userName, topicId, topicName, gender, userLabel, userCountry, gameStatus, questionId,
				questionOption, userFinalScore);
		// return "GameEvent [userId=" + userId + ", userName=" + userName + ",
		// topicId=" + topicId + ", topicName="
		// + topicName + ", gender=" + gender + ", userLabel=" + userLabel + ",
		// userCountry=" + userCountry
		// + ", gameStatus=" + gameStatus + ", questionId=" + questionId + ",
		// questionOption=" + questionOption
		// + ", userFinalScore=" + userFinalScore + "]";
		return data;
	}
}
