package h2;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class o implements x1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2.a f30532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2.a f30533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2.q f30534c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i2.d f30535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ UUID f30536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x1.d f30537e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Context f30538f;

        public a(i2.d dVar, UUID uuid, x1.d dVar2, Context context) {
            this.f30535c = dVar;
            this.f30536d = uuid;
            this.f30537e = dVar2;
            this.f30538f = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!(this.f30535c.f31189c instanceof i2.b.c)) {
                    String string = this.f30536d.toString();
                    androidx.work.h hVarF = ((g2.r) o.this.f30534c).f(string);
                    if (hVarF == null || hVarF.isFinished()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    ((y1.d) o.this.f30533b).f(string, this.f30537e);
                    this.f30538f.startService(androidx.work.impl.foreground.a.a(this.f30538f, string, this.f30537e));
                }
                this.f30535c.j(null);
            } catch (Throwable th) {
                this.f30535c.k(th);
            }
        }
    }

    static {
        x1.m.e("WMFgUpdater");
    }

    public o(WorkDatabase workDatabase, f2.a aVar, j2.a aVar2) {
        this.f30533b = aVar;
        this.f30532a = aVar2;
        this.f30534c = workDatabase.v();
    }

    public t4.a<Void> a(Context context, UUID uuid, x1.d dVar) {
        i2.d dVar2 = new i2.d();
        j2.a aVar = this.f30532a;
        ((j2.b) aVar).f31695a.execute(new a(dVar2, uuid, dVar, context));
        return dVar2;
    }
}
