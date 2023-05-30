package DTO;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@Data
public class Doctor {
  @Id
  @GeneratedValue(generator="doctorid")
	@SequenceGenerator(initialValue=456001,allocationSize=1,name="doctorid",sequenceName="doctorid")
  private int id;
  private String name;
  private long mobile;
  private String mail;
  private String gender;
  private Date birthdate;
  private int age;
  private boolean status;
  private String Qualification;
  private String Specialization;
}
