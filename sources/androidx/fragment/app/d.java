package androidx.fragment.app;

import android.animation.Animator;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class d implements l0.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Animator f1998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.e f1999b;

    public d(b bVar, Animator animator, l0.e eVar) {
        this.f1998a = animator;
        this.f1999b = eVar;
    }

    @Override // l0.d.a
    public void a() {
        this.f1998a.end();
        if (FragmentManager.K(2)) {
            StringBuilder sbA = defpackage.a.a("Animator from operation ");
            sbA.append(this.f1999b);
            sbA.append(" has been canceled.");
            Log.v("FragmentManager", sbA.toString());
        }
    }
}
