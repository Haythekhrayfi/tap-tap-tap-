package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Nn extends Cn<String> {
    public Nn(int i10, String str) {
        this(i10, str, Im.g());
    }

    public Nn(int i10, String str, Im im) {
        super(i10, str, im);
    }

    @Override // com.yandex.metrica.impl.ob.Pn
    public String a(String str) {
        if (str == null || str.length() <= super.b()) {
            return str;
        }
        String strSubstring = str.substring(0, super.b());
        if (this.f13781c.c()) {
            this.f13781c.c("\"%s\" %s size exceeded limit of %d characters", super.a(), str, Integer.valueOf(super.b()));
        }
        return strSubstring;
    }
}
