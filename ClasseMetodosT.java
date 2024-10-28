import javax.swing.JOptionPane;
import java.io.*;

public class ClasseMetodosT 
{
    static int i;
    public ClasseAbstrataT[]CadastroEstatistica(ClasseAbstrataT[]estatistica) throws IOException 
    {
        String fileName = "ArquivoTransito.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));
        for(i = 0; i < 10; i++)
        {
            estatistica[i] = new ClasseAbstrataT();
        }
        for(i = 0; i < 10; i++)
        {
            estatistica[i].CodigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Insira o código da cidade: "));
            gravar.write(Integer.toString(estatistica[i].CodigoCidade));
            gravar.newLine();
            
            estatistica[i].NomeCidade = JOptionPane.showInputDialog("Insira o nome da cidade");
            gravar.write(estatistica[i].NomeCidade);
            gravar.newLine();
            
            estatistica[i].QtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de acidentes: "));
            gravar.write(Integer.toString(estatistica[i].QtdAcidentes));
            gravar.newLine();
        }
        JOptionPane.showMessageDialog(null, "Gravação concluída com êxito.");
        gravar.close();
        return estatistica;
    }
    public static void QtdAcidentes(ClasseAbstrataT[]estatistica) throws IOException
    {
        int valid = 0;
        String fileName = "ArquivoTransito.txt";
        BufferedReader ler = new BufferedReader(new FileReader(fileName));
        for(i = 0; i < 10; i++)
        {
            estatistica[i].CodigoCidade = Integer.parseInt(ler.readLine());
            estatistica[i].NomeCidade = ler.readLine();
            estatistica[i].QtdAcidentes = Integer.parseInt(ler.readLine());
            if(estatistica[i].QtdAcidentes > 100 && estatistica[i].QtdAcidentes < 500)
            {
                System.out.println("Nome da cidade: " + estatistica[i].NomeCidade + "\nCódigo da cidade: " + estatistica[i].CodigoCidade + "\nQuantidade de acidentes: " + estatistica[i].QtdAcidentes);
                valid = 1;
            }
        }
        if(valid == 0)
        {
            System.out.println("Quantidade não encontrada.");
        }
        ler.close();
    }
    public void MaiorMenor(ClasseAbstrataT[]estatistica) throws IOException
    {
        int max = 0;
        int min = 0;
        String fileName = "ArquivoTransito.txt";
        BufferedReader ler = new BufferedReader(new FileReader(fileName));
        for(i = 0; i < 10; i++)
        {
            estatistica[i].CodigoCidade = Integer.parseInt(ler.readLine());
            estatistica[i].NomeCidade = ler.readLine();
            estatistica[i].QtdAcidentes = Integer.parseInt(ler.readLine());
            if(i == 0)
            {
                max = estatistica[i].QtdAcidentes;
                min = estatistica[i].QtdAcidentes;
            }
            if(estatistica[i].QtdAcidentes > max)
            {
                max = estatistica[i].QtdAcidentes;
            }
            if(estatistica[i].QtdAcidentes < min)
            {
                min = estatistica[i].QtdAcidentes;
            }
        }
        System.out.println("Maior número de acidentes: " + max + "\nMenor número de acidentes: " + min);
        ler.close();
    }
    public void AcimaMedia(ClasseAbstrataT[]estatistica) throws IOException
    {
        double media = 0;
        String fileName = "ArquivoTransito.txt";
        BufferedReader ler = new BufferedReader(new FileReader(fileName));
        for(i = 0; i < 10; i++)
        {
            estatistica[i].CodigoCidade = Integer.parseInt(ler.readLine());
            estatistica[i].NomeCidade = ler.readLine();
            estatistica[i].QtdAcidentes = Integer.parseInt(ler.readLine());
            media = media + estatistica[i].QtdAcidentes;
        }
        media = media / 10;
        System.out.println("Média de acidentes: " + media);
        for(i = 0; i < 10; i++)
        {
            if(estatistica[i].QtdAcidentes > media)
            {
                System.out.println("Nome da cidade: " + estatistica[i].NomeCidade + "\nCódigo da cidade: " + estatistica[i].CodigoCidade + "\nQuantidade de acidentes: " + estatistica[i].QtdAcidentes);
            }
        }
        ler.close(); 
    }
}
