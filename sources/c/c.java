package c;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a<String, Boolean> {
    @Override // c.a
    public Intent a(Context context, String str) {
        String str2 = str;
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(str2, "input");
        return b.f3527a.a(new String[]{str2});
    }

    @Override // c.a
    public a.C0064a<Boolean> b(Context context, String str) {
        String str2 = str;
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(str2, "input");
        if (e0.a.a(context, str2) == 0) {
            return new a.C0064a<>(Boolean.TRUE);
        }
        return null;
    }

    @Override // c.a
    public Boolean c(int i10, Intent intent) {
        boolean z10;
        if (intent == null || i10 != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z11 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z10 = false;
                    break;
                }
                if (intArrayExtra[i11] == 0) {
                    z10 = true;
                    break;
                }
                i11++;
            }
            if (z10) {
                z11 = true;
            }
        }
        return Boolean.valueOf(z11);
    }
}
