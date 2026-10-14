package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0.e f1992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b.c f1993e;

    public c(b bVar, ViewGroup viewGroup, View view, boolean z10, l0.e eVar, b.c cVar) {
        this.f1989a = viewGroup;
        this.f1990b = view;
        this.f1991c = z10;
        this.f1992d = eVar;
        this.f1993e = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f1989a.endViewTransition(this.f1990b);
        if (this.f1991c) {
            this.f1992d.f2088a.applyState(this.f1990b);
        }
        this.f1993e.a();
        if (FragmentManager.K(2)) {
            StringBuilder sbA = defpackage.a.a("Animator from operation ");
            sbA.append(this.f1992d);
            sbA.append(" has ended.");
            Log.v("FragmentManager", sbA.toString());
        }
    }
}
