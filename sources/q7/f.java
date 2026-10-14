package q7;

import android.view.animation.Interpolator;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Interpolator f34797a;

    public f(Interpolator interpolator) {
        j0.i(interpolator, "base");
        this.f34797a = interpolator;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return 1.0f - this.f34797a.getInterpolation(1.0f - f10);
    }
}
