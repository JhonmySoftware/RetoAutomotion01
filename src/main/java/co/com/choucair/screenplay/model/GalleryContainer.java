package co.com.choucair.screenplay.model;

public class GalleryContainer {

    private static final String ContainerGalleryGames = "//*[@id='gallery-layout-container']/div//*[@class='exito-vtex-components-4-x-buttonText']";

    public static String getContainerGalleryGames() {
        return ContainerGalleryGames;
    }
}
