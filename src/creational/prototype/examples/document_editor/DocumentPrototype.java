package creational.prototype.examples.document_editor;

import java.util.ArrayList;
import java.util.List;

public class DocumentPrototype {
    private String title;
    private String name;
    private String content;
    private List<String> authors;

    public DocumentPrototype(String title, String name, String content, List<String> authors) {
        this.title = title;
        this.name = name;
        this.content = content;
        this.authors = authors;
    }

    public DocumentPrototype(DocumentPrototype original) {
        this.title = original.title;
        this.name = original.name;
        this.content = original.content;
        this.authors = new ArrayList<>(original.authors);
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

    public static void main(String[] args) {
        DocumentPrototype prototype = new DocumentPrototype("Title", "Name", "Content", List.of("Author"));
        System.out.println(prototype.hashCode());

        DocumentPrototype clone = new DocumentPrototype(prototype);
        System.out.println(clone.hashCode());
    }
}
