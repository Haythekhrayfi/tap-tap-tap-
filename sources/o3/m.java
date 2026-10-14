package o3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class m implements d3.g<Drawable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3.g<Bitmap> f33921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f33922c;

    public m(d3.g<Bitmap> gVar, boolean z10) {
        this.f33921b = gVar;
        this.f33922c = z10;
    }

    @Override // d3.c
    public void a(MessageDigest messageDigest) {
        this.f33921b.a(messageDigest);
    }

    @Override // d3.g
    public g3.u<Drawable> b(Context context, g3.u<Drawable> uVar, int i10, int i11) {
        h3.d dVar = a3.c.b(context).f13c;
        Drawable drawable = uVar.get();
        g3.u<Bitmap> uVarA = l.a(dVar, drawable, i10, i11);
        if (uVarA != null) {
            g3.u<Bitmap> uVarB = this.f33921b.b(context, uVarA, i10, i11);
            if (!uVarB.equals(uVarA)) {
                return q.c(context.getResources(), uVarB);
            }
            uVarB.a();
            return uVar;
        }
        if (!this.f33922c) {
            return uVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // d3.c
    public boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f33921b.equals(((m) obj).f33921b);
        }
        return false;
    }

    @Override // d3.c
    public int hashCode() {
        return this.f33921b.hashCode();
    }
}
