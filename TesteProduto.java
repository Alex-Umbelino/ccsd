import javax.swing.JOptionPane;
public class TesteProduto
{
   public static void main(String[] args)
   {
       //Digitando os dados
       
       String nome = JOptionPane.showInputDialog("Digite o nome do produto");
       double preço = Double.parseDouble(JOptionPane.showInputDialog("\nDigite o preço do produto:"));
       int quantidade= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto:"));
       
       //Instanciando
       Produto produto = new Produto(nome, preço, quantidade);
       
       //Acessando os métodos modificadores
       
       produto.setNome(nome);
       produto.setPreço(preço);
       produto.setQuantidade(quantidade);
       
       String saida="Dados: ";
       
       saida+="\nNome do produto: " +produto.getNome()+"\nPreço: "+produto.getPreço()+"\nquantidade do produto: "+produto.getQuantidade();
       
       
       JOptionPane.showMessageDialog(null,saida,"Retorno:",JOptionPane.PLAIN_MESSAGE);
       
        
       
   }
}