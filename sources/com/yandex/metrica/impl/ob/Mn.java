package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public class Mn extends Cn<String> {
    public Mn(int i10, String str, Im im) {
        super(i10, str, im);
    }

    @Override // com.yandex.metrica.impl.ob.Pn
    public String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            if (bytes.length <= super.b()) {
                return str;
            }
            String str2 = new String(bytes, 0, super.b(), "UTF-8");
            try {
                if (this.f13781c.c()) {
                    this.f13781c.c("\"%s\" %s exceeded limit of %d bytes", super.a(), str, Integer.valueOf(super.b()));
                }
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
