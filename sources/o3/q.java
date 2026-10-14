package o3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class q implements g3.u<BitmapDrawable>, g3.r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Resources f33928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g3.u<Bitmap> f33929d;

    public q(Resources resources, g3.u<Bitmap> uVar) {
        Objects.requireNonNull(resources, "Argument must not be null");
        this.f33928c = resources;
        this.f33929d = uVar;
    }

    public static g3.u<BitmapDrawable> c(Resources resources, g3.u<Bitmap> uVar) {
        if (uVar == null) {
            return null;
        }
        return new q(resources, uVar);
    }

    @Override // g3.u
    public void a() {
        this.f33929d.a();
    }

    @Override // g3.u
    public Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    @Override // g3.u
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f33928c, this.f33929d.get());
    }

    @Override // g3.u
    public int getSize() {
        return this.f33929d.getSize();
    }

    @Override // g3.r
    public void initialize() {
        g3.u<Bitmap> uVar = this.f33929d;
        if (uVar instanceof g3.r) {
            ((g3.r) uVar).initialize();
        }
    }
}
