import java.util.Random;

public class Util {

    static Random r = new Random();

    static String[] names = {"Francisco Moraes","Nicolas Souza","Fernando Nascimento","Joaquim Monteiro ","Daniel Mendes","Murilo Almeida","Benício Moraes","Calebe Pereira ","Benjamin Ferreira","Antônio Jesus","Noah Viana","Lucas Gabriel Nascimento ","Danilo Peixoto","Felipe da Costa","João Guilherme Cavalcanti","Fernando Caldeira ","Davi Luiz Cardoso","André Oliveira","Vitor Gabriel Dias","Davi Luiz das Neves ","Theo Nascimento","Erick Gomes","Antônio da Rosa","Raul Almeida ","Luigi Porto","Pedro Lucas Lopes","Bruno Alves","Augusto Barbosa ","Heitor Pinto","Igor da Cunha","Benjamin Carvalho","Danilo Caldeira ","Henrique Souza","Breno da Luz","Marcelo Rezende","Thales Rodrigues ","João Felipe da Rocha","Davi Barros","Thiago Moura","Yuri Correia ","Diogo da Rosa","João Lucas Rocha","Danilo Silveira","Rafael Cardoso ","Pedro Lucas Gonçalves","Henrique Martins","Raul da Luz","João Pedro Caldeira ","Pedro Lucas da Cunha","Cauã da Paz","Lucas Azevedo","Levi Moura ","Marcos Vinicius Cavalcanti","João Lucas Gomes","Pedro da Mata","Gabriel da Cruz ","Vitor Pereira","Thiago Novaes","Leandro Nogueira","Cauê Mendes ","Lucas da Rocha","Anthony Peixoto","Guilherme Campos","Luiz Gustavo Alves ","Luigi Viana","Enrico Moraes","Luiz Otávio Lima","Lorenzo Santos ","Bruno Barros","Pietro Carvalho","Calebe da Luz","Renan da Rosa ","Danilo Oliveira","Emanuel Souza","Davi Cardoso","Lorenzo Souza ","João Vitor Dias","Diogo Porto","Anthony Barbosa","Breno Novaes ","Marcelo da Rocha","Cauê Farias","Vinicius Barbosa","Luigi Castro ","Otávio Vieira","Bernardo Cardoso","Calebe Rocha","Calebe Moura ","Enzo Mendes","Diogo Correia","Vitor Hugo Fogaça","Lucas Gabriel Nogueira ","João Gabriel da Costa","Felipe Campos","Anthony Silva","João Miguel Souza ","Murilo Monteiro","Leandro Oliveira","Thomas Peixoto","Thomas Silva"};

    public static Integer sortInteger(){
        return r.nextInt(50);
    }

    public static String sortName() {
        return names[r.nextInt(100)];
    }
}
