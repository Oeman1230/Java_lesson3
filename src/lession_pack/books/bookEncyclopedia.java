package lession_pack.books;

import java.util.ArrayList;
import java.util.List;

public class bookEncyclopedia extends bookGuide {
    bookEncyclopedia()
    {
        imagesCount = 0;
    }
    private String encyName;
    private Integer encyPagesCount;
    private Integer imagesCount;
    List<encyImages>images = new ArrayList<>();

    public void setEncyName(String encyName) {
        this.encyName = encyName;
    }

    public void setImagesCount(Integer imagesCount) {
        this.imagesCount = imagesCount;
    }

    public String getEncyName() {
        return encyName;
    }

    public void setEncyPagesCount(Integer encyPagesCount) {
        this.encyPagesCount = encyPagesCount;
    }

    public Integer getEncyPagesCount() {
        return encyPagesCount;
    }

    public Integer getImagesCount() {
        return imagesCount;
    }

    public void addImage(Integer page, String abstImage)
    {
        encyImages temp = new encyImages();
        temp.setImagePage(page);
        temp.setAbstrImage(abstImage);
        images.add(temp);
        imagesCount++;
    }
    public String getImageByPage(Integer page)
    {
        Integer i=0;
        while (images.iterator().hasNext())
        {
            if(images.iterator().next().getImagePage().equals(page))
                return images.get(i).getImage();
            i++;
        }
        return "where is no images on this page";
    }
    private class encyImages
    {
        private Integer imagePage;
        private String abstrImage;

        public void setAbstrImage(String abstrImage) {
            this.abstrImage = abstrImage;
        }

        public void setImagePage(Integer imagePage) {
            this.imagePage = imagePage;
        }

        public Integer getImagePage() {
            return imagePage;
        }

        public String getAbstrImage() {
            return abstrImage;
        }
        public String getImage() {
            return
                    "imagePage=" + imagePage +
                    ", abstrImage='" + abstrImage + '\'' +
                    '}';
        }
    }

}
