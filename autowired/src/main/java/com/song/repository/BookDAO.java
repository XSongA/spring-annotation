package com.song.repository;

import org.springframework.stereotype.Repository;

// 名字默认是类名首字母小写
@Repository
public class BookDAO {
    private String label = "1";

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "BookDAO{" +
                "label='" + label + '\'' +
                '}';
    }
}
