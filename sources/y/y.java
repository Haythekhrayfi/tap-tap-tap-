package y;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public class y implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t.c f37933a;

    public y(t.c cVar) {
        this.f37933a = cVar;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return (float) this.f37933a.a(f10);
    }
}
