package ra;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.gson.Gson;
import fd.g0;
import java.util.Map;
import jc.w;
import oc.e;
import oc.h;
import uc.p;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.zipoapps.premiumhelper.configuration.testy.TestyUtils$fetchAppParams$2", f = "TestyUtils.kt", l = {}, m = "invokeSuspend")
public final class d extends h implements p<g0, mc.d<? super Map<String, ? extends String>>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f35357c;

    public static final class a extends n6.a<Map<String, ? extends String>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, mc.d<? super d> dVar) {
        super(2, dVar);
        this.f35357c = context;
    }

    @Override // oc.a
    public final mc.d<w> create(Object obj, mc.d<?> dVar) {
        return new d(this.f35357c, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super Map<String, ? extends String>> dVar) {
        return new d(this.f35357c, dVar).invokeSuspend(w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        h9.d.t(obj);
        Cursor cursorQuery = this.f35357c.getContentResolver().query(Uri.parse("content://com.zipoapps.testykal.provider.TestyContentProvider/" + this.f35357c.getPackageName()), null, this.f35357c.getPackageName(), null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.getCount() != 0) {
                    cursorQuery.moveToFirst();
                    int columnIndex = cursorQuery.getColumnIndex("ph_params");
                    if (columnIndex >= 0) {
                        Object objC = new Gson().c(cursorQuery.getString(columnIndex), new a().type);
                        c0.g(cursorQuery, null);
                        return objC;
                    }
                }
                c0.g(cursorQuery, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c0.g(cursorQuery, th);
                    throw th2;
                }
            }
        }
        return null;
    }
}
