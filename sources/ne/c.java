package ne;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum c implements re.e, re.f {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static final re.k<c> FROM = new re.k<c>() { // from class: ne.c.a
        @Override // re.k
        public c a(re.e eVar) {
            return c.from(eVar);
        }
    };
    private static final c[] ENUMS = values();

    public static c from(re.e eVar) {
        if (eVar instanceof c) {
            return (c) eVar;
        }
        try {
            return of(eVar.get(re.a.DAY_OF_WEEK));
        } catch (ne.a e10) {
            throw new ne.a("Unable to obtain DayOfWeek from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName(), e10);
        }
    }

    public static c of(int i10) {
        if (i10 < 1 || i10 > 7) {
            throw new ne.a(android.support.v4.media.a.a("Invalid value for DayOfWeek: ", i10));
        }
        return ENUMS[i10 - 1];
    }

    @Override // re.f
    public re.d adjustInto(re.d dVar) {
        return dVar.p(re.a.DAY_OF_WEEK, getValue());
    }

    @Override // re.e
    public int get(re.i iVar) {
        return iVar == re.a.DAY_OF_WEEK ? getValue() : range(iVar).a(getLong(iVar), iVar);
    }

    public String getDisplayName(pe.l lVar, Locale locale) {
        pe.b bVar = new pe.b();
        bVar.f(re.a.DAY_OF_WEEK, lVar);
        return bVar.m(locale).a(this);
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        if (iVar == re.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (iVar instanceof re.a) {
            throw new re.m(b.a("Unsupported field: ", iVar));
        }
        return iVar.getFrom(this);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // re.e
    public boolean isSupported(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar == re.a.DAY_OF_WEEK;
        }
        return iVar != null && iVar.isSupportedBy(this);
    }

    public c minus(long j10) {
        return plus(-(j10 % 7));
    }

    public c plus(long j10) {
        return ENUMS[((((int) (j10 % 7)) + 7) + ordinal()) % 7];
    }

    @Override // re.e
    public <R> R query(re.k<R> kVar) {
        if (kVar == re.j.f35375c) {
            return (R) re.b.DAYS;
        }
        if (kVar == re.j.f35378f || kVar == re.j.f35379g || kVar == re.j.f35374b || kVar == re.j.f35376d || kVar == re.j.f35373a || kVar == re.j.f35377e) {
            return null;
        }
        return kVar.a(this);
    }

    @Override // re.e
    public re.n range(re.i iVar) {
        if (iVar == re.a.DAY_OF_WEEK) {
            return iVar.range();
        }
        if (iVar instanceof re.a) {
            throw new re.m(b.a("Unsupported field: ", iVar));
        }
        return iVar.rangeRefinedBy(this);
    }
}
