package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class cn0<T> implements an0<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f19562j = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f19563a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final kx0<T> f19568f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final du f19564b = new du();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ae0 f19565c = new ae0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final xx0 f19566d = new xx0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dl f19567e = new dl();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final lz f19569g = new lz();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f90 f19570h = new f90();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final y8 f19571i = new y8();

    public class a implements qy.a<Long> {
        @Override // com.yandex.mobile.ads.impl.qy.a
        public final Long a(String str) {
            long j10 = 0L;
            int i10 = t6.f25286b;
            if (str == null) {
                return j10;
            }
            try {
                return Long.valueOf(str);
            } catch (NumberFormatException unused) {
                return j10;
            }
        }
    }

    public class b implements qy.a<Integer> {
        @Override // com.yandex.mobile.ads.impl.qy.a
        public final Integer a(String str) {
            int i10;
            int i11 = t6.f25286b;
            try {
                i10 = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                i10 = 0;
            }
            return Integer.valueOf(Math.min(i10, AdResponse.M.intValue()));
        }
    }

    public cn0(k2 k2Var, kx0 kx0Var) {
        this.f19563a = k2Var;
        this.f19568f = kx0Var;
    }

    @Override // com.yandex.mobile.ads.impl.an0
    public final AdResponse<T> a(fx0 fx0Var, Map<String, String> map, l6 l6Var) {
        Long lValueOf;
        AdResponse.b bVar = new AdResponse.b();
        bVar.e(this.f19563a.c());
        bVar.a(l6Var);
        int iB = qy.b(map, 2);
        int iB2 = qy.b(map, 3);
        bVar.e(iB);
        bVar.b(iB2);
        String str = map.get(t00.b(40));
        String str2 = map.get(t00.b(41));
        bVar.d(str);
        bVar.h(str2);
        String str3 = map.get(t00.b(46));
        if (str3 != null) {
            Objects.requireNonNull(this.f19571i);
            bVar.a(y8.a(str3));
        }
        SizeInfo sizeInfoN = this.f19563a.n();
        boolean z10 = false;
        bVar.g(sizeInfoN != null ? sizeInfoN.d() : 0);
        bVar.c(qy.e(map, 6));
        bVar.f(qy.e(map, 14));
        bVar.a(qy.a(map, 16, new a()));
        bVar.d(qy.a(map, 37, new b()));
        bVar.e(qy.e(map, 7));
        Integer numC = qy.c(map, 8);
        FalseClick falseClick = null;
        bVar.a(numC != null ? Long.valueOf(((long) numC.intValue()) * f19562j) : null);
        Integer numC2 = qy.c(map, 26);
        bVar.b(numC2 != null ? Long.valueOf(((long) numC2.intValue()) * f19562j) : null);
        bVar.f(map.get(t00.b(12)));
        Objects.requireNonNull(this.f19570h);
        String str4 = map.get(t00.b(13));
        for (Locale locale : Locale.getAvailableLocales()) {
            if (locale.getLanguage().equals(str4)) {
                z10 = true;
                break;
            }
        }
        bVar.a(z10 ? new Locale(str4) : null);
        bVar.b(qy.e(map, 11));
        bVar.f(qy.b(map, 22));
        bVar.c(qy.b(map, 23));
        bVar.d(qy.b(map, 24));
        bVar.a(qy.b(map, 29));
        bVar.i(map.get(t00.b(21)));
        bVar.d(qy.a(map, 10));
        bVar.g(map.get(t00.b(49)));
        bVar.b(map.get(t00.b(30)));
        Objects.requireNonNull(this.f19567e);
        bVar.a(dl.a(map));
        bVar.a(this.f19566d.a(fx0Var));
        Objects.requireNonNull(this.f19564b);
        Map<String, String> mapB = fx0Var.b();
        String strD = qy.d(mapB, 19);
        String str5 = mapB.get(t00.b(20));
        int i10 = t6.f25286b;
        if (str5 != null) {
            try {
                lValueOf = Long.valueOf(str5);
            } catch (NumberFormatException unused) {
                lValueOf = null;
            }
        } else {
            lValueOf = null;
        }
        if (strD != null && lValueOf != null) {
            falseClick = new FalseClick(strD, lValueOf.longValue());
        }
        bVar.a(falseClick);
        Objects.requireNonNull(this.f19569g);
        bVar.a(lz.a(map));
        bVar.e(qy.a(map, 31));
        bVar.c(qy.a(map, 38));
        boolean zA = qy.a(map, 15);
        bVar.b(zA);
        if (zA) {
            bVar.a(this.f19565c.a(fx0Var));
        } else {
            bVar.a(this.f19568f.a(fx0Var));
        }
        bVar.c(map.get(t00.b(42)));
        bVar.a(map.get(t00.b(5)));
        bVar.a(qy.a(map, 47));
        return bVar.a();
    }
}
