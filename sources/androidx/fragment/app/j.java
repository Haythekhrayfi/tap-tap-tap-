package androidx.fragment.app;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class j implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.e f2061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0.e f2062d;

    public j(b bVar, b.e eVar, l0.e eVar2) {
        this.f2061c = eVar;
        this.f2062d = eVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2061c.a();
        if (FragmentManager.K(2)) {
            StringBuilder sbA = defpackage.a.a("Transition for operation ");
            sbA.append(this.f2062d);
            sbA.append("has completed");
            Log.v("FragmentManager", sbA.toString());
        }
    }
}
