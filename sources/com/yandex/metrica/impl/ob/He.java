package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class He implements InterfaceC2020v2<Le> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14146a;

    public He(Context context) {
        this.f14146a = context;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2020v2, uc.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Le invoke() {
        Cursor cursorQuery;
        JSONObject jSONObject;
        try {
            cursorQuery = this.f14146a.getContentResolver().query(Uri.parse("content://com.yandex.preinstallsatellite.appmetrica.provider/preload_info"), null, null, null, null);
            try {
                if (cursorQuery == null) {
                    B2.a("No Satellite content provider found", new Object[0]);
                } else {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("tracking_id"));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("additional_parameters"));
                        try {
                            jSONObject = !TextUtils.isEmpty(string2) ? new JSONObject(string2) : new JSONObject();
                        } catch (Throwable unused) {
                        }
                        B2.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject);
                        Le le2 = new Le(string, jSONObject, !TextUtils.isEmpty(string), false, E0.SATELLITE);
                        U2.a(cursorQuery);
                        return le2;
                    }
                    B2.a("No Preload Info data in Satellite content provider", new Object[0]);
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            cursorQuery = null;
        }
        U2.a(cursorQuery);
        return null;
    }
}
