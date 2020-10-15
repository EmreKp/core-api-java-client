package compass_api.model;

import java.util.ArrayList;
import java.util.List;

public class ListResponse<T> {

  private Integer page;
  private Integer perPage;
  private Integer total;
  private List<T> data;

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

  public List<T> getData() {
    return data;
  }

  public void setData(List<T> data) {
    this.data = data;
  }

  public ListResponse<T> addElement(T element) {
    this.data = new ArrayList<>();
    this.data.add(element);

    return this;
  }
}
