package tap.tradizoneapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Document(collection = "Categorias_Productos")
public class CategoriaProducto {
    
    @Id
	private String id;
    
	private String nombre;
	private String descripcion;
}
