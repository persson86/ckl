package ckl.lfspersson.ckl;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


/**
 * Created by LFSPersson on 09/11/16.
 */

public class ArticleModel extends RealmObject {

    @PrimaryKey
    private int id;
    @SerializedName("title")
    private String title;
    @SerializedName("website")
    private String website;
    @SerializedName("authors")
    private String authors;
    @SerializedName("date")
    private String date;
    @SerializedName("content")
    private String content;
    @SerializedName("tags")
    private RealmList<ArticleTagModel> articleTag;
    private Boolean readStatus;

    public ArticleModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public RealmList<ArticleTagModel> getTag() {
        return articleTag;
    }

    public void setTag(RealmList<ArticleTagModel> articleTag) {
        this.articleTag = articleTag;
    }

    public Boolean getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(Boolean readStatus) {
        this.readStatus = readStatus;
    }

}
