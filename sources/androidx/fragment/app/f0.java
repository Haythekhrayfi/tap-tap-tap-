package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f2034a = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f2035b;

    static {
        i0 i0Var;
        try {
            i0Var = (i0) r1.e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            i0Var = null;
        }
        f2035b = i0Var;
    }

    public static void a(Fragment fragment, Fragment fragment2, boolean z10, q.a<String, View> aVar, boolean z11) {
        if ((z10 ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i10 = aVar == null ? 0 : aVar.f34737e;
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList2.add(aVar.h(i11));
                arrayList.add(aVar.l(i11));
            }
        }
    }

    public static String b(q.a<String, String> aVar, String str) {
        int i10 = aVar.f34737e;
        for (int i11 = 0; i11 < i10; i11++) {
            if (str.equals(aVar.l(i11))) {
                return aVar.h(i11);
            }
        }
        return null;
    }

    public static void c(ArrayList<View> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i10);
        }
    }
}
