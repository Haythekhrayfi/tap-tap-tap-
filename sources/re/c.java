package re;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import fd.z;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f35365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f35366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f35367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f35368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f35369e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35370a;

        static {
            int[] iArr = new int[EnumC0408c.values().length];
            f35370a = iArr;
            try {
                iArr[EnumC0408c.WEEK_BASED_YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35370a[EnumC0408c.QUARTER_YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b implements i {
        private static final /* synthetic */ b[] $VALUES;
        public static final b DAY_OF_QUARTER;
        private static final int[] QUARTER_DAYS;
        public static final b QUARTER_OF_YEAR;
        public static final b WEEK_BASED_YEAR;
        public static final b WEEK_OF_WEEK_BASED_YEAR;

        public final enum a extends b {
            public a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // re.c.b, re.i
            public <R extends re.d> R adjustInto(R r10, long j10) {
                long from = getFrom(r10);
                range().b(j10, this);
                re.a aVar = re.a.DAY_OF_YEAR;
                return (R) r10.p(aVar, (j10 - from) + r10.getLong(aVar));
            }

            @Override // re.c.b
            public l getBaseUnit() {
                return re.b.DAYS;
            }

            @Override // re.c.b, re.i
            public long getFrom(e eVar) {
                if (!eVar.isSupported(this)) {
                    throw new m("Unsupported field: DayOfQuarter");
                }
                return eVar.get(re.a.DAY_OF_YEAR) - b.QUARTER_DAYS[((eVar.get(re.a.MONTH_OF_YEAR) - 1) / 3) + (oe.m.f34269e.n(eVar.getLong(re.a.YEAR)) ? 4 : 0)];
            }

            @Override // re.c.b
            public l getRangeUnit() {
                return c.f35369e;
            }

            @Override // re.c.b, re.i
            public boolean isSupportedBy(e eVar) {
                return eVar.isSupported(re.a.DAY_OF_YEAR) && eVar.isSupported(re.a.MONTH_OF_YEAR) && eVar.isSupported(re.a.YEAR) && b.isIso(eVar);
            }

            @Override // re.c.b, re.i
            public n range() {
                return n.d(1L, 90L, 92L);
            }

            @Override // re.c.b, re.i
            public n rangeRefinedBy(e eVar) {
                if (!eVar.isSupported(this)) {
                    throw new m("Unsupported field: DayOfQuarter");
                }
                long j10 = eVar.getLong(b.QUARTER_OF_YEAR);
                if (j10 == 1) {
                    return oe.m.f34269e.n(eVar.getLong(re.a.YEAR)) ? n.c(1L, 91L) : n.c(1L, 90L);
                }
                if (j10 == 2) {
                    return n.c(1L, 91L);
                }
                return (j10 == 3 || j10 == 4) ? n.c(1L, 92L) : range();
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0075  */
            @Override // re.c.b
            public e resolve(Map<i, Long> map, e eVar, pe.i iVar) {
                n nVarRange;
                ne.f fVarF;
                re.a aVar = re.a.YEAR;
                Long l10 = map.get(aVar);
                i iVar2 = b.QUARTER_OF_YEAR;
                Long l11 = map.get(iVar2);
                if (l10 == null || l11 == null) {
                    return null;
                }
                int iCheckValidIntValue = aVar.checkValidIntValue(l10.longValue());
                long jLongValue = map.get(b.DAY_OF_QUARTER).longValue();
                if (iVar == pe.i.LENIENT) {
                    fVarF = ne.f.B(iCheckValidIntValue, 1, 1).G(z.F(z.H(l11.longValue(), 1L), 3)).F(z.H(jLongValue, 1L));
                } else {
                    int iA = iVar2.range().a(l11.longValue(), iVar2);
                    if (iVar == pe.i.STRICT) {
                        int i10 = 92;
                        if (iA == 1) {
                            if (oe.m.f34269e.n(iCheckValidIntValue)) {
                                i10 = 91;
                            } else {
                                i10 = 90;
                            }
                        } else if (iA == 2) {
                            i10 = 91;
                        }
                        nVarRange = n.c(1L, i10);
                    } else {
                        nVarRange = range();
                    }
                    nVarRange.b(jLongValue, this);
                    fVarF = ne.f.B(iCheckValidIntValue, ((iA - 1) * 3) + 1, 1).F(jLongValue - 1);
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(iVar2);
                return fVarF;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "DayOfQuarter";
            }
        }

        /* JADX INFO: renamed from: re.c$b$b, reason: collision with other inner class name */
        public final enum C0406b extends b {
            public C0406b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // re.c.b, re.i
            public <R extends re.d> R adjustInto(R r10, long j10) {
                long from = getFrom(r10);
                range().b(j10, this);
                re.a aVar = re.a.MONTH_OF_YEAR;
                return (R) r10.p(aVar, ((j10 - from) * 3) + r10.getLong(aVar));
            }

            @Override // re.c.b
            public l getBaseUnit() {
                return c.f35369e;
            }

            @Override // re.c.b, re.i
            public long getFrom(e eVar) {
                if (eVar.isSupported(this)) {
                    return (eVar.getLong(re.a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new m("Unsupported field: QuarterOfYear");
            }

            @Override // re.c.b
            public l getRangeUnit() {
                return re.b.YEARS;
            }

            @Override // re.c.b, re.i
            public boolean isSupportedBy(e eVar) {
                return eVar.isSupported(re.a.MONTH_OF_YEAR) && b.isIso(eVar);
            }

            @Override // re.c.b, re.i
            public n range() {
                return n.c(1L, 4L);
            }

            @Override // re.c.b, re.i
            public n rangeRefinedBy(e eVar) {
                return range();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "QuarterOfYear";
            }
        }

        /* JADX INFO: renamed from: re.c$b$c, reason: collision with other inner class name */
        public final enum C0407c extends b {
            public C0407c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // re.c.b, re.i
            public <R extends re.d> R adjustInto(R r10, long j10) {
                range().b(j10, this);
                return (R) r10.j(z.H(j10, getFrom(r10)), re.b.WEEKS);
            }

            @Override // re.c.b
            public l getBaseUnit() {
                return re.b.WEEKS;
            }

            @Override // re.c.b
            public String getDisplayName(Locale locale) {
                z.B(locale, "locale");
                return "Week";
            }

            @Override // re.c.b, re.i
            public long getFrom(e eVar) {
                if (eVar.isSupported(this)) {
                    return b.getWeek(ne.f.r(eVar));
                }
                throw new m("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // re.c.b
            public l getRangeUnit() {
                return c.f35368d;
            }

            @Override // re.c.b, re.i
            public boolean isSupportedBy(e eVar) {
                return eVar.isSupported(re.a.EPOCH_DAY) && b.isIso(eVar);
            }

            @Override // re.c.b, re.i
            public n range() {
                return n.d(1L, 52L, 53L);
            }

            @Override // re.c.b, re.i
            public n rangeRefinedBy(e eVar) {
                if (eVar.isSupported(this)) {
                    return b.getWeekRange(ne.f.r(eVar));
                }
                throw new m("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // re.c.b
            public e resolve(Map<i, Long> map, e eVar, pe.i iVar) {
                ne.f fVarL;
                i iVar2 = b.WEEK_BASED_YEAR;
                Long l10 = map.get(iVar2);
                re.a aVar = re.a.DAY_OF_WEEK;
                Long l11 = map.get(aVar);
                if (l10 == null || l11 == null) {
                    return null;
                }
                int iA = iVar2.range().a(l10.longValue(), iVar2);
                long jLongValue = map.get(b.WEEK_OF_WEEK_BASED_YEAR).longValue();
                if (iVar == pe.i.LENIENT) {
                    long jLongValue2 = l11.longValue();
                    long j10 = 0;
                    if (jLongValue2 > 7) {
                        long j11 = jLongValue2 - 1;
                        j10 = j11 / 7;
                        jLongValue2 = (j11 % 7) + 1;
                    } else if (jLongValue2 < 1) {
                        j10 = (jLongValue2 / 7) - 1;
                        jLongValue2 = (jLongValue2 % 7) + 7;
                    }
                    fVarL = ne.f.B(iA, 1, 4).H(jLongValue - 1).H(j10).p(aVar, jLongValue2);
                } else {
                    int iCheckValidIntValue = aVar.checkValidIntValue(l11.longValue());
                    (iVar == pe.i.STRICT ? b.getWeekRange(ne.f.B(iA, 1, 4)) : range()).b(jLongValue, this);
                    fVarL = ne.f.B(iA, 1, 4).H(jLongValue - 1).p(aVar, iCheckValidIntValue);
                }
                map.remove(this);
                map.remove(iVar2);
                map.remove(aVar);
                return fVarL;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekOfWeekBasedYear";
            }
        }

        public final enum d extends b {
            public d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // re.c.b, re.i
            public <R extends re.d> R adjustInto(R r10, long j10) {
                if (!isSupportedBy(r10)) {
                    throw new m("Unsupported field: WeekBasedYear");
                }
                int iA = range().a(j10, b.WEEK_BASED_YEAR);
                ne.f fVarR = ne.f.r(r10);
                re.a aVar = re.a.DAY_OF_WEEK;
                int i10 = fVarR.get(aVar);
                int week = b.getWeek(fVarR);
                if (week == 53 && b.getWeekRange(iA) == 52) {
                    week = 52;
                }
                ne.f fVarB = ne.f.B(iA, 1, 4);
                return (R) r10.o(fVarB.F(((week - 1) * 7) + (i10 - fVarB.get(aVar))));
            }

            @Override // re.c.b
            public l getBaseUnit() {
                return c.f35368d;
            }

            @Override // re.c.b, re.i
            public long getFrom(e eVar) {
                if (eVar.isSupported(this)) {
                    return b.getWeekBasedYear(ne.f.r(eVar));
                }
                throw new m("Unsupported field: WeekBasedYear");
            }

            @Override // re.c.b
            public l getRangeUnit() {
                return re.b.FOREVER;
            }

            @Override // re.c.b, re.i
            public boolean isSupportedBy(e eVar) {
                return eVar.isSupported(re.a.EPOCH_DAY) && b.isIso(eVar);
            }

            @Override // re.c.b, re.i
            public n range() {
                return re.a.YEAR.range();
            }

            @Override // re.c.b, re.i
            public n rangeRefinedBy(e eVar) {
                return re.a.YEAR.range();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekBasedYear";
            }
        }

        static {
            a aVar = new a("DAY_OF_QUARTER", 0);
            DAY_OF_QUARTER = aVar;
            C0406b c0406b = new C0406b("QUARTER_OF_YEAR", 1);
            QUARTER_OF_YEAR = c0406b;
            C0407c c0407c = new C0407c("WEEK_OF_WEEK_BASED_YEAR", 2);
            WEEK_OF_WEEK_BASED_YEAR = c0407c;
            d dVar = new d("WEEK_BASED_YEAR", 3);
            WEEK_BASED_YEAR = dVar;
            $VALUES = new b[]{aVar, c0406b, c0407c, dVar};
            QUARTER_DAYS = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
        }

        private b(String str, int i10) {
            super(str, i10);
        }

        public /* synthetic */ b(String str, int i10, a aVar) {
            this(str, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeek(ne.f fVar) {
            int iOrdinal = fVar.t().ordinal();
            int dayOfYear = fVar.getDayOfYear() - 1;
            int i10 = (3 - iOrdinal) + dayOfYear;
            int i11 = (i10 - ((i10 / 7) * 7)) - 3;
            if (i11 < -3) {
                i11 += 7;
            }
            if (dayOfYear < i11) {
                return (int) getWeekRange(fVar.M(BaseTransientBottomBar.ANIMATION_FADE_DURATION).I(-1L)).f35383f;
            }
            int iA = androidx.appcompat.widget.a.a(dayOfYear, i11, 7, 1);
            if (iA == 53) {
                if (!(i11 == -3 || (i11 == -2 && fVar.w()))) {
                    return 1;
                }
            }
            return iA;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeekBasedYear(ne.f fVar) {
            int i10 = fVar.f33781c;
            int dayOfYear = fVar.getDayOfYear();
            if (dayOfYear <= 3) {
                return dayOfYear - fVar.t().ordinal() < -2 ? i10 - 1 : i10;
            }
            if (dayOfYear >= 363) {
                return ((dayOfYear - 363) - (fVar.w() ? 1 : 0)) - fVar.t().ordinal() >= 0 ? i10 + 1 : i10;
            }
            return i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeekRange(int i10) {
            ne.f fVarB = ne.f.B(i10, 1, 1);
            if (fVarB.t() != ne.c.THURSDAY) {
                return (fVarB.t() == ne.c.WEDNESDAY && fVarB.w()) ? 53 : 52;
            }
            return 53;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static n getWeekRange(ne.f fVar) {
            return n.c(1L, getWeekRange(getWeekBasedYear(fVar)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isIso(e eVar) {
            return oe.h.g(eVar).equals(oe.m.f34269e);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        @Override // re.i
        public abstract /* synthetic */ <R extends re.d> R adjustInto(R r10, long j10);

        public abstract /* synthetic */ l getBaseUnit();

        public String getDisplayName(Locale locale) {
            z.B(locale, "locale");
            return toString();
        }

        @Override // re.i
        public abstract /* synthetic */ long getFrom(e eVar);

        public abstract /* synthetic */ l getRangeUnit();

        @Override // re.i
        public boolean isDateBased() {
            return true;
        }

        @Override // re.i
        public abstract /* synthetic */ boolean isSupportedBy(e eVar);

        @Override // re.i
        public boolean isTimeBased() {
            return false;
        }

        @Override // re.i
        public abstract /* synthetic */ n range();

        @Override // re.i
        public abstract /* synthetic */ n rangeRefinedBy(e eVar);

        public e resolve(Map<i, Long> map, e eVar, pe.i iVar) {
            return null;
        }
    }

    /* JADX INFO: renamed from: re.c$c, reason: collision with other inner class name */
    public enum EnumC0408c implements l {
        WEEK_BASED_YEARS("WeekBasedYears", ne.d.c(31556952)),
        QUARTER_YEARS("QuarterYears", ne.d.c(7889238));

        private final ne.d duration;
        private final String name;

        EnumC0408c(String str, ne.d dVar) {
            this.name = str;
            this.duration = dVar;
        }

        @Override // re.l
        public <R extends d> R addTo(R r10, long j10) {
            int i10 = a.f35370a[ordinal()];
            if (i10 == 1) {
                i iVar = c.f35367c;
                return (R) r10.p(iVar, z.D(r10.get(iVar), j10));
            }
            if (i10 == 2) {
                return (R) r10.j(j10 / 256, re.b.YEARS).j((j10 % 256) * 3, re.b.MONTHS);
            }
            throw new IllegalStateException("Unreachable");
        }

        @Override // re.l
        public long between(d dVar, d dVar2) {
            int i10 = a.f35370a[ordinal()];
            if (i10 == 1) {
                i iVar = c.f35367c;
                return z.H(dVar2.getLong(iVar), dVar.getLong(iVar));
            }
            if (i10 == 2) {
                return dVar.d(dVar2, re.b.MONTHS) / 3;
            }
            throw new IllegalStateException("Unreachable");
        }

        public ne.d getDuration() {
            return this.duration;
        }

        @Override // re.l
        public boolean isDateBased() {
            return true;
        }

        public boolean isDurationEstimated() {
            return true;
        }

        public boolean isSupportedBy(d dVar) {
            return dVar.isSupported(re.a.EPOCH_DAY);
        }

        public boolean isTimeBased() {
            return false;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }

    static {
        b bVar = b.DAY_OF_QUARTER;
        f35365a = b.QUARTER_OF_YEAR;
        f35366b = b.WEEK_OF_WEEK_BASED_YEAR;
        f35367c = b.WEEK_BASED_YEAR;
        f35368d = EnumC0408c.WEEK_BASED_YEARS;
        f35369e = EnumC0408c.QUARTER_YEARS;
    }
}
