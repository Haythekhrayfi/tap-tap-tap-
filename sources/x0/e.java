package x0;

import android.os.Looper;
import android.util.AndroidRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b<e> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f37364r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f37365s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f37366t;

    public <K> e(K k10, c<K> cVar) {
        super(k10, cVar);
        this.f37364r = null;
        this.f37365s = Float.MAX_VALUE;
        this.f37366t = false;
    }

    public <K> e(K k10, c<K> cVar, float f10) {
        super(k10, cVar);
        this.f37364r = null;
        this.f37365s = Float.MAX_VALUE;
        this.f37366t = false;
        this.f37364r = new f(f10);
    }

    public e(d dVar) {
        super(dVar);
        this.f37364r = null;
        this.f37365s = Float.MAX_VALUE;
        this.f37366t = false;
    }

    public void d() {
        if (!(this.f37364r.f37368b > 0.0d)) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f37353f) {
            this.f37366t = true;
        }
    }
}
