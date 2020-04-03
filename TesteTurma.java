import javax.swing.JOptionPane;
public class TesteTurma
{
   public static void main(String[] args)
   {
      //Coletando dandos
      String nome=JOptionPane.showInputDialog("\nDigite seu nome:");
      String curso=JOptionPane.showInputDialog("\nDigite o nome do seu curso:");
      int quantidadeDeAlunos=Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de alunos da sala?"));
      int serie =Integer.parseInt(JOptionPane.showInputDialog("Digite a série da turma"));
      
      //Instanciando (criando objeto turma)
      Turma turma = new Turma(nome,curso,quantidadeDeAlunos, serie);
      
      
      String saida="Nome: " +turma.getNome()+"\nCurso: "+turma.getCurso()+"\nQuantidade de alunos da turma: "+turma.getQuantidadeDeAlunos()+"\nSérie: "+turma.getSerie();
   //Imprimindo os dados
   JOptionPane.showMessageDialog(null,saida,"Retorno",JOptionPane.PLAIN_MESSAGE);
   
   //Digitando a alteração
   nome  = JOptionPane.showInputDialog("Digite seu nome:");
   curso = JOptionPane.showInputDialog("Digite o nome do seu curso");
   quantidadeDeAlunos=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos:"));
   serie=Integer.parseInt(JOptionPane.showInputDialog("Digite o número da turma"));
   
   //Acessando os métodos modificadores
   
   turma.setNome(nome);
   turma.setCurso(curso);
   turma.setQuantidadeDeAlunos(quantidadeDeAlunos);
   turma.setSerie(serie);
   
   //Preparando para mostrar os dados alterados:
   saida="Nome: "+turma.getNome()+"\nCurso: "+turma.getCurso()+"\nQuantidade de alunos: "+turma.getQuantidadeDeAlunos()+"\nNúmero de sére da turma: "+turma.getSerie();
   
   //Mostrando os dados alterados
   
    JOptionPane.showMessageDialog(null,saida,"Retorno",JOptionPane.PLAIN_MESSAGE);
   
   
   }
}