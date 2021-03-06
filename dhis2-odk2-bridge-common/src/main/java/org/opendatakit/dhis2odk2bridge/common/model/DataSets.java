package org.opendatakit.dhis2odk2bridge.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisp.dhis.common.Pager;

import java.util.List;

public class DataSets implements NameIdPairContainer<DataSet> {
  private Pager pager;
  private List<DataSet> list;

  @JsonProperty
  public Pager getPager() {
    return pager;
  }

  public void setPager(Pager pager) {
    this.pager = pager;
  }

  @JsonProperty("list")
  public List<DataSet> getList() {
    return list;
  }

  public void setList(List<DataSet> list) {
    this.list = list;
  }

  @Override
  public String toString() {
    return "DataSets{" +
        "pager=" + pager +
        ", list=" + list +
        '}';
  }
}
