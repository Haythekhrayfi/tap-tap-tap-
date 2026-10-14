package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1834nf implements InterfaceC1809mf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final We f16949a;

    public C1834nf() {
        this(new We());
    }

    public C1834nf(We we2) {
        this.f16949a = we2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1809mf
    public byte[] a(Xe xe2, C1736jh c1736jh) {
        if (!c1736jh.U() && !TextUtils.isEmpty(xe2.f15485b)) {
            try {
                JSONObject jSONObject = new JSONObject(xe2.f15485b);
                jSONObject.remove("preloadInfo");
                xe2.f15485b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f16949a.a(xe2, c1736jh);
    }
}
