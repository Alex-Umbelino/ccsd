public class Produto
{ //Atributos
   private String nome;
   private double pre�o;
   private int quantidade;
   
   //Construtor
   public Produto(String n,double p,int quantidade)
   { 
     //Como eu coloquei os parametros com nomes diferentes dos atributos,n�o preciso usar o THIS
      nome=n;
      pre�o=p;
      this.quantidade=quantidade;
   }
   
   //metodos modificadores
   
   public void setNome(String n)
   {
      nome=n;
   }
   public void setPre�o(double p)
   {
      pre�o=p;
   }
   public void setQuantidade(int quantidade)
   {
      this.quantidade=quantidade;
   }
   
   //M�todos de acesso
   
   public String getNome()
   {
      return nome;
   }
   public double getPre�o()
   {
      return pre�o;
   }
   public int getQuantidade()
   {
      return quantidade;
   }
   
   
   
   
   
   
   
}








