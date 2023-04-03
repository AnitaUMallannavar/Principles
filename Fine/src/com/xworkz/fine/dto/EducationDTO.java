package com.xworkz.fine.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class EducationDTO implements Serializable {
	private int id;
	private String degreeName;
	private double percentage;
	private String univercity;
	private LocalDate startDate;
	private LocalDate endDate;
	private boolean backlog;
	private String stream;
	private String candidateName;

	public EducationDTO() {
		System.out.println("No args const of EducationDTO");
	}

	public EducationDTO(int id, String degreeName, double percentage, String univercity, LocalDate startDate,
			LocalDate endDate, boolean backlog, String stream, String candidateName) {
		super();
		this.id = id;
		this.degreeName = degreeName;
		this.percentage = percentage;
		this.univercity = univercity;
		this.startDate = startDate;
		this.endDate = endDate;
		this.backlog = backlog;
		this.stream = stream;
		this.candidateName = candidateName;
	}

	@Override
	public String toString() {
		return "EducationDTO [id=" + id + ", degreeName=" + degreeName + ", percentage=" + percentage + ", univercity="
				+ univercity + ", startDate=" + startDate + ", endDate=" + endDate + ", backlog=" + backlog
				+ ", stream=" + stream + ", candidateName=" + candidateName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(backlog, candidateName, degreeName, endDate, id, percentage, startDate, stream, univercity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof EducationDTO)) {
			return false;
		}
		EducationDTO other = (EducationDTO) obj;
		return backlog == other.backlog && Objects.equals(candidateName, other.candidateName)
				&& Objects.equals(degreeName, other.degreeName) && Objects.equals(endDate, other.endDate)
				&& id == other.id && Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& Objects.equals(startDate, other.startDate) && Objects.equals(stream, other.stream)
				&& Objects.equals(univercity, other.univercity);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getUnivercity() {
		return univercity;
	}

	public void setUnivercity(String univercity) {
		this.univercity = univercity;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public boolean getBacklog() {
		return backlog;
	}

	public void setBacklog(boolean backlog) {
		this.backlog = backlog;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

}
