import javax.swing.JOptionPane;
import java.io.*;

public class ClassePrincipalT 
{
    public static void main (String [] args) throws IOException
    {
        int opc = 0;
        ClasseAbstrataT[]estatistica = new ClasseAbstrataT[10];
        ClasseMetodosT m = new ClasseMetodosT();
        while(opc != 9)
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA: \n1. Cadastrar estatística \n2. Consulta por quantidade de acidentes. \n3. Consulta pelo maior/menor número de acidentes. \n4. Consulta pela quantidade de acidentes acima da média. \n9. Finalizar programa."));
            switch(opc)
            {
                case 1: 
                    estatistica = m.CadastroEstatistica(estatistica);
                    break;
                case 2:
                    m.QtdAcidentes(estatistica);
                    break;
                case 3:
                    m.MaiorMenor(estatistica);
                    break;
                case 4:
                    m.AcimaMedia(estatistica);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Finalizando Programa...");
                    System.exit(0);
                    break;
                default: JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
            }
        }
    }
}
