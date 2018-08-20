package ru.astronarh;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Settings {
    private Page page;
    private Columns columns;

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Columns getColumns() {
        return columns;
    }

    public void setColumns(Columns columns) {
        this.columns = columns;
    }

    @Override
    public String toString() {
        return "Settings{" +
                "page=" + page +
                ", columns=" + columns +
                '}';
    }
}
