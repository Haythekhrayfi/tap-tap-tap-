package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Jn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Im f14327b;

    public Jn(int i10, String str, Im im) {
        this.f14326a = str;
        this.f14327b = im;
    }

    public void a(String str) {
        if (this.f14327b.c()) {
            this.f14327b.c("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", this.f14326a, 4500, str);
        }
    }

    public boolean a(Gm gm, String str, String str2) {
        int iA = gm.a();
        if (str2 != null) {
            iA += str2.length();
        }
        if (gm.containsKey(str)) {
            String str3 = gm.get(str);
            if (str3 != null) {
                iA -= str3.length();
            }
        } else {
            iA += str.length();
        }
        return iA > 4500;
    }
}
