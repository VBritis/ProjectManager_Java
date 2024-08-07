public class Analise {
    private Tarefa[] listaDeTarefas;
    private int[] porcentagens;
    private Projeto projeto;
    private Membro responsavel;
   
    public Analise(Tarefa[] listaDeTarefas, Projeto projeto){
        this.listaDeTarefas = listaDeTarefas;
        this.projeto = projeto;
        this.porcentagens = new int[50];
    }
    public String relatorioProjeto(Projeto projeto){
        int soma = 0;
        for(int x = 0;x < projeto.listaDeTarefas.length; x++){
            if(projeto.listaDeTarefas[x] != null){
                soma += projeto.listaDeTarefas[x].getStatus();
                
            }else{
                String a = "";
                for(int y = 0; y <= 10; y++){
                    if(y <= soma/x/10){
                        a += "|";
                    }
                    else{
                        a += " ";
                    }
                    

                }
                System.out.println("["+ a +"]");
                return "     " + soma/x + "%";
            }
        }
        return "Erro";

        




    }
}
