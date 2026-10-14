package s7;

import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import fd.j0;
import p7.f1;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final boolean a(Uri uri, f1 f1Var) {
        j0.i(f1Var, "divViewFacade");
        String authority = uri == null ? null : uri.getAuthority();
        if (authority == null || !j0.d("download", authority)) {
            return false;
        }
        if (uri.getQueryParameter(ImagesContract.URL) == null) {
            int i10 = e9.a.f29114a;
            return false;
        }
        if (f1Var instanceof i8.k) {
            return true;
        }
        int i11 = e9.a.f29114a;
        return false;
    }
}
