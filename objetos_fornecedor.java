package curso21_08;

public class objetos_fornecedor {

	public static void main(String[] args) {
		fornecedor fornecedor = new fornecedor ();
		fornecedor.setRazaoSocial("Girassol Artes- Quadros Personalizados");
		fornecedor.setNomefantasia("Ana Julya");
		fornecedor.setId(56498);
		fornecedor.setCnpj("5896");
		fornecedor.setEndereco("Campos Sales");
		fornecedor.setFone("9987654321");
		fornecedor.setEmail("anajulya158@gmail.com");
		fornecedor.setInscricaoEstadual("9876543212");
		
		
		System.out.println(fornecedor.getRazaoSocial());
		System.out.println(fornecedor.getNomeFantasia());
		System.out.println(fornecedor.getId());
		System.out.println(fornecedor.getCnpj());
		System.out.println(fornecedor.getEndereco());
		System.out.println(fornecedor.getFone());
		System.out.println(fornecedor.getEmail());
		System.out.println(fornecedor.getInscricaoEstadual());
		System.out.println(fornecedor.vender());
		System.out.println(fornecedor.comunicar());
	}




	}


