package ChassiUtil;

public class ChassiUtil {
	
	public int obterAno(String chassi, int posicao){
		
		if(chassi == null || chassi.trim().length()!= 17){
			throw new IllegalArgumentException("Chassi informado inv�lido!");
		}
		if(posicao < 0 || posicao > 17){
			throw new IllegalArgumentException("Posi��o informado incorreta!");

		}
		char caractere = chassi.toUpperCase().charAt(posicao -1);
		return (caractere - 'A') + 2010;
		
		/*if(chassi.toUpperCase().charAt(posicao -1) == 'A'){
		
			return 2010;
		
		}else if(chassi.toUpperCase().charAt(posicao -1) == 'B'){
			
			return 2011;
			
			}else if(chassi.toUpperCase().charAt(posicao -1) == 'C'){
				
				return 2012;
				
				}
		return 0; */
	}

}
