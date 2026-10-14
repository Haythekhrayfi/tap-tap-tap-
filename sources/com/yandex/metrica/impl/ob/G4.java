package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class G4 {
    public F4 a(C4 c10) {
        int iOrdinal = c10.e().ordinal();
        if (iOrdinal == 0) {
            return new K4();
        }
        if (iOrdinal == 1) {
            return new O4();
        }
        if (iOrdinal == 2) {
            return new B4();
        }
        if (iOrdinal == 3) {
            return new M4();
        }
        if (iOrdinal != 4) {
            return iOrdinal != 5 ? new K4() : new S4();
        }
        return new R4();
    }
}
