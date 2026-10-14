package b5;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import d5.e;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements e5.b, d5.a, x5.a.InterfaceC0461a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f3310c;

    public /* synthetic */ a(b bVar, int i10) {
        this.f3310c = bVar;
    }

    @Override // d5.a
    public void a(String str, Bundle bundle) {
        this.f3310c.f3312b.a(str, bundle);
    }

    @Override // x5.a.InterfaceC0461a
    public void b(x5.b bVar) {
        b bVar2 = this.f3310c;
        Objects.requireNonNull(bVar2);
        c5.d dVar = c5.d.f3604c;
        dVar.b("AnalyticsConnector now available.");
        y4.a aVar = (y4.a) bVar.get();
        e eVar = new e(aVar);
        c cVar = new c();
        y4.a.InterfaceC0466a interfaceC0466aF = aVar.f("clx", cVar);
        if (interfaceC0466aF == null) {
            dVar.b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            interfaceC0466aF = aVar.f(AppMeasurement.CRASH_ORIGIN, cVar);
            if (interfaceC0466aF != null) {
                dVar.f("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        if (interfaceC0466aF == null) {
            dVar.f("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        dVar.b("Registered Firebase Analytics listener.");
        d5.d dVar2 = new d5.d();
        d5.c cVar2 = new d5.c(eVar, 500, TimeUnit.MILLISECONDS);
        synchronized (bVar2) {
            Iterator<e5.a> it = bVar2.f3314d.iterator();
            while (it.hasNext()) {
                dVar2.c(it.next());
            }
            cVar.f3316b = dVar2;
            cVar.f3315a = cVar2;
            bVar2.f3313c = dVar2;
            bVar2.f3312b = cVar2;
        }
    }

    @Override // e5.b
    public void c(e5.a aVar) {
        b bVar = this.f3310c;
        synchronized (bVar) {
            if (bVar.f3313c instanceof e5.c) {
                bVar.f3314d.add(aVar);
            }
            bVar.f3313c.c(aVar);
        }
    }
}
