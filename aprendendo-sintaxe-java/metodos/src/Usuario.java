public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        System.out.println("Canal Atual ? "+ smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Canal Atual ? "+ smartTv.canal);
        
        System.out.println("Volume atual ? "+ smartTv.volume);


        System.out.println("A tv está ligada ? "+ smartTv.ligada);
        System.out.println("Canal Atual ? "+ smartTv.canal);
        System.out.println("Volume atual ? "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo estado, a tv está ligada ? "+ smartTv.ligada);
        
    }
    
}
