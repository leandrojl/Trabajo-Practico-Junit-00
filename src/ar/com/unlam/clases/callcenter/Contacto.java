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
		Boolean serLlamado=true;
		Boolean enLlamada=false;
		
		public Contacto(String nombre, String apellido, Integer celular, String email, String direccion,
				Integer codigoPostal, String localidad, String provincia, Boolean esCliente,
				Boolean serLlamado, Boolean enLlamada) {
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
			this.serLlamado = serLlamado;
			this.enLlamada = enLlamada;
		}
		
		
		public Contacto() {
			
		}
		
		

		public Contacto(String nombre, String apellido, int celular, String email, String direccion, int codigoPostal, String localidad,
				String provincia, boolean esCliente, boolean serLlamado) {
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
			this.serLlamado = serLlamado;
		}


		public Boolean getSerLlamado() {
			return serLlamado;
		}


		public void setSerLlamado(Boolean serLlamado) {
			this.serLlamado = serLlamado;
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

		public Boolean getEnLlamada() {
			return enLlamada;
		}


		public void setEnLlamada(Boolean enLlamada) {
			this.enLlamada = enLlamada;
		}


		public void cambiarEstadoDeLlamado() {
			this.enLlamada = true;
			
		}
		
		
		
}
