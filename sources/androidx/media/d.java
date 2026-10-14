package androidx.media;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2274c;

    public d(String str, int i10, int i11) {
        this.f2272a = str;
        this.f2273b = i10;
        this.f2274c = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return TextUtils.equals(this.f2272a, dVar.f2272a) && this.f2273b == dVar.f2273b && this.f2274c == dVar.f2274c;
    }

    public int hashCode() {
        return o0.b.b(this.f2272a, Integer.valueOf(this.f2273b), Integer.valueOf(this.f2274c));
    }
}
