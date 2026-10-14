package ne;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum i implements re.e, re.f {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static final re.k<i> FROM = new re.k<i>() { // from class: ne.i.a
        @Override // re.k
        public i a(re.e eVar) {
            return i.from(eVar);
        }
    };
    private static final i[] ENUMS = values();

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33800a;

        static {
            int[] iArr = new int[i.values().length];
            f33800a = iArr;
            try {
                iArr[i.FEBRUARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33800a[i.APRIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33800a[i.JUNE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33800a[i.SEPTEMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33800a[i.NOVEMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33800a[i.JANUARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33800a[i.MARCH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33800a[i.MAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33800a[i.JULY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f33800a[i.AUGUST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f33800a[i.OCTOBER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f33800a[i.DECEMBER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static i from(re.e eVar) {
        if (eVar instanceof i) {
            return (i) eVar;
        }
        try {
            if (!oe.m.f34269e.equals(oe.h.g(eVar))) {
                eVar = f.r(eVar);
            }
            return of(eVar.get(re.a.MONTH_OF_YEAR));
        } catch (ne.a e10) {
            throw new ne.a("Unable to obtain Month from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName(), e10);
        }
    }

    public static i of(int i10) {
        if (i10 < 1 || i10 > 12) {
            throw new ne.a(android.support.v4.media.a.a("Invalid value for MonthOfYear: ", i10));
        }
        return ENUMS[i10 - 1];
    }

    @Override // re.f
    public re.d adjustInto(re.d dVar) {
        if (oe.h.g(dVar).equals(oe.m.f34269e)) {
            return dVar.p(re.a.MONTH_OF_YEAR, getValue());
        }
        throw new ne.a("Adjustment only supported on ISO date-time");
    }

    public int firstDayOfYear(boolean z10) {
        switch (b.f33800a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z10 ? 1 : 0) + 91;
            case 3:
                return (z10 ? 1 : 0) + SyslogConstants.LOG_LOCAL3;
            case 4:
                return (z10 ? 1 : 0) + 244;
            case 5:
                return (z10 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z10 ? 1 : 0) + 60;
            case 8:
                return (z10 ? 1 : 0) + 121;
            case 9:
                return (z10 ? 1 : 0) + 182;
            case 10:
                return (z10 ? 1 : 0) + 213;
            case 11:
                return (z10 ? 1 : 0) + 274;
            default:
                return (z10 ? 1 : 0) + 335;
        }
    }

    public i firstMonthOfQuarter() {
        return ENUMS[(ordinal() / 3) * 3];
    }

    @Override // re.e
    public int get(re.i iVar) {
        return iVar == re.a.MONTH_OF_YEAR ? getValue() : range(iVar).a(getLong(iVar), iVar);
    }

    public String getDisplayName(pe.l lVar, Locale locale) {
        pe.b bVar = new pe.b();
        bVar.f(re.a.MONTH_OF_YEAR, lVar);
        return bVar.m(locale).a(this);
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        if (iVar == re.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (iVar instanceof re.a) {
            throw new re.m(ne.b.a("Unsupported field: ", iVar));
        }
        return iVar.getFrom(this);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // re.e
    public boolean isSupported(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar == re.a.MONTH_OF_YEAR;
        }
        return iVar != null && iVar.isSupportedBy(this);
    }

    public int length(boolean z10) {
        int i10 = b.f33800a[ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31;
        }
        return z10 ? 29 : 28;
    }

    public int maxLength() {
        int i10 = b.f33800a[ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31;
        }
        return 29;
    }

    public int minLength() {
        int i10 = b.f33800a[ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31;
        }
        return 28;
    }

    public i minus(long j10) {
        return plus(-(j10 % 12));
    }

    public i plus(long j10) {
        return ENUMS[((((int) (j10 % 12)) + 12) + ordinal()) % 12];
    }

    @Override // re.e
    public <R> R query(re.k<R> kVar) {
        if (kVar == re.j.f35374b) {
            return (R) oe.m.f34269e;
        }
        if (kVar == re.j.f35375c) {
            return (R) re.b.MONTHS;
        }
        if (kVar == re.j.f35378f || kVar == re.j.f35379g || kVar == re.j.f35376d || kVar == re.j.f35373a || kVar == re.j.f35377e) {
            return null;
        }
        return kVar.a(this);
    }

    @Override // re.e
    public re.n range(re.i iVar) {
        if (iVar == re.a.MONTH_OF_YEAR) {
            return iVar.range();
        }
        if (iVar instanceof re.a) {
            throw new re.m(ne.b.a("Unsupported field: ", iVar));
        }
        return iVar.rangeRefinedBy(this);
    }
}
