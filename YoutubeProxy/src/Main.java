public class Main {
    public static void main (String[]args){
        ThirdPartyYoutubeLib service = new ThirdPartyYoutubeClass();
CachedYoutubeClass party = new CachedYoutubeClass(service);
party.downloadVideo(2);
party.getVideoInfo(0);
party.listVideos();
    }
}
