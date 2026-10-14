package wa;

import fd.j0;
import gb.b0;
import java.util.Objects;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.ui.rate.c f37197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oa.b f37198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ma.f f37199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jc.e f37200d;

    /* JADX INFO: renamed from: wa.a$a, reason: collision with other inner class name */
    public enum EnumC0448a {
        NONE,
        DEFAULT,
        IN_APP_REVIEW,
        VALIDATE_INTENT,
        IN_APP_REVIEW_WITH_AD,
        VALIDATE_INTENT_WITH_AD
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f37202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f37203c;

        static {
            int[] iArr = new int[EnumC0448a.values().length];
            try {
                iArr[EnumC0448a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0448a.IN_APP_REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0448a.VALIDATE_INTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0448a.IN_APP_REVIEW_WITH_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC0448a.VALIDATE_INTENT_WITH_AD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC0448a.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f37201a = iArr;
            int[] iArr2 = new int[com.zipoapps.premiumhelper.ui.rate.c.b.values().length];
            try {
                iArr2[com.zipoapps.premiumhelper.ui.rate.c.b.VALIDATE_INTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.zipoapps.premiumhelper.ui.rate.c.b.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.zipoapps.premiumhelper.ui.rate.c.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f37202b = iArr2;
            int[] iArr3 = new int[com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.values().length];
            try {
                iArr3[com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.IN_APP_REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            f37203c = iArr3;
        }
    }

    public static final class c extends vc.l implements uc.a<b0> {
        public c() {
            super(0);
        }

        @Override // uc.a
        public b0 invoke() {
            b0.a aVar = b0.f30184d;
            long jLongValue = ((Number) a.this.f37198b.h(oa.b.D)).longValue();
            long jF = a.this.f37199c.f("happy_moment_capping_timestamp", 0L);
            Objects.requireNonNull(aVar);
            return new b0(jLongValue * 1000, jF, false);
        }
    }

    public static final class d extends vc.l implements uc.a<w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ uc.a<w> f37206d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(uc.a<w> aVar) {
            super(0);
            this.f37206d = aVar;
        }

        @Override // uc.a
        public w invoke() {
            a.this.a().b();
            if (a.this.f37198b.g(oa.b.E) == oa.b.EnumC0377b.GLOBAL) {
                a.this.f37199c.o("happy_moment_capping_timestamp", Long.valueOf(System.currentTimeMillis()));
            }
            this.f37206d.invoke();
            return w.f31842a;
        }
    }

    public a(com.zipoapps.premiumhelper.ui.rate.c cVar, oa.b bVar, ma.f fVar) {
        j0.i(cVar, "rateHelper");
        j0.i(bVar, "configuration");
        j0.i(fVar, "preferences");
        this.f37197a = cVar;
        this.f37198b = bVar;
        this.f37199c = fVar;
        this.f37200d = jc.f.b(new c());
    }

    public final b0 a() {
        return (b0) this.f37200d.getValue();
    }

    public final void b(uc.a<w> aVar, uc.a<w> aVar2) {
        long jF = this.f37199c.f("happy_moment_counter", 0L);
        if (jF >= ((Number) this.f37198b.h(oa.b.F)).longValue()) {
            a().a(new d(aVar), aVar2);
        } else {
            aVar2.invoke();
        }
        this.f37199c.o("happy_moment_counter", Long.valueOf(jF + 1));
    }
}
