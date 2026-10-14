package t3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import g3.u;
import java.util.Objects;
import o3.q;

/* JADX INFO: loaded from: classes.dex */
public class b implements e<Bitmap, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f35670a;

    public b(Context context) {
        this(context.getResources());
    }

    public b(Resources resources) {
        Objects.requireNonNull(resources, "Argument must not be null");
        this.f35670a = resources;
    }

    @Deprecated
    public b(Resources resources, h3.d dVar) {
        this(resources);
    }

    @Override // t3.e
    public u<BitmapDrawable> a(u<Bitmap> uVar, d3.e eVar) {
        return q.c(this.f35670a, uVar);
    }
}
