import java.awt.Toolkit;
import java.awt.Dimension;

public class ResolucaoTela {
    public static void main(String[] args) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) tela.getWidth();
        int altura = (int) tela.getHeight();
        System.out.println("Sua tela está em resolução " + largura + " x " + altura);
    }
}
