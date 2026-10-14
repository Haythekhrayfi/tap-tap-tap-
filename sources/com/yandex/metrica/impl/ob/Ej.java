package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class Ej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Cj f13923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1518an f13924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Gj f13925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Dj f13926d;

    public Ej(Cj cj, Dj dj, C1518an c1518an, Gj gj) {
        this.f13923a = cj;
        this.f13926d = dj;
        this.f13924b = c1518an;
        this.f13925c = gj;
    }

    public C1646g1 a() {
        String strA;
        try {
            this.f13924b.a();
            strA = this.f13925c.a();
            try {
                if (TextUtils.isEmpty(strA)) {
                    strA = this.f13923a.a();
                    if (!TextUtils.isEmpty(strA) || this.f13926d.a()) {
                        strA = this.f13925c.a(strA);
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            strA = null;
        }
        this.f13924b.b();
        return strA == null ? new C1646g1(null, EnumC1596e1.UNKNOWN, "Uuid must be obtained via async API YandexMetricaInternal#requestStartupIdentifiers(@NonNull Context context, @NonNull IIdentifierCallback callback,@NonNull String... identifiers)") : new C1646g1(strA, EnumC1596e1.OK, null);
    }
}
