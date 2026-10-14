package c;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import jc.h;
import kc.e0;
import kc.f0;
import kc.j;
import kc.t;
import kc.x;
import vc.g;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c.a<String[], Map<String, Boolean>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3527a = new a(null);

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }

        public final Intent a(String[] strArr) {
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            j0.h(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }
    }

    @Override // c.a
    public Intent a(Context context, String[] strArr) {
        String[] strArr2 = strArr;
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(strArr2, "input");
        return f3527a.a(strArr2);
    }

    @Override // c.a
    public c.a.C0064a<Map<String, Boolean>> b(Context context, String[] strArr) {
        String[] strArr2 = strArr;
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(strArr2, "input");
        boolean z10 = true;
        if (strArr2.length == 0) {
            return new c.a.C0064a<>(x.f32010c);
        }
        for (String str : strArr2) {
            if (!(e0.a.a(context, str) == 0)) {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            return null;
        }
        int iA = e0.a(strArr2.length);
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (String str2 : strArr2) {
            h hVar = new h(str2, Boolean.TRUE);
            linkedHashMap.put(hVar.f31811c, hVar.f31812d);
        }
        return new c.a.C0064a<>(linkedHashMap);
    }

    @Override // c.a
    public Map<String, Boolean> c(int i10, Intent intent) {
        if (i10 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i11 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i11 == 0));
                }
                return f0.i(t.M(j.n(stringArrayExtra), arrayList));
            }
        }
        return x.f32010c;
    }
}
