package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class f implements l0.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f2030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.c f2032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0.e f2033d;

    public f(b bVar, View view, ViewGroup viewGroup, b.c cVar, l0.e eVar) {
        this.f2030a = view;
        this.f2031b = viewGroup;
        this.f2032c = cVar;
        this.f2033d = eVar;
    }

    @Override // l0.d.a
    public void a() {
        this.f2030a.clearAnimation();
        this.f2031b.endViewTransition(this.f2030a);
        this.f2032c.a();
        if (FragmentManager.K(2)) {
            StringBuilder sbA = defpackage.a.a("Animation from operation ");
            sbA.append(this.f2033d);
            sbA.append(" has been cancelled.");
            Log.v("FragmentManager", sbA.toString());
        }
    }
}
