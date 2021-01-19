package org.basic.infa.mysql.domain;


import lombok.Data;

@Data
public class TsUser {
  private long id;
  private String username;
  private String password;
  private String salt;
  private java.sql.Timestamp createTime;

}
