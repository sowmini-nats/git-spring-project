package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Health {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int healthId;
	private String healthAge;
	private int healthPolicyTerm;
	public Health() {
		super();
	}
	public Health(int healthId, String healthAge, int healthPolicyTerm) {
		super();
		this.healthId = healthId;
		this.healthAge = healthAge;
		this.healthPolicyTerm = healthPolicyTerm;
	}
	public int getHealthId() {
		return healthId;
	}
	public void setHealthId(int healthId) {
		this.healthId = healthId;
	}
	public String getHealthAge() {
		return healthAge;
	}
	public void setHealthAge(String healthAge) {
		this.healthAge = healthAge;
	}
	public int getHealthPolicyTerm() {
		return healthPolicyTerm;
	}
	public void setHealthPolicyTerm(int healthPolicyTerm) {
		this.healthPolicyTerm = healthPolicyTerm;
	}
	@Override
	public String toString() {
		return "Health [healthId=" + healthId + ", healthAge=" + healthAge + ", healthPolicyTerm=" + healthPolicyTerm
				+ "]";
	}
	
	
}
