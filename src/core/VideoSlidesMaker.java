package core;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

public class VideoSlidesMaker implements SlidesMaker {
    private final Video video;

    public VideoSlidesMaker(Video video) {
        this.video = video;
    }

    @Override
    public List<Image> doSlides() {
        return generateSlidesFromVideo();
    }

    private List<Image> generateSlidesFromVideo() {
        return new ArrayList<>();
    }
}
