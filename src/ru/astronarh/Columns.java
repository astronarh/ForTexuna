package ru.astronarh;

import java.util.List;

public class Columns {
    private List<Column> column;

    public List<Column> getColumn() {
        return column;
    }

    public void setColumn(List<Column> column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "Columns{" +
                "column=" + column +
                '}';
    }
}
