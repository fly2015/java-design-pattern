package creational.prototype.examples.document_editor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DocumentCloneable implements Cloneable {
    private String title;
    private String name;
    private String content;
    private List<String> authors;

    public DocumentCloneable(String title, String name, String content, List<String> authors) {
        this.title = title;
        this.name = name;
        this.content = content;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", author='" + authors + '\'' +
                '}';
    }

    @Override
    public DocumentCloneable clone() {
        try {
            DocumentCloneable cloned = (DocumentCloneable) super.clone();
            // Deep clone the mutable list
            cloned.authors = new ArrayList<>(this.authors);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        DocumentCloneable oriDocument = new DocumentCloneable("Title", "Name", "Content", Arrays.asList("Author"));
        System.out.println(oriDocument.hashCode());

        DocumentCloneable cloneDocument = oriDocument.clone();
        System.out.println(cloneDocument.hashCode());
    }
}
