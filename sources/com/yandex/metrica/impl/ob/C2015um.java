package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.um, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2015um {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1607ec f17586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1707ic f17587c;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2015um(Context context) {
        P0 p0I = P0.i();
        fd.j0.h(p0I, "GlobalServiceLocator.getInstance()");
        C1607ec c1607ecT = p0I.t();
        fd.j0.h(c1607ecT, "GlobalServiceLocator.get…ternalAdvertisingIdGetter");
        P0 p0I2 = P0.i();
        fd.j0.h(p0I2, "GlobalServiceLocator.getInstance()");
        C1707ic c1707icB = p0I2.b();
        fd.j0.h(c1707icB, "GlobalServiceLocator.getInstance().appSetIdGetter");
        this(context, c1607ecT, c1707icB);
    }

    public C2015um(Context context, C1607ec c1607ec, C1707ic c1707ic) {
        this.f17585a = context;
        this.f17586b = c1607ec;
        this.f17587c = c1707ic;
    }

    private final String b() {
        String string = UUID.randomUUID().toString();
        fd.j0.h(string, "UUID.randomUUID().toString()");
        String strQ = ed.q.q(string, "-", "", false, 4);
        Locale locale = Locale.US;
        fd.j0.h(locale, "Locale.US");
        String lowerCase = strQ.toLowerCase(locale);
        fd.j0.h(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    public final String a() {
        boolean z10;
        boolean z11;
        byte[] bArrDigest;
        C1657gc c1657gcA = this.f17586b.a(this.f17585a, new C1856oc(5, 500));
        fd.j0.h(c1657gcA, "advertisingIdGetter.getI…sedRetryStrategy(5, 500))");
        C1532bc c1532bcC = c1657gcA.c();
        fd.j0.h(c1532bcC, "advertisingIdGetter.getI…yStrategy(5, 500)).yandex");
        if (!c1532bcC.a()) {
            String strA = this.f17587c.a().a();
            if (strA != null) {
                if (!(strA.length() == 0)) {
                    try {
                        UUID.fromString(strA);
                        z10 = true;
                    } catch (Throwable unused) {
                        z10 = false;
                    }
                    z11 = z10 && (fd.j0.d(strA, "00000000-0000-0000-0000-000000000000") ^ true);
                }
                if (z11) {
                    return ed.q.q(strA, "-", "", false, 4);
                }
            }
            return b();
        }
        C1507ac c1507ac = c1532bcC.f15827a;
        fd.j0.f(c1507ac);
        String str = c1507ac.f15739b;
        fd.j0.f(str);
        byte[] bytes = str.getBytes(ed.c.f29139b);
        fd.j0.h(bytes, "(this as java.lang.String).getBytes(charset)");
        try {
            bArrDigest = MessageDigest.getInstance("MD5").digest(bytes);
        } catch (NoSuchAlgorithmException unused2) {
            bArrDigest = new byte[0];
        }
        String strA2 = O2.a(bArrDigest);
        fd.j0.h(strA2, "StringUtils.toHexString(…!.advId!!.toByteArray()))");
        return strA2;
    }
}
