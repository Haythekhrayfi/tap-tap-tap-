package r9;

import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import h0.f;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f35306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Typeface f35307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f35308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f35309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35310e;

    public b(float f10, Typeface typeface, float f11, float f12, int i10) {
        j0.i(typeface, "fontWeight");
        this.f35306a = f10;
        this.f35307b = typeface;
        this.f35308c = f11;
        this.f35309d = f12;
        this.f35310e = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j0.d(Float.valueOf(this.f35306a), Float.valueOf(bVar.f35306a)) && j0.d(this.f35307b, bVar.f35307b) && j0.d(Float.valueOf(this.f35308c), Float.valueOf(bVar.f35308c)) && j0.d(Float.valueOf(this.f35309d), Float.valueOf(bVar.f35309d)) && this.f35310e == bVar.f35310e;
    }

    public int hashCode() {
        return Integer.hashCode(this.f35310e) + ((Float.hashCode(this.f35309d) + ((Float.hashCode(this.f35308c) + ((this.f35307b.hashCode() + (Float.hashCode(this.f35306a) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("SliderTextStyle(fontSize=");
        sbA.append(this.f35306a);
        sbA.append(", fontWeight=");
        sbA.append(this.f35307b);
        sbA.append(", offsetX=");
        sbA.append(this.f35308c);
        sbA.append(", offsetY=");
        sbA.append(this.f35309d);
        sbA.append(", textColor=");
        return f.a(sbA, this.f35310e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
