package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.PluginErrorDetails;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.y7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2105y7 implements InterfaceC1605ea<String, byte[]> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public String a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] b(String str) {
        if (fd.j0.d(PluginErrorDetails.Platform.NATIVE, str)) {
            str = "JVM";
        }
        Charset charset = ed.c.f29139b;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = str.getBytes(charset);
        fd.j0.h(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
