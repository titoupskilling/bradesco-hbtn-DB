package entities;

import javax.persistence.Id;

public class MaterialCurso {
    @Id
    private int id;
    private String url;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
