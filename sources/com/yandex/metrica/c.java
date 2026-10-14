package com.yandex.metrica;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public enum c {
    PHONE("phone"),
    TABLET("tablet"),
    TV("tv");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13532a;

    c(String str) {
        this.f13532a = str;
    }

    public static c a(String str) {
        c[] cVarArrValues = values();
        for (int i10 = 0; i10 < 3; i10++) {
            c cVar = cVarArrValues[i10];
            if (cVar.f13532a.equals(str)) {
                return cVar;
            }
        }
        return null;
    }

    public String a() {
        return this.f13532a;
    }
}
