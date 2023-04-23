package ar.com.unlam.clases.callcenter;

public class Contacto {

		String nombre;
		String apellido;
		Integer celular;
		String email;
		String direccion;
		Integer codigoPostal;
		String localidad;
		String provincia;
		Boolean esCliente;
		Boolean serLlamadoNuevamente;
		
		public Contacto(String nombre, String apellido, Integer celular, String email, String direccion,
				Integer codigoPostal, String localidad, String provincia, Boolean esCliente,
				Boolean serLlamadoNuevamente) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.celular = celular;
			this.email = email;
			this.direccion = direccion;
			this.codigoPostal = codigoPostal;
			this.localidad = localidad;
			this.provincia = provincia;
			this.esCliente = esCliente;
			this.serLlamadoNuevamente = serLlamadoNuevamente;
		}
		
		
		public Contacto() {
			
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public String getApellido() {
			return apellido;
		}


		public void setApellido(String apellido) {
			this.apellido = apellido;
		}


		public Integer getCelular() {
			return celular;
		}


		public void setCelular(Integer celular) {
			this.celular = celular;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getDireccion() {
			return direccion;
		}


		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}


		public Integer getCodigoPostal() {
			return codigoPostal;
		}


		public void setCodigoPostal(Integer codigoPostal) {
			this.codigoPostal = codigoPostal;
		}


		public String getLocalidad() {
			return localidad;
		}


		public void setLocalidad(String localidad) {
			this.localidad = localidad;
		}


		public String getProvincia() {
			return provincia;
		}


		public void setProvincia(String provincia) {
			this.provincia = provincia;
		}


		public Boolean getEsCliente() {
			return esCliente;
		}


		public void setEsCliente(Boolean esCliente) {
			this.esCliente = esCliente;
		}


		public Boolean getSerLlamadoNuevamente() {
			return serLlamadoNuevamente;
		}


		public void setSerLlamadoNuevamente(Boolean serLlamadoNuevamente) {
			this.serLlamadoNuevamente = serLlamadoNuevamente;
		}
		
		
		
}
