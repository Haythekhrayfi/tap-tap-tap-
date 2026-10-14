package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Dl implements Rk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13845a;

    public Dl(int i10) {
        this.f13845a = i10;
    }

    @Override // com.yandex.metrica.impl.ob.Rk
    public void a(El el) {
        if (el.f13927h.length() > this.f13845a) {
            int length = el.f13927h.length();
            int i10 = this.f13845a;
            int i11 = length - i10;
            String strSubstring = el.f13927h.substring(0, i10);
            el.f13927h = strSubstring;
            el.f13929j = Integer.valueOf(strSubstring.length() + i11);
        }
    }
}
