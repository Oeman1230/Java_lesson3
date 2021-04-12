package lession_pack.books;

import java.util.ArrayList;
import java.util.List;

public class bookGuide extends abstClassBook {
    protected String guideMainTopic;
    protected Integer guideTopicsCount;
    protected List<guideScheme>guideSchemes = new ArrayList<>();

    //////////////////////////////////////////////////////////////////////////////////////////
    private class guideScheme
    {
     private String schemeName;
     private String schemeImage;
     private String schemeDescription;
     private Integer schemePage;


     public void setSchemeName(String name) {
         schemeName = name;
     }
     public void setSchemePage(Integer page)
     {
         schemePage = page;
     }

     public void setSchemeImage(String abctractStringImage)
     {
         schemeImage = abctractStringImage;
     }
     public void setSchemeDescription(String description)
     {
         schemeDescription = description;
     }
     public String getSchemeImage() {
            return schemeImage;
        }
        public String getSchemeName(){
         return schemeName;
        }
        public String getSchemeDescription()
        {
            return getSchemeDescription();
        }
        public Integer getSchemePage(){
         return schemePage;
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////////
}
