package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class K8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, I8> f14343a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jc.e f14344b = jc.f.b(new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f14345c;

    public static final class a extends vc.l implements uc.a<H8> {
        public a() {
            super(0);
        }

        @Override // uc.a
        public H8 invoke() {
            return new H8(K8.this.f14345c, new L0());
        }
    }

    public K8(Context context) {
        this.f14345c = context;
    }

    public final H8 a() {
        return (H8) this.f14344b.getValue();
    }

    public final synchronized I8 a(String str) {
        I8 i10;
        String strValueOf = String.valueOf(str);
        i10 = this.f14343a.get(strValueOf);
        if (i10 == null) {
            i10 = new I8(this.f14345c, strValueOf, new L0());
            this.f14343a.put(strValueOf, i10);
        }
        return i10;
    }
}
