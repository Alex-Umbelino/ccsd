import javax.swing.JOptionPane;
public class TesteProduto
{
   public static void main(String[] args)
   {
       //Digitando os dados
       
       String nome = JOptionPane.showInputDialog("Digite o nome do produto");
       double pre�o = Double.parseDouble(JOptionPane.showInputDialog("\nDigite o pre�o do produto:"));
       int quantidade= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto:"));
       
       //Instanciando
       Produto produto = new Produto(nome, pre�o, quantidade);
       
       //Acessando os m�todos modificadores
       
       produto.setNome(nome);
       produto.setPre�o(pre�o);
       produto.setQuantidade(quantidade);
       
       String saida="Dados: ";
       
       saida+="\nNome do produto: " +produto.getNome()+"\nPre�o: "+produto.getPre�o()+"\nquantidade do produto: "+produto.getQuantidade();
       
       
       JOptionPane.showMessageDialog(null,saida,"Retorno:",JOptionPane.PLAIN_MESSAGE);
       
        
       
   }
}