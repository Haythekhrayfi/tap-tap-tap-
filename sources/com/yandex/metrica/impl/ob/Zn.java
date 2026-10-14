package com.yandex.metrica.impl.ob;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class Zn implements Comparator<Vj> {
    @Override // java.util.Comparator
    public int compare(Vj vj, Vj vj2) {
        Vj vj3 = vj;
        Vj vj4 = vj2;
        if (vj3 == vj4) {
            return 0;
        }
        if (!((vj4 == null) ^ (vj3 == null)) && vj3.q() == vj4.q() && vj3.c() == vj4.c() && (vj3.k() == null ? vj4.k() == null : vj3.k().equals(vj4.k())) && (vj3.l() == null ? vj4.l() == null : vj3.l().equals(vj4.l())) && (vj3.e() == null ? vj4.e() == null : vj3.e().equals(vj4.e())) && (vj3.b() == null ? vj4.b() == null : vj3.b().equals(vj4.b())) && (vj3.n() == null ? vj4.n() == null : vj3.n().equals(vj4.n())) && (vj3.m() == null ? vj4.m() == null : vj3.m().equals(vj4.m()))) {
            if (vj3.o() != null) {
                if (vj3.o().equals(vj4.o())) {
                    return 0;
                }
            } else if (vj4.o() == null) {
                return 0;
            }
        }
        return 10;
    }
}
