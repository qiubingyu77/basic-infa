package org.basic.infa.mysql.domain;


import lombok.Data;

@Data
public class TsUser {

  private long id;
  private String userId;
  private String userName;
  private String userPasswd;
  private java.sql.Timestamp createTime;

}
