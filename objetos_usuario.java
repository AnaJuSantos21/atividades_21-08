package curso21_08;

public class objetos_usuario {

	public static void main(String[] args) {
		usuario usuario = new usuario ();
		usuario.setNome("Nome: Maria");
		usuario.setUsuario("Usuario:123456789");
		usuario.setId(56498);
		usuario.setsenha(10953);
		usuario.setpermissao("Navegar");
		System.out.println(usuario.getNome());
		System.out.println(usuario.getUsuario());
		System.out.println(usuario.getId());
		System.out.println(usuario.getsenha());
		System.out.println(usuario.getPermissao());
		System.out.println(usuario.cadastrar());
		System.out.println(usuario.mudanca());
		System.out.println(usuario.logOut());
	}


}


