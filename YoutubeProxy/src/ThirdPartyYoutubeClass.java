public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib{

    @Override
    public void listVideos() {
   System.out.println("Mostrar lista");
    }

    @Override
    public void getVideoInfo(int id) {
    System.out.println("Descripcion  del video");
    }

    @Override
    public void downloadVideo(int id) {
        System.out.println("Descargar el video");
    }
}
