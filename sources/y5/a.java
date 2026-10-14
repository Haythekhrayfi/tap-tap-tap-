package y5;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.installations.b f38084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f38085e;

    public /* synthetic */ a(com.google.firebase.installations.b bVar, boolean z10, int i10) {
        this.f38083c = i10;
        this.f38084d = bVar;
        this.f38085e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a6.d dVarC;
        a6.d dVarJ;
        switch (this.f38083c) {
            case 0:
                this.f38084d.b(this.f38085e);
                return;
            default:
                com.google.firebase.installations.b bVar = this.f38084d;
                boolean z10 = this.f38085e;
                Objects.requireNonNull(bVar);
                Object obj = com.google.firebase.installations.b.f12568m;
                synchronized (obj) {
                    u4.d dVar = bVar.f12570a;
                    dVar.a();
                    j1.c cVarB = j1.c.b(dVar.f36011a, "generatefid.lock");
                    try {
                        dVarC = bVar.f12572c.c();
                        if (cVarB != null) {
                            cVarB.d();
                        }
                    } catch (Throwable th) {
                        if (cVarB != null) {
                            cVarB.d();
                        }
                        throw th;
                    }
                }
                try {
                    if (dVarC.h()) {
                        dVarJ = bVar.j(dVarC);
                    } else {
                        if (dVarC.f() == a6.c.a.UNREGISTERED) {
                            dVarJ = bVar.j(dVarC);
                        } else if (!z10 && !bVar.f12573d.d(dVarC)) {
                            return;
                        } else {
                            dVarJ = bVar.c(dVarC);
                        }
                    }
                    synchronized (obj) {
                        u4.d dVar2 = bVar.f12570a;
                        dVar2.a();
                        j1.c cVarB2 = j1.c.b(dVar2.f36011a, "generatefid.lock");
                        try {
                            bVar.f12572c.b(dVarJ);
                            if (cVarB2 != null) {
                                cVarB2.d();
                            }
                        } catch (Throwable th2) {
                            if (cVarB2 != null) {
                                cVarB2.d();
                            }
                            throw th2;
                        }
                    }
                    synchronized (bVar) {
                        if (bVar.f12580k.size() != 0 && !TextUtils.equals(dVarC.c(), dVarJ.c())) {
                            Iterator<z5.a> it = bVar.f12580k.iterator();
                            while (it.hasNext()) {
                                it.next().a(dVarJ.c());
                            }
                        }
                    }
                    if (dVarJ.j()) {
                        String strC = dVarJ.c();
                        synchronized (bVar) {
                            bVar.f12579j = strC;
                        }
                    }
                    if (dVarJ.h()) {
                        e = new com.google.firebase.installations.c(com.google.firebase.installations.c.a.BAD_CONFIG);
                    } else {
                        if (!dVarJ.i()) {
                            bVar.l(dVarJ);
                            return;
                        }
                        e = new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
                    }
                } catch (com.google.firebase.installations.c e10) {
                    e = e10;
                }
                bVar.k(e);
                return;
        }
    }
}
