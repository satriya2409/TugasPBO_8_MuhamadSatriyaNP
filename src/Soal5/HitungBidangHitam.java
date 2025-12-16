package Soal5;


public class HitungBidangHitam {

    public static double hitungLuasHitam(PersegiPanjang luar, PersegiPanjang dalam) {
        double luasLuar = luar.hitungLuas();
        double luasDalam = dalam.hitungLuas();
        return luasLuar - luasDalam;
    }
}

