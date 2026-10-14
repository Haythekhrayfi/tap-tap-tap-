package j8;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import fd.j0;
import m9.p;
import r1.b0;
import r1.m;
import r1.r;

/* JADX INFO: loaded from: classes2.dex */
public class e extends b0 {

    public static final class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r1.l f31734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f31735b;

        public a(r1.l lVar, p pVar) {
            this.f31734a = lVar;
            this.f31735b = pVar;
        }

        @Override // r1.m, r1.l.g
        public void onTransitionEnd(r1.l lVar) {
            j0.i(lVar, "transition");
            p pVar = this.f31735b;
            if (pVar != null) {
                pVar.setTransient(false);
            }
            this.f31734a.removeListener(this);
        }
    }

    public static final class b extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r1.l f31736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f31737b;

        public b(r1.l lVar, p pVar) {
            this.f31736a = lVar;
            this.f31737b = pVar;
        }

        @Override // r1.m, r1.l.g
        public void onTransitionEnd(r1.l lVar) {
            j0.i(lVar, "transition");
            p pVar = this.f31737b;
            if (pVar != null) {
                pVar.setTransient(false);
            }
            this.f31736a.removeListener(this);
        }
    }

    @Override // r1.b0
    public Animator onAppear(ViewGroup viewGroup, r rVar, int i10, r rVar2, int i11) {
        j0.i(viewGroup, "sceneRoot");
        View view = rVar2 == null ? null : rVar2.f35133b;
        p pVar = view instanceof p ? (p) view : null;
        if (pVar != null) {
            pVar.setTransient(true);
        }
        addListener(new a(this, pVar));
        return super.onAppear(viewGroup, rVar, i10, rVar2, i11);
    }

    @Override // r1.b0
    public Animator onDisappear(ViewGroup viewGroup, r rVar, int i10, r rVar2, int i11) {
        j0.i(viewGroup, "sceneRoot");
        View view = rVar == null ? null : rVar.f35133b;
        p pVar = view instanceof p ? (p) view : null;
        if (pVar != null) {
            pVar.setTransient(true);
        }
        addListener(new b(this, pVar));
        return super.onDisappear(viewGroup, rVar, i10, rVar2, i11);
    }
}
