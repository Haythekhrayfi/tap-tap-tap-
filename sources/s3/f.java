package s3;

import android.content.Context;
import android.graphics.Bitmap;
import g3.u;
import java.security.MessageDigest;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class f implements d3.g<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3.g<Bitmap> f35424b;

    public f(d3.g<Bitmap> gVar) {
        Objects.requireNonNull(gVar, "Argument must not be null");
        this.f35424b = gVar;
    }

    @Override // d3.c
    public void a(MessageDigest messageDigest) {
        this.f35424b.a(messageDigest);
    }

    @Override // d3.g
    public u<c> b(Context context, u<c> uVar, int i10, int i11) {
        c cVar = uVar.get();
        u<Bitmap> dVar = new o3.d(cVar.b(), a3.c.b(context).f13c);
        u<Bitmap> uVarB = this.f35424b.b(context, dVar, i10, i11);
        if (!dVar.equals(uVarB)) {
            dVar.a();
        }
        Bitmap bitmap = uVarB.get();
        cVar.f35413c.f35423a.d(this.f35424b, bitmap);
        return uVar;
    }

    @Override // d3.c
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f35424b.equals(((f) obj).f35424b);
        }
        return false;
    }

    @Override // d3.c
    public int hashCode() {
        return this.f35424b.hashCode();
    }
}
