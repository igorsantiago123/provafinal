package provafinal;
import javax.swing.JOptionPane;
import java.util.*;
public class atv1 {


		
		
			
		public static void main(String[] args) {
				 int i ;
			     ArrayList<String> fip = new ArrayList();

			    // [ B ] usando o método add() para gravar 4 contatos na agenda
			    
			     do
			     {
			     String menu= JOptionPane.showInputDialog("MENU\n1-Cadastrar Carro \n2-Listagem Geral\n3-Mostrar Resultados \n4-SAIR ");
			     i = Integer.parseInt(menu);
			     switch (i)
			        {
			             case 1:
			                String marca= JOptionPane.showInputDialog("Digite o Marca: ");
			                
			                String Modelocar= JOptionPane.showInputDialog("Digite o Modelo do carro: ");
			                String Ano = JOptionPane.showInputDialog("Digite o Ano do carro: ");
			                String Valor= JOptionPane.showInputDialog("Digite o Valor do carro: ");
			                fip.add(marca+";"+Modelocar+";"+Ano+";"+Valor);
			                JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso");
			                
			                 break;
			             case 2:
			            	
			            	 System.out.println(fip.toString());
			                 break;
			             case 3:
			            	
			            	 
			                 break;
			           case 4:
			                 break;
			             default:
			                  JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas");
			        }
			     } while (i!=4);
			     
			}

		

	}


