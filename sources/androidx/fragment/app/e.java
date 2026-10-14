package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public class e implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0.e f2000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b.c f2003d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.f2001b.endViewTransition(eVar.f2002c);
            e.this.f2003d.a();
        }
    }

    public e(b bVar, l0.e eVar, ViewGroup viewGroup, View view, b.c cVar) {
        this.f2000a = eVar;
        this.f2001b = viewGroup;
        this.f2002c = view;
        this.f2003d = cVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f2001b.post(new a());
        if (FragmentManager.K(2)) {
            StringBuilder sbA = defpackage.a.a("Animation from operation ");
            sbA.append(this.f2000a);
            sbA.append(" has ended.");
            Log.v("FragmentManager", sbA.toString());
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        if (FragmentManager.K(2)) {
            StringBuilder sbA = defpackage.a.a("Animation from operation ");
            sbA.append(this.f2000a);
            sbA.append(" has reached onAnimationStart.");
            Log.v("FragmentManager", sbA.toString());
        }
    }
}
