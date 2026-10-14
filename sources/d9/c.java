package d9;

import b9.k;
import b9.p;
import b9.q;
import b9.t;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import fd.j0;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import jc.w;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<q> f28907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f28908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f28909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a<t> f28910d;

    public static final class a extends l implements uc.a<w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28912d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28913e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f28914f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, long j10) {
            super(0);
            this.f28912d = str;
            this.f28913e = str2;
            this.f28914f = j10;
        }

        @Override // uc.a
        public w invoke() {
            q qVar = c.this.f28907a.get();
            String str = this.f28912d + CoreConstants.DOT + this.f28913e;
            long j10 = this.f28914f;
            if (j10 < 1) {
                j10 = 1;
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            qVar.f3398a.b(str, timeUnit.toMillis(j10), 1L, AbstractComponentTracker.LINGERING_TIMEOUT, timeUnit, 50);
            return w.f31842a;
        }
    }

    public c(ic.a<q> aVar, k kVar, p pVar, ic.a<t> aVar2) {
        j0.i(aVar, "histogramRecorder");
        j0.i(kVar, "histogramCallTypeProvider");
        j0.i(pVar, "histogramRecordConfig");
        j0.i(aVar2, "taskExecutor");
        this.f28907a = aVar;
        this.f28908b = kVar;
        this.f28909c = pVar;
        this.f28910d = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    @Override // d9.b
    public void a(String str, long j10, String str2) {
        String str3;
        boolean zH;
        j0.i(str, "histogramName");
        k kVar = this.f28908b;
        Objects.requireNonNull(kVar);
        j0.i(str, "histogramName");
        if (kVar.f3383b.invoke().a(str)) {
            kVar.a(str);
            str3 = "Cold";
        } else {
            str3 = kVar.a(str) ? "Cool" : "Warm";
        }
        String str4 = str2 == null ? str3 : str2;
        p pVar = this.f28909c;
        j0.i(str4, "callType");
        j0.i(pVar, "configuration");
        int iHashCode = str4.hashCode();
        if (iHashCode != 2106116) {
            if (iHashCode != 2106217) {
                if (iHashCode == 2688677 && str4.equals("Warm")) {
                    zH = pVar.i();
                } else {
                    int i10 = e9.a.f29114a;
                    zH = false;
                }
            } else if (str4.equals("Cool")) {
                zH = pVar.d();
            } else {
                int i11 = e9.a.f29114a;
                zH = false;
            }
        } else if (str4.equals("Cold")) {
            zH = pVar.h();
        } else {
            int i12 = e9.a.f29114a;
            zH = false;
        }
        if (zH) {
            this.f28910d.get().a(new a(str, str4, j10));
        }
    }
}
