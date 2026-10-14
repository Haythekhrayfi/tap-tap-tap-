package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Un extends Rn<String, Fn> {
    public Un(int i10) {
        super(i10);
    }

    @Override // com.yandex.metrica.impl.ob.Rn
    public Qn<String, Fn> a(String str) {
        int length = 0;
        if (str != null && str.length() > a()) {
            String strSubstring = str.substring(0, a());
            int length2 = O2.c(str).length;
            int length3 = O2.c(strSubstring).length;
            length = str.getBytes().length - strSubstring.getBytes().length;
            str = strSubstring;
        }
        return new Qn<>(str, new En(length));
    }
}
