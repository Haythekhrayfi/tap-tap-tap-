package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1704i9 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sessions_BACKUP (id INTEGER,start_time INTEGER,connection_type INTEGER,network_type TEXT,country_code INTEGER,operator_id INTEGER,lac INTEGER,report_request_parameters TEXT );");
        StringBuilder sb2 = new StringBuilder();
        String str = FacebookMediationAdapter.KEY_ID;
        sb2.append(FacebookMediationAdapter.KEY_ID);
        sb2.append(",");
        sb2.append("start_time");
        j1.d.a(sb2, ",", "connection_type", ",", "network_type");
        j1.d.a(sb2, ",", "country_code", ",", "operator_id");
        sb2.append(",");
        sb2.append("lac");
        sb2.append(",");
        sb2.append("report_request_parameters");
        sQLiteDatabase.execSQL("INSERT INTO sessions_BACKUP SELECT " + ((CharSequence) sb2) + " FROM sessions;");
        sQLiteDatabase.execSQL("DROP TABLE sessions;");
        sQLiteDatabase.execSQL(O8.e.f14626b);
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM sessions_BACKUP", null);
            while (cursorRawQuery.moveToNext()) {
                ContentValues contentValues = new ContentValues();
                DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                arrayList.add("start_time");
                arrayList.add("report_request_parameters");
                ContentValues contentValues2 = new ContentValues(contentValues);
                for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                    String str2 = str;
                    if (!arrayList.contains(entry.getKey())) {
                        contentValues2.remove(entry.getKey());
                    }
                    str = str2;
                }
                String str3 = str;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    contentValues.remove((String) it.next());
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("conn_type", contentValues.getAsInteger("connection_type"));
                jSONObject.putOpt("net_type", contentValues.get("network_type"));
                jSONObject.putOpt("operator_id", contentValues.get("operator_id"));
                jSONObject.putOpt("lac", contentValues.get("lac"));
                jSONObject.putOpt("country_code", contentValues.get("country_code"));
                contentValues2.put("network_info", jSONObject.toString());
                sQLiteDatabase.insertOrThrow("sessions", null, contentValues2);
                str = str3;
            }
            U2.a(cursorRawQuery);
            sQLiteDatabase.execSQL("DROP TABLE sessions_BACKUP;");
            sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN wifi_network_info TEXT DEFAULT ''");
            sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN cell_info TEXT DEFAULT ''");
            sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN location_info TEXT DEFAULT ''");
        } catch (Throwable th) {
            U2.a(cursorRawQuery);
            throw th;
        }
    }
}
