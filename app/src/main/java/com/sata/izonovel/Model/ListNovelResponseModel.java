package com.sata.izonovel.Model;

public class ListNovelResponseModel {
    public class Documents {
        private String _id;
        private String genre;
        private String manusia;
        private String penerbit;
        private String pengarang;
        private String sinopsis;
        private String tahunterbit;
        private String judul;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getManusia() {
            return manusia;
        }

        public void setManusia(String manusia) {
            this.manusia = manusia;
        }

        public String getPenerbit() {
            return penerbit;
        }

        public void setPenerbit(String penerbit) {
            this.penerbit = penerbit;
        }

        public String getPengarang() {
            return pengarang;
        }

        public void setPengarang(String pengarang) {
            this.pengarang = pengarang;
        }

        public String getSinopsis() {
            return sinopsis;
        }

        public void setSinopsis(String sinopsis) {
            this.sinopsis = sinopsis;
        }

        public String getTahunterbit() {
            return tahunterbit;
        }

        public void setTahunterbit(String tahunterbit) {
            this.tahunterbit = tahunterbit;
        }

        public String getJudul() {
            return judul;
        }

        public void setJudul(String judul) {
            this.judul = judul;
        }
    }
}
