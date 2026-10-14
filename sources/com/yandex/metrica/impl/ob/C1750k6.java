package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1750k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1701i6 f16566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1725j6 f16567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2106y8 f16568c;

    public C1750k6(Context context, C1549c4 c1549c4) {
        this(new C1725j6(), new C1701i6(), Qa.a(context).a(c1549c4), "event_hashes");
    }

    public C1750k6(C1725j6 c1725j6, C1701i6 c1701i6, InterfaceC2106y8 interfaceC2106y8, String str) {
        this.f16567b = c1725j6;
        this.f16566a = c1701i6;
        this.f16568c = interfaceC2106y8;
    }

    public C1676h6 a() {
        try {
            byte[] bArrA = this.f16568c.a("event_hashes");
            if (U2.a(bArrA)) {
                C1701i6 c1701i6 = this.f16566a;
                Objects.requireNonNull(this.f16567b);
                return c1701i6.a(new C1611eg());
            }
            C1701i6 c1701i7 = this.f16566a;
            Objects.requireNonNull(this.f16567b);
            return c1701i7.a((C1611eg) AbstractC1594e.a(new C1611eg(), bArrA));
        } catch (Throwable unused) {
            C1701i6 c1701i8 = this.f16566a;
            Objects.requireNonNull(this.f16567b);
            return c1701i8.a(new C1611eg());
        }
    }

    public void a(C1676h6 c1676h6) {
        InterfaceC2106y8 interfaceC2106y8 = this.f16568c;
        C1725j6 c1725j6 = this.f16567b;
        C1611eg c1611egB = this.f16566a.b(c1676h6);
        Objects.requireNonNull(c1725j6);
        interfaceC2106y8.a("event_hashes", AbstractC1594e.a(c1611egB));
    }
}
