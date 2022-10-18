package com.example.baikiemtra_giuaky;

import android.widget.TextView;

public class Item {

    private String tenChitieu, mota;
    private int hinh;

    public Item(String tenChitieu, String mota, int hinh) {
        this.tenChitieu = tenChitieu;
        this.mota = mota;
        this.hinh = hinh;
    }

    public String getTenChitieu() {
        return tenChitieu;
    }

    public void setTenChitieu(String tenChitieu) {
        this.tenChitieu = tenChitieu;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
