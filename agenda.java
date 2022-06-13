import java.util.Scanner;
//biblioteca java

public class Agenda 
{

	public static void main(String[] args)
	//cadeias de caracteres que armazenam dados textuais
	{
		Scanner read =  new Scanner(System.in);
		//criando scanner
		int a,b,c;
		//declarando as variaveis
		String dados[] = {"Digite seu nome","Digite seu endereco","Digite seu codigo postal","Digite seu bairro","Digite seu telefone"};
		// criado vetor 
		String agenda[][] = new String[10][5];					
		// matriz com 5 linhas e 10 colunas 
	
		
		for(a=0;a<10;a++)
		{
			for(c = 0 ; c < 5 ; c++)						
			//laco da matriz
			{
			System.out.printf("%s:  \n",dados[c]);			
			//exibe na tela as informacoes digitadas.
			agenda[a][c] = read.nextLine();					
			//grava os dados digitados de 'k'
			}	
				for(b=0;b<5;b++) {							//segundo laco da matriz
				}
											
				System.out.printf("\n");
				//quebra linha
				System.out.print("-----\n");
				//simula uma linha de divisoria e quebra a linha
		}
				
				for(a=0;a<10;a++)
				{
					for(b=0;b<5;b++)
					{
					System.out.printf("%s  ",agenda[a][b]);	
					//exibe na tela a agenda finalizada
					}			
		
				System.out.printf("\n");
			
				}
		}
}