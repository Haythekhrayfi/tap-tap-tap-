package y;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public class m implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t.c f37726a;

    public m(t.c cVar) {
        this.f37726a = cVar;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return (float) this.f37726a.a(f10);
    }
}
