package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class Kc extends AbstractC1782ld<Jc> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.yandex.metrica.gpllibrary.b f14350f;

    public Kc(Context context, Looper looper, LocationListener locationListener, InterfaceC1659ge interfaceC1659ge, com.yandex.metrica.gpllibrary.b bVar) {
        super(context, locationListener, interfaceC1659ge, looper);
        this.f14350f = bVar;
    }

    public Kc(Context context, C1941rn c1941rn, LocationListener locationListener, InterfaceC1659ge interfaceC1659ge) {
        this(context, c1941rn.b(), locationListener, interfaceC1659ge, a(context, locationListener, c1941rn));
    }

    public Kc(Context context, C2086xd c2086xd, C1941rn c1941rn, C1634fe c1634fe) {
        this(context, c2086xd, c1941rn, c1634fe, new C1497a2());
    }

    private Kc(Context context, C2086xd c2086xd, C1941rn c1941rn, C1634fe c1634fe, C1497a2 c1497a2) {
        this(context, c1941rn, new C1683hd(c2086xd), c1497a2.a(c1634fe));
    }

    private static com.yandex.metrica.gpllibrary.b a(Context context, LocationListener locationListener, C1941rn c1941rn) {
        if (B2.a("com.google.android.gms.location.LocationRequest")) {
            try {
                return new com.yandex.metrica.gpllibrary.a(context, locationListener, c1941rn.b(), c1941rn, AbstractC1782ld.f16818e);
            } catch (Throwable unused) {
            }
        }
        return new Ac();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1782ld
    public void a() {
        try {
            this.f14350f.stopLocationUpdates();
        } catch (Throwable unused) {
        }
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1782ld
    public boolean a(Jc jc2) {
        Jc jc3 = jc2;
        if (jc3.f14317b != null && this.f16820b.a(this.f16819a)) {
            try {
                this.f14350f.startLocationUpdates(jc3.f14317b.f14143a);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1782ld
    public void b() {
        if (this.f16820b.a(this.f16819a)) {
            try {
                this.f14350f.updateLastKnownLocation();
            } catch (Throwable unused) {
            }
        }
    }
}
