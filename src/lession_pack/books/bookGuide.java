package lession_pack.books;

import java.util.ArrayList;
import java.util.List;

public class bookGuide extends abstClassBook {
    public bookGuide()
    {
        TopicsCount = 0;
        ShchemesCount = 0;
    }
    private String guideMainTopic;
    protected Integer TopicsCount;
    protected Integer ShchemesCount;
    protected List<guideScheme>Schemes = new ArrayList<>();
    protected List<guideTopic>topics = new ArrayList<>();


    public String getGuide() {
        return getBook() +
                "guideMainTopic='" + guideMainTopic + '\'' +
                ", TopicsCount=" + TopicsCount +
                ", ShchemesCount=" + ShchemesCount;
    }

    public void setGuideMainTopic(String guideMainTopic) {
        this.guideMainTopic = guideMainTopic;
    }

    public String getGuideMainTopic() {
        return guideMainTopic;
    }

    public void addScheme(String schName, Integer schPage, String abstImage, String description)
    {
        guideScheme tempScheme = new guideScheme();
        tempScheme.setSchemeName(schName);
        tempScheme.setSchemePage(schPage);
        tempScheme.setSchemeImage(abstImage);
        tempScheme.setSchemeDescription(description);
        Schemes.add(tempScheme);
        ShchemesCount++;
    }
    public String getSchemeByPage(Integer page)
    {
        Integer i = 0;
        while (Schemes.iterator().hasNext())
        {

            if(Schemes.iterator().next().getSchemePage().equals(page))
            {
                return Schemes.get(i).getScheme();
            }
            i++;

        }
        return "no such scheme on this page";
    }
    public void addTopic(String topName, String topText, Integer topPage)
    {
        guideTopic TempTopic = new guideTopic();
        TempTopic.setTopicName(topName);
        TempTopic.setTopicText(topText);
        TempTopic.setTopicStartPage(topPage);
        topics.add(TempTopic);
        TopicsCount++;
    }
    public String getTopic(Integer page)
    {
        Integer i=0;
        while (topics.iterator().hasNext())
        {
            if(topics.iterator().next().getTopicStartPage().equals(page))
            {
                return topics.get(i).getTopic();
            }
            i++;
        }
        return "there is no such topic on this page";
    }
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
        public String getScheme() {
            return "schemeName='" + schemeName + '\'' +
                    ", schemeImage='" + schemeImage + '\'' +
                    ", schemeDescription='" + schemeDescription + '\'' +
                    ", schemePage=" + schemePage;
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////////
    private class guideTopic
    {
        private String topicName;
        private Integer topicStartPage;
        private String topicText;
        public void setTopicName(String name)
        {
            topicName = name;
        }
        public void setTopicStartPage(Integer StartPage)
        {
            topicStartPage = StartPage;
        }
        public void setTopicText(String text)
        {
            topicText = text;
        }
        public String getTopicName()
        {
            return topicName;
        }
        public Integer getTopicStartPage()
        {
            return topicStartPage;
        }
        public String getTopicText()
        {
            return topicText;
        }
        public String getTopic() {
            return
                    "topicName='" + topicName + '\'' +
                    ", topicStartPage=" + topicStartPage +
                    ", topicText='" + topicText + '\'' +
                    '}';
        }
    }
}
