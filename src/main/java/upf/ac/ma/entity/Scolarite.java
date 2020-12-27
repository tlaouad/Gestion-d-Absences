package upf.ac.ma.entity;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Scolarite
 *
 */
@Entity

public class Scolarite implements Serializable {

	   
	@Id
	private Long idScolarite;
	private static final long serialVersionUID = 1L;

	public Scolarite() {
		super();
	}   
	public Long getIdScolarite() {
		return this.idScolarite;
	}

	public void setIdScolarite(Long idScolarite) {
		this.idScolarite = idScolarite;
	}
   
}
