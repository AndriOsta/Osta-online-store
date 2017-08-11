package ua.andriosta.projects.ostastore.objects;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ua.andriosta.projects.ostastore.entites.Kind;
import ua.andriosta.projects.ostastore.enums.SearchType;

import java.io.Serializable;

@Component
@Scope("singleton")
public class SearchCriteria implements Serializable {

    private String text;
    private Character letter;
    private SearchType searchType=SearchType.TITLE;

    private Kind kind;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Character getLetter() {
        return letter;
    }

    public void setLetter(Character letter) {
        this.letter = letter;
    }

    public SearchType getSearchType() {
        return searchType;
    }

    public void setSearchType(SearchType searchType) {
        this.searchType = searchType;
    }



    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }
}
