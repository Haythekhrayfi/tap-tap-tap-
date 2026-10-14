package com.yandex.metrica.impl.ob;

import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1968t0 implements S1<C2018v0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2018v0 f17417a;

    public C1968t0() {
        this(new C2018v0());
    }

    public C1968t0(C2018v0 c2018v0) {
        this.f17417a = c2018v0;
    }

    @Override // com.yandex.metrica.impl.ob.S1
    public C2018v0.a a(int i10, byte[] bArr, Map map) {
        if (200 == i10) {
            Objects.requireNonNull(this.f17417a);
            try {
                if (!U2.a(bArr)) {
                    return new C2018v0.a(new JSONObject(new String(bArr, "UTF-8")).optString("status"));
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
