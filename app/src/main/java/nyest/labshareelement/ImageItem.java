package nyest.labshareelement;

/**
 * Created by nyest on 3/7/2017 AD.
 */

public class ImageItem {

    private String name;
    private int src;

    public ImageItem(String name, int src) {
        this.name = name;
        this.src  = src;
    }

    public String getName() {
        return name;
    }

    public int getSrc() {
        return src;
    }
}
