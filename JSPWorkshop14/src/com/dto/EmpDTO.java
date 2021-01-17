package com.dto;

public class EmpDTO {


	private String STUDENT_NO;
	private	String DEPARTMENT_NO;
	private	String STUDENT_NAME;
	private String STUDENT_SSN;
	private String STUDENT_ADDRESS;
	private String ENTRANCE_DATE;
	private char ABSENCE_YN;
	private String COACH_PROFESSOR_NO;
	
	public EmpDTO() {
		super();
		
	}
	
	public EmpDTO(String sTUDENT_NO, String dEPARTMENT_NO, String sTUDENT_NAME, String sTUDENT_SSN,
			String sTUDENT_ADDRESS, String eNTRANCE_DATE, char aBSENCE_YN, String cOACH_PROFESSOR_NO) {
		super();
		STUDENT_NO = sTUDENT_NO;
		DEPARTMENT_NO = dEPARTMENT_NO;
		STUDENT_NAME = sTUDENT_NAME;
		STUDENT_SSN = sTUDENT_SSN;
		STUDENT_ADDRESS = sTUDENT_ADDRESS;
		ENTRANCE_DATE = eNTRANCE_DATE;
		ABSENCE_YN = aBSENCE_YN;
		COACH_PROFESSOR_NO = cOACH_PROFESSOR_NO;
	}

	public String getSTUDENT_NO() {
		return STUDENT_NO;
	}

	public void setSTUDENT_NO(String sTUDENT_NO) {
		STUDENT_NO = sTUDENT_NO;
	}

	public String getDEPARTMENT_NO() {
		return DEPARTMENT_NO;
	}

	public void setDEPARTMENT_NO(String dEPARTMENT_NO) {
		DEPARTMENT_NO = dEPARTMENT_NO;
	}

	public String getSTUDENT_NAME() {
		return STUDENT_NAME;
	}

	public void setSTUDENT_NAME(String sTUDENT_NAME) {
		STUDENT_NAME = sTUDENT_NAME;
	}

	public String getSTUDENT_SSN() {
		return STUDENT_SSN;
	}

	public void setSTUDENT_SSN(String sTUDENT_SSN) {
		STUDENT_SSN = sTUDENT_SSN;
	}

	public String getSTUDENT_ADDRESS() {
		return STUDENT_ADDRESS;
	}

	public void setSTUDENT_ADDRESS(String sTUDENT_ADDRESS) {
		STUDENT_ADDRESS = sTUDENT_ADDRESS;
	}

	public String getENTRANCE_DATE() {
		return ENTRANCE_DATE;
	}

	public void setENTRANCE_DATE(String eNTRANCE_DATE) {
		ENTRANCE_DATE = eNTRANCE_DATE;
	}

	public char getABSENCE_YN() {
		return ABSENCE_YN;
	}

	public void setABSENCE_YN(char aBSENCE_YN) {
		ABSENCE_YN = aBSENCE_YN;
	}

	public String getCOACH_PROFESSOR_NO() {
		return COACH_PROFESSOR_NO;
	}

	public void setCOACH_PROFESSOR_NO(String cOACH_PROFESSOR_NO) {
		COACH_PROFESSOR_NO = cOACH_PROFESSOR_NO;
	}

	@Override
	public String toString() {
		return "EmpDTO [STUDENT_NO=" + STUDENT_NO + ", DEPARTMENT_NO=" + DEPARTMENT_NO + ", STUDENT_NAME="
				+ STUDENT_NAME + ", STUDENT_SSN=" + STUDENT_SSN + ", STUDENT_ADDRESS=" + STUDENT_ADDRESS
				+ ", ENTRANCE_DATE=" + ENTRANCE_DATE + ", ABSENCE_YN=" + ABSENCE_YN + ", COACH_PROFESSOR_NO="
				+ COACH_PROFESSOR_NO + "]";
	}


	

}
