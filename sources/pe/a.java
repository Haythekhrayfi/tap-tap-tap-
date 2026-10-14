package pe;

import ch.qos.logback.core.CoreConstants;
import fd.z;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import ne.q;
import oe.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f34638h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b.e f34639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Locale f34640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f34641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f34642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<re.i> f34643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final oe.h f34644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f34645g;

    static {
        b bVar = new b();
        re.a aVar = re.a.YEAR;
        j jVar = j.EXCEEDS_PAD;
        b bVarI = bVar.i(aVar, 4, 10, jVar);
        bVarI.c(CoreConstants.DASH_CHAR);
        re.a aVar2 = re.a.MONTH_OF_YEAR;
        bVarI.h(aVar2, 2);
        bVarI.c(CoreConstants.DASH_CHAR);
        re.a aVar3 = re.a.DAY_OF_MONTH;
        bVarI.h(aVar3, 2);
        i iVar = i.STRICT;
        a aVarN = bVarI.n(iVar);
        m mVar = m.f34269e;
        a aVarB = aVarN.b(mVar);
        b bVar2 = new b();
        b.k kVar = b.k.INSENSITIVE;
        bVar2.b(kVar);
        bVar2.a(aVarB);
        b.j jVar2 = b.j.f34669f;
        bVar2.b(jVar2);
        bVar2.n(iVar).b(mVar);
        b bVar3 = new b();
        bVar3.b(kVar);
        bVar3.a(aVarB);
        bVar3.k();
        bVar3.b(jVar2);
        bVar3.n(iVar).b(mVar);
        b bVar4 = new b();
        re.a aVar4 = re.a.HOUR_OF_DAY;
        bVar4.h(aVar4, 2);
        bVar4.c(CoreConstants.COLON_CHAR);
        re.a aVar5 = re.a.MINUTE_OF_HOUR;
        bVar4.h(aVar5, 2);
        bVar4.k();
        bVar4.c(CoreConstants.COLON_CHAR);
        re.a aVar6 = re.a.SECOND_OF_MINUTE;
        bVar4.h(aVar6, 2);
        bVar4.k();
        bVar4.b(new b.g(re.a.NANO_OF_SECOND, 0, 9, true));
        a aVarN2 = bVar4.n(iVar);
        b bVar5 = new b();
        bVar5.b(kVar);
        bVar5.a(aVarN2);
        bVar5.b(jVar2);
        bVar5.n(iVar);
        b bVar6 = new b();
        bVar6.b(kVar);
        bVar6.a(aVarN2);
        bVar6.k();
        bVar6.b(jVar2);
        bVar6.n(iVar);
        b bVar7 = new b();
        bVar7.b(kVar);
        bVar7.a(aVarB);
        bVar7.c('T');
        bVar7.a(aVarN2);
        a aVarB2 = bVar7.n(iVar).b(mVar);
        b bVar8 = new b();
        bVar8.b(kVar);
        bVar8.a(aVarB2);
        bVar8.b(jVar2);
        a aVarB3 = bVar8.n(iVar).b(mVar);
        b bVar9 = new b();
        bVar9.a(aVarB3);
        bVar9.k();
        bVar9.c('[');
        b.k kVar2 = b.k.SENSITIVE;
        bVar9.b(kVar2);
        re.k<q> kVar3 = b.f34646f;
        bVar9.b(new b.n(kVar3, "ZoneRegionId()"));
        bVar9.c(']');
        bVar9.n(iVar).b(mVar);
        b bVar10 = new b();
        bVar10.a(aVarB2);
        bVar10.k();
        bVar10.b(jVar2);
        bVar10.k();
        bVar10.c('[');
        bVar10.b(kVar2);
        bVar10.b(new b.n(kVar3, "ZoneRegionId()"));
        bVar10.c(']');
        bVar10.n(iVar).b(mVar);
        b bVar11 = new b();
        bVar11.b(kVar);
        b bVarI2 = bVar11.i(aVar, 4, 10, jVar);
        bVarI2.c(CoreConstants.DASH_CHAR);
        bVarI2.h(re.a.DAY_OF_YEAR, 3);
        bVarI2.k();
        bVarI2.b(jVar2);
        bVarI2.n(iVar).b(mVar);
        b bVar12 = new b();
        bVar12.b(kVar);
        b bVarI3 = bVar12.i(re.c.f35367c, 4, 10, jVar);
        bVarI3.d("-W");
        bVarI3.h(re.c.f35366b, 2);
        bVarI3.c(CoreConstants.DASH_CHAR);
        re.a aVar7 = re.a.DAY_OF_WEEK;
        bVarI3.h(aVar7, 1);
        bVarI3.k();
        bVarI3.b(jVar2);
        bVarI3.n(iVar).b(mVar);
        b bVar13 = new b();
        bVar13.b(kVar);
        bVar13.b(new b.h(-2));
        f34638h = bVar13.n(iVar);
        b bVar14 = new b();
        bVar14.b(kVar);
        bVar14.h(aVar, 4);
        bVar14.h(aVar2, 2);
        bVar14.h(aVar3, 2);
        bVar14.k();
        bVar14.b(new b.j("Z", "+HHMMss"));
        bVar14.n(iVar).b(mVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        b bVar15 = new b();
        bVar15.b(kVar);
        bVar15.b(b.k.LENIENT);
        bVar15.k();
        bVar15.e(aVar7, map);
        bVar15.d(", ");
        bVar15.j();
        b bVarI4 = bVar15.i(aVar3, 1, 2, j.NOT_NEGATIVE);
        bVarI4.c(' ');
        bVarI4.e(aVar2, map2);
        bVarI4.c(' ');
        bVarI4.h(aVar, 4);
        bVarI4.c(' ');
        bVarI4.h(aVar4, 2);
        bVarI4.c(CoreConstants.COLON_CHAR);
        bVarI4.h(aVar5, 2);
        bVarI4.k();
        bVarI4.c(CoreConstants.COLON_CHAR);
        bVarI4.h(aVar6, 2);
        bVarI4.j();
        bVarI4.c(' ');
        bVarI4.b(new b.j("GMT", "+HHMM"));
        bVarI4.n(i.SMART).b(mVar);
    }

    public a(b.e eVar, Locale locale, h hVar, i iVar, Set<re.i> set, oe.h hVar2, q qVar) {
        z.B(eVar, "printerParser");
        this.f34639a = eVar;
        z.B(locale, "locale");
        this.f34640b = locale;
        z.B(hVar, "decimalStyle");
        this.f34641c = hVar;
        z.B(iVar, "resolverStyle");
        this.f34642d = iVar;
        this.f34643e = set;
        this.f34644f = hVar2;
        this.f34645g = qVar;
    }

    public String a(re.e eVar) {
        StringBuilder sb2 = new StringBuilder(32);
        try {
            this.f34639a.print(new f(eVar, this), sb2);
            return sb2.toString();
        } catch (IOException e10) {
            throw new ne.a(e10.getMessage(), e10);
        }
    }

    public a b(oe.h hVar) {
        return z.q(this.f34644f, hVar) ? this : new a(this.f34639a, this.f34640b, this.f34641c, this.f34642d, this.f34643e, hVar, this.f34645g);
    }

    public String toString() {
        String string = this.f34639a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
