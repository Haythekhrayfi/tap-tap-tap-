package a8;

import android.view.View;
import android.view.ViewGroup;
import fd.j0;
import o8.s;
import y9.h8;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    static {
        new a(null);
    }

    public final s a(ViewGroup viewGroup, String str) {
        s sVarA;
        int childCount = viewGroup.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                return null;
            }
            int i11 = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof s) {
                s sVar = (s) childAt;
                h8 div$div_release = sVar.getDiv$div_release();
                if (j0.d(div$div_release != null ? div$div_release.f40515q : null, str)) {
                    return sVar;
                }
            }
            if ((childAt instanceof ViewGroup) && (sVarA = a((ViewGroup) childAt, str)) != null) {
                return sVarA;
            }
            i10 = i11;
        }
    }
}
