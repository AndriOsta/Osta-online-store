package ua.andriosta.projects.ostastore.objects;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import ua.andriosta.projects.ostastore.enums.SearchType;

import javax.faces.context.FacesContext;
import java.util.HashMap;
import java.util.Map;

@Component
public class Utils {

    private Character[] letters = new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'N', 'M', 'O', 'P', 'X', 'V', 'W', 'Z', 'Y', 'R', 'S', 'T'};
    private Map<String,SearchType>searchTypeList=new HashMap<String, SearchType>();
    private SearchType selectedSearchType=SearchType.TITLE;
    @Autowired
    private MessageSource msg;

    public Character[] getLetters() {
        return letters;
    }


    public Map<String,SearchType>getSearchTypeList(){
       searchTypeList.clear();
       searchTypeList.put(msg.getMessage("author_name", null, FacesContext.getCurrentInstance().getViewRoot().getLocale()), SearchType.AUTHOR);
        searchTypeList.put(msg.getMessage("book_name",null, FacesContext.getCurrentInstance().getViewRoot().getLocale()),SearchType.TITLE);
        return searchTypeList;

    }

    public SearchType getSelectedSearchType() {
        return selectedSearchType;
    }

    public void setSelectedSearchType(SearchType selectedSearchType) {
        this.selectedSearchType = selectedSearchType;
    }

    public void setSearchTypeList(Map<String, SearchType> searchTypeList) {
        this.searchTypeList = searchTypeList;
    }
}
