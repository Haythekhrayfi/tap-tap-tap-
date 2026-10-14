package com.yandex.metrica.impl.ob;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2130z7 implements InterfaceC1605ea<Map<String, ? extends String>, Kf[]> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public Map<String, ? extends String> a(Kf[] kfArr) {
        throw new UnsupportedOperationException();
    }

    public Kf[] a(Map<String, String> map) {
        int size = map.size();
        Kf[] kfArr = new Kf[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            kfArr[i11] = new Kf();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Kf kf = kfArr[i10];
            String key = entry.getKey();
            Charset charset = ed.c.f29139b;
            Objects.requireNonNull(key, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = key.getBytes(charset);
            fd.j0.h(bytes, "(this as java.lang.String).getBytes(charset)");
            kf.f14354b = bytes;
            Kf kf2 = kfArr[i10];
            String value = entry.getValue();
            Objects.requireNonNull(value, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes2 = value.getBytes(charset);
            fd.j0.h(bytes2, "(this as java.lang.String).getBytes(charset)");
            kf2.f14355c = bytes2;
            i10++;
        }
        return kfArr;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public /* bridge */ /* synthetic */ Kf[] b(Map<String, ? extends String> map) {
        return a((Map<String, String>) map);
    }
}
