package com.isoftstone.finance.cwgsapp.responseBean;

/**
* @项目名称：财务公司APP
* @类描述：
* @创建人：lukai
* @创建时间：2016-12-30 10:16
*/
public class OAccountBankInfo
{
  public String code;
  public String id;
  public String name;

  public String getCode()
  {
    return this.code;
  }

  public String getId()
  {
    return this.id;
  }

  public String getName()
  {
    return this.name;
  }

  public void setCode(String paramString)
  {
    this.code = paramString;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setName(String paramString)
  {
    this.name = paramString;
  }
}