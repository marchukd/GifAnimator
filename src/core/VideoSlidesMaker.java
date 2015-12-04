package core;

import java.util.ArrayList;
import java.util.List;

public class VideoSlidesMaker extends AbstractSlidesMaker {
    private final Video video;

    public VideoSlidesMaker(Video video) {
        this.video = video;
    }

    @Override
    public List<Image> doSlides() {
        return generateSlidesFromVideo();
    }

    private List<Image> generateSlidesFromVideo() {
        List<Image> slides = new ArrayList<>();
        slides.add(new Image("Image 1"));
        slides.add(new Image("Image 2"));
        slides.add(new Image("Image 3"));
        return slides;
    }
}
