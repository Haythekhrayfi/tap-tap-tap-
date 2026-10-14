package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1995u2 implements InterfaceC2020v2<P3.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17499a;

    public C1995u2(Context context) {
        this.f17499a = context;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2020v2, uc.a
    public Object invoke() {
        Cursor cursorQuery;
        try {
            cursorQuery = this.f17499a.getContentResolver().query(Uri.parse("content://com.yandex.preinstallsatellite.appmetrica.provider/clids"), null, null, null, null);
            try {
                if (cursorQuery == null) {
                    B2.a("No Satellite content provider found", new Object[0]);
                    return null;
                }
                HashMap map = new HashMap();
                while (cursorQuery.moveToNext()) {
                    try {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("clid_key"));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("clid_value"));
                        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                            B2.a("Invalid clid {%s : %s}", string, string2);
                        } else {
                            map.put(string, string2);
                        }
                    } catch (Throwable unused) {
                    }
                }
                B2.a("Clids from satellite: %s", map);
                P3.a aVar = new P3.a(map, E0.SATELLITE);
                U2.a(cursorQuery);
                return aVar;
            } catch (Throwable th) {
                th = th;
                try {
                    B2.a(th, "Error while getting satellite clids", new Object[0]);
                } finally {
                    U2.a(cursorQuery);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursorQuery = null;
        }
    }
}
