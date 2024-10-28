public class ClasseAbstrataT 
{
    int CodigoCidade;
    int QtdAcidentes;
    String NomeCidade;
    
    ClasseAbstrataT()
    {
        this(0,0,"");
    }
    ClasseAbstrataT(int CodeCdd, int QtdAcd, String NomeCdd)
    {
        CodigoCidade = CodeCdd;
        QtdAcidentes = QtdAcd;
        NomeCidade = NomeCdd;
    }
}
