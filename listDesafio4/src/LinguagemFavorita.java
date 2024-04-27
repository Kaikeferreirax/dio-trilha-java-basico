import java.util.Comparator;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {


    private String nome;
    private int anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public int compareTo(LinguagemFavorita linguagem) {
        return this.nome.compareTo(linguagem.nome) ;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Nome: " + getNome() + " , ");
        sb.append("Ano de criação: " + getAnoDeCriacao()+ " , ");
        sb.append("IDE: "+ getIde()+ "\n");
        return  sb.toString();
    }

}

class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.getIde().compareToIgnoreCase(lf2.getIde());
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{


    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {

        int anoDeCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if(anoDeCriacao != 0) return anoDeCriacao;
        return l1.getNome().compareToIgnoreCase(l2.getNome());

    }

}

class ComparatorNomeAnoIde implements Comparator <LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lis1, LinguagemFavorita lis2) {

        int nome = lis1.getNome().compareTo(lis2.getNome());
        if(nome != 0) return nome;

        int anoCriacao = Integer.compare(lis1.getAnoDeCriacao(), lis2.getAnoDeCriacao());
        if(anoCriacao != 0) return anoCriacao;


        return lis1.getIde().compareToIgnoreCase(lis2.getIde());
    }
}