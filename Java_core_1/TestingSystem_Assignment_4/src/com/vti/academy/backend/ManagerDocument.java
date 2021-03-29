package com.vti.academy.backend;

import java.util.ArrayList;
import java.util.List;

import com.vti.academy.entity.Newpaper;
import com.vti.academy.entity.Sach;
import com.vti.academy.entity.TaiLieu;
import com.vti.academy.entity.TapChi;

public class ManagerDocument {
	List<TaiLieu> documents;

    public ManagerDocument() {
        this.documents = new ArrayList<>();
    }

    public void addDocument(TaiLieu document) {
        this.documents.add(document);
    }

    public boolean deleteDocument(String id) {
        TaiLieu doc = this.documents.stream()
                .filter(document -> document.getId().equals(id))
                .findFirst().orElse(null);
        if (doc == null) {
            return false;
        }
        this.documents.remove(doc);
        return true;
    }

    public void showInfor() {
        this.documents.forEach(documents -> System.out.println(documents.toString()));
    }

    public void searchByBook() {
        this.documents.stream().filter(doc -> doc instanceof Sach).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByNewspaper() {
        this.documents.stream().filter(doc -> doc instanceof Newpaper).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByJournal() {
        this.documents.stream().filter(doc -> doc instanceof TapChi).forEach(doc -> System.out.println(doc.toString()));
    }


}
