public class Produto
{ //Atributos
   private String nome;
   private double preço;
   private int quantidade;
   
   //Construtor
   public Produto(String n,double p,int quantidade)
   { 
     //Como eu coloquei os parametros com nomes diferentes dos atributos,não preciso usar o THIS
      nome=n;
      preço=p;
      this.quantidade=quantidade;
   }
   
   //metodos modificadores
   
   public void setNome(String n)
   {
      nome=n;
   }
   public void setPreço(double p)
   {
      preço=p;
   }
   public void setQuantidade(int quantidade)
   {
      this.quantidade=quantidade;
   }
   
   //Métodos de acesso
   
   public String getNome()
   {
      return nome;
   }
   public double getPreço()
   {
      return preço;
   }
   public int getQuantidade()
   {
      return quantidade;
   }
   
   
   
   
   
   
   
}








