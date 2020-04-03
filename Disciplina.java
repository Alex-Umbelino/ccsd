public class Disciplina 
{  //Atributos
   private String nome;
   private String professor;
   private int semestre;
   private boolean oferta;
   
   //Método construtor
   public Disciplina(String nome, String p, int s, boolean o) 
   {
      this.nome=nome;
      professor=p;
      semestre=s;
      oferta=false;
   }
   
   //métodos modificadores
   
   public void setNome(String nome)
   {
      this.nome=nome;
   }
   public void setProfessor(String p)
   {
      professor=p;
   }
   public void setSemestre(int s)
   {
      semestre=s;
   }
   public void setOferta(boolean o)
   {
      oferta=o;
   }
   //Métodos de acesso
   
   public String getNome()
   {
      return nome;
   }
   public String getProfessor()
   {
      return professor;
   }
   public int getSemestre()
   {
      return semestre;
   }
   public boolean getOferta()
   {
      return oferta;
   }
   
   
}