package com.yandex.metrica.impl.ob;

import java.util.Currency;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class B3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ca.b f13709a;

    public B3(ca.b bVar) {
        this.f13709a = bVar;
    }

    private Zf.b.C0179b a(com.yandex.metrica.billing_interface.b bVar) {
        Zf.b.C0179b c0179b = new Zf.b.C0179b();
        c0179b.f15676b = bVar.f13516a;
        int iOrdinal = bVar.f13517b.ordinal();
        int i10 = 4;
        if (iOrdinal == 1) {
            i10 = 1;
        } else if (iOrdinal == 2) {
            i10 = 2;
        } else if (iOrdinal == 3) {
            i10 = 3;
        } else if (iOrdinal != 4) {
            i10 = 0;
        }
        c0179b.f15677c = i10;
        return c0179b;
    }

    public byte[] a() {
        String currencyCode;
        ca.b bVar = this.f13709a;
        Zf zf = new Zf();
        zf.f15655b = bVar.f3658c;
        zf.f15661h = bVar.f3659d;
        try {
            currencyCode = Currency.getInstance(bVar.f3660e).getCurrencyCode();
        } catch (Throwable unused) {
            currencyCode = "";
        }
        zf.f15657d = currencyCode.getBytes();
        zf.f15658e = bVar.f3657b.getBytes();
        Zf.a aVar = new Zf.a();
        aVar.f15667b = bVar.f3669n.getBytes();
        aVar.f15668c = bVar.f3665j.getBytes();
        zf.f15660g = aVar;
        zf.f15662i = true;
        zf.f15663j = 1;
        zf.f15664k = bVar.f3656a.ordinal() == 1 ? 2 : 1;
        Zf.c cVar = new Zf.c();
        cVar.f15678b = bVar.f3666k.getBytes();
        cVar.f15679c = TimeUnit.MILLISECONDS.toSeconds(bVar.f3667l);
        zf.f15665l = cVar;
        if (bVar.f3656a == com.yandex.metrica.billing_interface.c.SUBS) {
            Zf.b bVar2 = new Zf.b();
            bVar2.f15669b = bVar.f3668m;
            com.yandex.metrica.billing_interface.b bVar3 = bVar.f3664i;
            if (bVar3 != null) {
                bVar2.f15670c = a(bVar3);
            }
            Zf.b.a aVar2 = new Zf.b.a();
            aVar2.f15672b = bVar.f3661f;
            com.yandex.metrica.billing_interface.b bVar4 = bVar.f3662g;
            if (bVar4 != null) {
                aVar2.f15673c = a(bVar4);
            }
            aVar2.f15674d = bVar.f3663h;
            bVar2.f15671d = aVar2;
            zf.f15666m = bVar2;
        }
        return AbstractC1594e.a(zf);
    }
}
