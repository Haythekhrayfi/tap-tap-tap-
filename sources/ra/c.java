package ra;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import fd.g0;
import jc.w;
import oc.e;
import oc.h;
import uc.p;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.zipoapps.premiumhelper.configuration.testy.TestyUtils$checkTestyAppAuthorised$2", f = "TestyUtils.kt", l = {}, m = "invokeSuspend")
public final class c extends h implements p<g0, mc.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f35356c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, mc.d<? super c> dVar) {
        super(2, dVar);
        this.f35356c = context;
    }

    @Override // oc.a
    public final mc.d<w> create(Object obj, mc.d<?> dVar) {
        return new c(this.f35356c, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super Boolean> dVar) {
        return new c(this.f35356c, dVar).invokeSuspend(w.f31842a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        boolean z11;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        h9.d.t(obj);
        Cursor cursorQuery = this.f35356c.getContentResolver().query(Uri.parse("content://com.zipoapps.testykal.provider.TestyContentProvider/is_auth_signed_in"), null, this.f35356c.getPackageName(), null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.getCount() == 0) {
                    z11 = false;
                } else {
                    cursorQuery.moveToFirst();
                    int columnIndex = cursorQuery.getColumnIndex("is_auth_signed_in");
                    if (columnIndex >= 0 && cursorQuery.getInt(columnIndex) == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                c0.g(cursorQuery, null);
                z10 = z11;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c0.g(cursorQuery, th);
                    throw th2;
                }
            }
        }
        return Boolean.valueOf(z10);
    }
}
