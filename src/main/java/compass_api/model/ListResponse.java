package compass_api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListResponse<T> {

  private List<T> data;

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
