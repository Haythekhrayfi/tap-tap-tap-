package m0;

import android.util.Base64;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<List<byte[]>> f33136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f33137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f33138f;

    public f(String str, String str2, String str3, int i10) {
        Objects.requireNonNull(str);
        this.f33133a = str;
        Objects.requireNonNull(str2);
        this.f33134b = str2;
        Objects.requireNonNull(str3);
        this.f33135c = str3;
        this.f33136d = null;
        androidx.activity.i.b(i10 != 0);
        this.f33137e = i10;
        this.f33138f = str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sbA = defpackage.a.a("FontRequest {mProviderAuthority: ");
        sbA.append(this.f33133a);
        sbA.append(", mProviderPackage: ");
        sbA.append(this.f33134b);
        sbA.append(", mQuery: ");
        sbA.append(this.f33135c);
        sbA.append(", mCertificates:");
        sb2.append(sbA.toString());
        for (int i10 = 0; i10 < this.f33136d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f33136d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f33137e);
        return sb2.toString();
    }

    public f(String str, String str2, String str3, List<List<byte[]>> list) {
        Objects.requireNonNull(str);
        this.f33133a = str;
        Objects.requireNonNull(str2);
        this.f33134b = str2;
        Objects.requireNonNull(str3);
        this.f33135c = str3;
        Objects.requireNonNull(list);
        this.f33136d = list;
        this.f33137e = 0;
        this.f33138f = str + "-" + str2 + "-" + str3;
    }
}
