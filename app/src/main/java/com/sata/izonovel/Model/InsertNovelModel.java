package com.sata.izonovel.Model;

public class InsertNovelModel {
    private String dataSource;
    private String database;
    private String collection;
    private Document document;

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public static class Document {
        private String Judul;
        private String Pengarang;
        private String Penerbit;

        public String getJudul() {
            return Judul;
        }

        public void setJudul(String judul) {
            this.Judul = judul;
        }

        public String getPengarang() {
            return Pengarang;
        }

        public void setPengarang(String pengarang) {
            this.Pengarang = pengarang;
        }

        public String getPenerbit() {
            return Penerbit;
        }

        public void setPenerbit(String penerbit) {
            this.Penerbit = penerbit;
        }

        public String getTahunTerbit() {
            return TahunTerbit;
        }

        public void setTahunTerbit(String tahunTerbit) {
            this.TahunTerbit = tahunTerbit;
        }

        public String getGenre() {
            return Genre;
        }

        public void setGenre(String genre) {
            this.Genre = genre;
        }

        public String getSinopsis() {
            return Sinopsis;
        }

        public void setSinopsis(String sinopsis) {
            this.Sinopsis = sinopsis;
        }

        private String TahunTerbit;
        private String Genre;
        private String Sinopsis;
    }
}