package mydomain.model;

import javax.persistence.*;

@Entity
public class Pet
{
    @Id
    Long id;

    String name;

    public Pet(long id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public Long getId()
    {
        return id;
    }
}
