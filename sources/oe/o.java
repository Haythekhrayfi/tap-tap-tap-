package oe;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends h implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Locale f34270e = new Locale("ja", "JP", "JP");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f34271f = new o();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Map<String, String[]> f34272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map<String, String[]> f34273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map<String, String[]> f34274i;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34275a;

        static {
            int[] iArr = new int[re.a.values().length];
            f34275a = iArr;
            try {
                iArr[re.a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34275a[re.a.DAY_OF_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34275a[re.a.MICRO_OF_DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34275a[re.a.MICRO_OF_SECOND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34275a[re.a.HOUR_OF_DAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34275a[re.a.HOUR_OF_AMPM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34275a[re.a.MINUTE_OF_DAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34275a[re.a.MINUTE_OF_HOUR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34275a[re.a.SECOND_OF_DAY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34275a[re.a.SECOND_OF_MINUTE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34275a[re.a.MILLI_OF_DAY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34275a[re.a.MILLI_OF_SECOND.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f34275a[re.a.NANO_OF_DAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f34275a[re.a.NANO_OF_SECOND.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f34275a[re.a.CLOCK_HOUR_OF_DAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f34275a[re.a.CLOCK_HOUR_OF_AMPM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f34275a[re.a.EPOCH_DAY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f34275a[re.a.PROLEPTIC_MONTH.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f34275a[re.a.ERA.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f34275a[re.a.YEAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f34275a[re.a.YEAR_OF_ERA.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f34275a[re.a.MONTH_OF_YEAR.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f34275a[re.a.DAY_OF_YEAR.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f34272g = map;
        HashMap map2 = new HashMap();
        f34273h = map2;
        HashMap map3 = new HashMap();
        f34274i = map3;
        map.put("en", new String[]{"Unknown", "K", "M", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "S", "H"});
        map.put("ja", new String[]{"Unknown", "K", "M", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "S", "H"});
        map2.put("en", new String[]{"Unknown", "K", "M", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "S", "H"});
        map2.put("ja", new String[]{"Unknown", "慶", "明", "大", "昭", "平"});
        map3.put("en", new String[]{"Unknown", "Keio", "Meiji", "Taisho", "Showa", "Heisei"});
        map3.put("ja", new String[]{"Unknown", "慶応", "明治", "大正", "昭和", "平成"});
    }

    private Object readResolve() {
        return f34271f;
    }

    @Override // oe.h
    public b b(re.e eVar) {
        return eVar instanceof p ? (p) eVar : new p(ne.f.r(eVar));
    }

    @Override // oe.h
    public i f(int i10) {
        return q.h(i10);
    }

    @Override // oe.h
    public String h() {
        return "japanese";
    }

    @Override // oe.h
    public String i() {
        return "Japanese";
    }

    @Override // oe.h
    public c<p> j(re.e eVar) {
        return super.j(eVar);
    }

    @Override // oe.h
    public f<p> l(ne.e eVar, ne.q qVar) {
        return g.t(this, eVar, qVar);
    }

    @Override // oe.h
    public f<p> m(re.e eVar) {
        return super.m(eVar);
    }

    public re.n n(re.a aVar) {
        int[] iArr = a.f34275a;
        switch (iArr[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return aVar.range();
            default:
                Calendar calendar = Calendar.getInstance(f34270e);
                int i10 = 0;
                switch (iArr[aVar.ordinal()]) {
                    case 19:
                        q[] qVarArrI = q.i();
                        return re.n.c(qVarArrI[0].f34283c, qVarArrI[qVarArrI.length - 1].f34283c);
                    case 20:
                        q[] qVarArrI2 = q.i();
                        return re.n.c(p.f34276f.f33781c, qVarArrI2[qVarArrI2.length - 1].f().f33781c);
                    case 21:
                        q[] qVarArrI3 = q.i();
                        int i11 = (qVarArrI3[qVarArrI3.length - 1].f().f33781c - qVarArrI3[qVarArrI3.length - 1].f34284d.f33781c) + 1;
                        int iMin = Integer.MAX_VALUE;
                        while (i10 < qVarArrI3.length) {
                            iMin = Math.min(iMin, (qVarArrI3[i10].f().f33781c - qVarArrI3[i10].f34284d.f33781c) + 1);
                            i10++;
                        }
                        return re.n.e(1L, 6L, iMin, i11);
                    case 22:
                        return re.n.e(calendar.getMinimum(2) + 1, calendar.getGreatestMinimum(2) + 1, calendar.getLeastMaximum(2) + 1, calendar.getMaximum(2) + 1);
                    case 23:
                        q[] qVarArrI4 = q.i();
                        int iMin2 = 366;
                        while (i10 < qVarArrI4.length) {
                            iMin2 = Math.min(iMin2, ((qVarArrI4[i10].f34284d.w() ? 366 : 365) - qVarArrI4[i10].f34284d.getDayOfYear()) + 1);
                            i10++;
                        }
                        return re.n.d(1L, iMin2, 366L);
                    default:
                        throw new UnsupportedOperationException("Unimplementable field: " + aVar);
                }
        }
    }
}
