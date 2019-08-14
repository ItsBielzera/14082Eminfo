package net.maromo;

public class Acamp {
    public String nome;
    public int idade;
    public char grupo;

    public void imprimir(){
        System.out.println("nome = " + nome);
        System.out.println("grupo = " + grupo);
        System.out.println("idade = " + idade);
    }

    public void separarGrupo(){
        if(idade <= 5){
            grupo = '0';
        }else{
            if(idade <=10){
                grupo = 'X';
            }else{
                if(idade<=20){
                    grupo = 'Y';
                }else{
                    grupo = 'Z';
                }
            }
        }
    }
}
