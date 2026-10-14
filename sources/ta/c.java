package ta;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends xe.a.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f35872b;

    public c(Context context) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f35872b = context;
    }

    @Override // xe.a.c
    public void i(int i10, String str, String str2, Throwable th) {
        b5.d dVarA;
        j0.i(str2, "message");
        if (i10 == 2 || i10 == 3) {
            return;
        }
        b5.d dVarA2 = null;
        try {
            dVarA = b5.d.a();
        } catch (IllegalStateException unused) {
            u4.d.e(this.f35872b);
            try {
                dVarA = b5.d.a();
            } catch (IllegalStateException unused2) {
                dVarA = null;
            }
        }
        if (dVarA != null) {
            dVarA.b(str + CoreConstants.COLON_CHAR + str2);
        }
        if (th == null || i10 != 6) {
            return;
        }
        try {
            dVarA2 = b5.d.a();
        } catch (IllegalStateException unused3) {
            u4.d.e(this.f35872b);
            try {
                dVarA2 = b5.d.a();
            } catch (IllegalStateException unused4) {
            }
        }
        if (dVarA2 != null) {
            dVarA2.c(th);
        }
    }
}
