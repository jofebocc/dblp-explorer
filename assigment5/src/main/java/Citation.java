import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Citation {
    @SerializedName("id")
    private String id;
    @SerializedName("title")
    private String title;
    @SerializedName("authors")
    private List<Authors> authors;
    @SerializedName("n_citation")
    private int nCitation;
    @SerializedName("fos")
    private List<FOS> fos;
    @SerializedName("venue")
    private List<Venue> venue;
    @SerializedName("page_start")
    private int pageStart;
    @SerializedName("page_end")
    private int pageEnd;
    @SerializedName("publisher")
    private String Publisher;
    @SerializedName("volume")
    private String Volume;
    @SerializedName("issue")
    private String issue;
    @SerializedName("doi")
    private String doi;
    @SerializedName("doc_type")
    private String doc_Type;
    @SerializedName("year")
    private int year;
    public Citation(){}

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<FOS> getFos() {
        return fos;
    }

    public String getDoc_Type() {
        return doc_Type;
    }

    public void setDoc_Type(String doc_Type) {
        this.doc_Type = doc_Type;
    }

    public void setFos(List<FOS> fos) {
        this.fos = fos;
    }

    public int getnCitation() {
        return nCitation;
    }

    public void setnCitation(int nCitation) {
        this.nCitation = nCitation;
    }

    public void setAuthors(List<Authors> authors) {
        this.authors = authors;
    }

    public List<Authors> getAuthors() {
        return authors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Venue> getVenue() {
        return venue;
    }

    public void setVenue(List<Venue> venue) {
        this.venue = venue;
    }

    public int getPageEnd() {
        return pageEnd;
    }

    public int getPageStart() {
        return pageStart;
    }

    public void setPageEnd(int pageEnd) {
        this.pageEnd = pageEnd;
    }

    public void setPageStart(int pageStart) {
        this.pageStart = pageStart;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public String getDoi() {
        return doi;
    }

    public String getIssue() {
        return issue;
    }

    public String getVolume() {
        return Volume;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public void setVolume(String volume) {
        Volume = volume;
    }
}
