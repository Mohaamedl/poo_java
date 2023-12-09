package aula5;
/*
1 - inscrever utilizador
2 - remover utilizador
3 - imprimir lista de utilizadores
4 - registar um novo livro
5 - imprimir lista de catalogo
6 - emprestar
7 - devolver
8 - sair
*/
import java.util.Scanner;
public class MenuBibl {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in).useDelimiter("[\r\n]+");
        System.out.println("1 - inscrever utilizador\n2 - remover utilizador\n3 - imprimir lista de utilizadores\n4 - registar um novo livro");
        System.out.println("5 - imprimir lista de catalogo\n6 - emprestar\n7 - devolver\n8 - sair");
        int n = input.nextInt(),i=0,j=0;
        Utilizador[] users = new Utilizador[100];
        Livro[] catalogo = new Livro[100];

        while(n!=8){
            switch(n){
                case 1: 
                if(i<100) {
                    System.out.println("nome: ");
                    String nome = input.next();
                    System.out.println("nMec: ");
                    int nMec = Integer.parseInt(input.next());
                    System.out.println("curso: "); 
                    String curso = input.next();
                    users[i]=new Utilizador(nome,nMec,curso);
                    i++;
                }
                break;
                case 2 :{
                    System.out.println("nMec do aluno: ");
                    int nMec = input.nextInt();
                    for (int y = 0; y<users.length;y++){
                        if(users[y].getnMec()==nMec && users[y]!=null){
                            users[y]=null;
                        }
                    }

                }
                break;
                case 3 : {
                    for (int u = 0;u<users.length;u++){
                        if(users[u]!=null)
                            System.out.println(users[u]);
                    }
                }
                break;
                case 4 : {
                    if(j<100){
                        System.out.println("titulo: ");
                        String titulo = input.next();
                        System.out.println("tipo de emprestimo: ");
                        String tipoEmprestimo = input.next();
                        catalogo[j] = new Livro(titulo,tipoEmprestimo);
                        j++;

                    }
                }
                break;
                case 5 :
                for (int u = 0;u<users.length;u++){
                    if(catalogo[u]!=null)
                        System.out.println(catalogo[u]);
                }
                break;
                case 6 :{
                    System.out.println("nMec do aluno:");
                    int nMec = input.nextInt();
                    System.out.println("Id do livro a emprestar:");
                    int id = input.nextInt();
                    for(int l = 0;l<catalogo.length;){
                        if (catalogo[l]!=null && catalogo[l].getId()==id && catalogo[l].getDisponivel().equals("sim") && catalogo[l].getTipoEmprestimo().equalsIgnoreCase("NORMAL")){
                            for (int l2=0;l2<users.length;l2++){
                                if(users[l2]!=null && users[l2].getnMec()==nMec){
                                    for (int y=0;y<3;y++){
                                        if (users[l2].getLimiteLivros()[y]==0){
                                            int[] lm=users[l2].getLimiteLivros();
                                            lm[y]=id;
                                            users[l2].setLimiteLivros(lm);
                                            catalogo[l].setDisponivel("nao");
                                            System.out.println("Emprestado com sucesso.");
                                            break;
                                        }
                    
                                    }
                                break;     
                                }
                           }
                        break;
                        }
                        else {
                        System.out.println("impossivel efetuar operação, tente outro livro.");
                        break;
                        }
                    } 
                }
                break;
                case 7 : {
                    System.out.println("nMec do aluno:");
                    int nMec = input.nextInt();
                    System.out.println("Id do livro a devolver:");
                    int id = input.nextInt();
                    for(int l = 0;l<users.length;l++){
                        if(users[l]!=null && users[l].getnMec()==nMec){
                            for(int y =0;y<3;y++){
                                if(users[l].getLimiteLivros()[y]==id){
                                    int[] lm = users[l].getLimiteLivros();
                                    lm[y]=0;
                                }
                            
                            }
                        }
                    }
                    for (int l1 =0 ;l1<catalogo.length;l1++){
                        if(catalogo[l1]!=null && catalogo[l1].getId()==id){
                            catalogo[l1].setDisponivel("sim");
                            System.out.println("Devolvido.");
                            break;
                        }
                    }
                }
                
                break;


            }
            System.out.println("1 - inscrever utilizador\n2 - remover utilizador\n3 - imprimir lista de utilizadores\n4 - registar um novo livro");
            System.out.println("5 - imprimir lista de catalogo\n6 - emprestar\n7 - devolver\n8 - sair");
            n = Integer.parseInt(input.next());

        }
        input.close();
        
    }
    
}
