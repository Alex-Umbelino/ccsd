import javax.swing.JOptionPane;
public class TesteDisciplina
{
   public static void main(String[] args)
   {
      //Digita��o
      String nome      = JOptionPane.showInputDialog("Digite o nomeda disciplina:");
      String professor = JOptionPane.showInputDialog("Digite o nome do professor:");
      int semestre     = Integer.parseInt(JOptionPane.showInputDialog("Digite qual � o seu semestre:"));
      boolean oferta   = Boolean.parseBoolean(JOptionPane.showInputDialog("Caso tenha uma oferta digite:true"));
      String desconto="";
      System.out.println(oferta);
      
      //instanciando, criando um objeto
      Disciplina disciplina = new Disciplina(nome, professor, semestre,oferta);
      
      //Acessando os metodos de modifica��o
      disciplina.setNome(nome);
      disciplina.setProfessor(professor);
      disciplina.setSemestre(semestre);
      disciplina.setOferta(oferta);
      
     
         if(disciplina.getOferta())
         {
            desconto+="Tem desconto";
         }
         else
         {
            desconto+="N�o tem desconto";
         }
      
      
      //Acessando m�todos de acesso e criando saida
      
      String saida="Nome: "+disciplina.getNome()+"\nProfessor: "+disciplina.getProfessor()+"\nSemestre: "+disciplina.getSemestre()+"\nDesconto: "+desconto;
      
    JOptionPane.showMessageDialog(null,"Resposta:"+saida,"Retorno",JOptionPane.PLAIN_MESSAGE);  
      
      
       
      
   }
}