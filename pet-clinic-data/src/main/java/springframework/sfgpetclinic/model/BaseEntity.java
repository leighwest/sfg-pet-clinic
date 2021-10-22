package springframework.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    // Use a box type rather than a primitive (i.e. long) because box types can be null
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
