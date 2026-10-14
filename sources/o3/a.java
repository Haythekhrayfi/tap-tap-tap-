package o3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a<DataType> implements com.bumptech.glide.load.e<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.e<DataType, Bitmap> f33887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f33888b;

    public a(Context context, com.bumptech.glide.load.e<DataType, Bitmap> eVar) {
        this(context.getResources(), eVar);
    }

    public a(Resources resources, com.bumptech.glide.load.e<DataType, Bitmap> eVar) {
        Objects.requireNonNull(resources, "Argument must not be null");
        this.f33888b = resources;
        Objects.requireNonNull(eVar, "Argument must not be null");
        this.f33887a = eVar;
    }

    @Deprecated
    public a(Resources resources, h3.d dVar, com.bumptech.glide.load.e<DataType, Bitmap> eVar) {
        this(resources, eVar);
    }

    @Override // com.bumptech.glide.load.e
    public g3.u<BitmapDrawable> a(DataType datatype, int i10, int i11, d3.e eVar) throws IOException {
        return q.c(this.f33888b, this.f33887a.a(datatype, i10, i11, eVar));
    }

    @Override // com.bumptech.glide.load.e
    public boolean b(DataType datatype, d3.e eVar) throws IOException {
        return this.f33887a.b(datatype, eVar);
    }
}
