import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String img = "src/Imagens/2608.jpg";
        BufferedImage imagem = ImageIO.read(new File(img)); //coleta a imagem

        int width = imagem.getWidth();  //pega a largura e altura da imagem
        int height = imagem.getHeight();

        int newWidth = 456; //define a nova largura e altura
        int newHeigth = 456;

        BufferedImage novaImagem = new BufferedImage(newWidth,newHeigth,BufferedImage.TYPE_INT_RGB); //instancia uma nova imagem


        Graphics2D g2d = novaImagem.createGraphics();  //criado para poder desenhar a imagem
        g2d.drawImage(imagem.getScaledInstance(newWidth,newHeigth,Image.SCALE_SMOOTH),0,0,null); //redimenciona para o tamanho desefinido
        g2d.dispose();       //Image.SCALE_SMOOTH deixa a imagem com uma qualidade "melhor"

        ImageIO.write(novaImagem,"jpg", new File("src/ImagensRedimencionadas/ImagemRedimencionada.jpg")); //salva uma nova imagem

    }
}