package compass_api.model;

import java.util.List;

public class ListResponse {
  private Integer page;
  private Integer perPage;
  private Integer total;
  private List<?> data;

  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public Integer getPerPage() {
    return perPage;
  }

  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public List<?> getData() {
    return data;
  }

  public void setData(List<?> data) {
    this.data = data;
  }
}
