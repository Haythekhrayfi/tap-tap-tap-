package a8;

import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ImagesContract;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f200d;

    public j(Uri uri, String str, i iVar, Long l10) {
        j0.i(uri, ImagesContract.URL);
        j0.i(str, "mimeType");
        this.f197a = uri;
        this.f198b = str;
        this.f199c = iVar;
        this.f200d = l10;
    }

    public /* synthetic */ j(Uri uri, String str, i iVar, Long l10, int i10, vc.g gVar) {
        this(uri, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? null : iVar, (i10 & 8) != 0 ? null : l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return j0.d(this.f197a, jVar.f197a) && j0.d(this.f198b, jVar.f198b) && j0.d(this.f199c, jVar.f199c) && j0.d(this.f200d, jVar.f200d);
    }

    public int hashCode() {
        int iA = l1.e.a(this.f198b, this.f197a.hashCode() * 31, 31);
        i iVar = this.f199c;
        int iHashCode = (iA + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Long l10 = this.f200d;
        return iHashCode + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("DivVideoSource(url=");
        sbA.append(this.f197a);
        sbA.append(", mimeType=");
        sbA.append(this.f198b);
        sbA.append(", resolution=");
        sbA.append(this.f199c);
        sbA.append(", bitrate=");
        sbA.append(this.f200d);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
