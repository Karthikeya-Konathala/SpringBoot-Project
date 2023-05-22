package com.klu.CRS_SDP3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@PasswordValueMatch.List({
        @PasswordValueMatch(
                field = "pswd",
                fieldMatch = "cpswd",
                message = "Passwords do not match!"
        )
})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="register_table")
public class register {
  @Id
  @Column(name="id")
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  @NonNull
  @Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input")
  @Column(name="name")
  private String name;
  @NonNull
  @Email
  @Column(name="email")
  private String email;
  @NonNull
  @ValidPassword
  @Column(name="pswd")
  private String pswd;
  @ValidPassword
  @NonNull
  @Column(name="cpswd")
  private String cpswd;
  public String getCpswd() {
	return cpswd;
}
public void setCpswd(String cpswd) {
	this.cpswd = cpswd;
}
public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getPswd() {
    return pswd;
  }
  public void setPswd(String pswd) {
    this.pswd = pswd;
  }
}