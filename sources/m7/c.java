package m7;

import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ImagesContract;
import ed.u;
import fd.j0;
import java.util.List;
import java.util.Map;
import kc.x;
import org.json.JSONException;
import org.json.JSONObject;
import y8.c0;

/* JADX INFO: loaded from: classes2.dex */
public class c extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f33239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static InterfaceC0356c f33240d;

    public /* synthetic */ class a implements InterfaceC0356c, vc.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33241a = new a();

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC0356c) && (obj instanceof vc.h)) {
                return j0.d(getFunctionDelegate(), ((vc.h) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // vc.h
        public final jc.b<?> getFunctionDelegate() {
            return new vc.k(2, c.class, "<init>", "<init>(Landroid/content/Context;Ljava/lang/String;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    /* JADX INFO: renamed from: m7.c$c, reason: collision with other inner class name */
    public interface InterfaceC0356c {
    }

    static {
        new b(null);
        f33239c = new String[]{"_id", ImagesContract.URL, "headers", "add_timestamp", "payload"};
        f33240d = a.f33241a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(str, "databaseName");
        boolean z10 = context instanceof Application;
        int i10 = e9.a.f29114a;
    }

    public final m7.a.C0355a a(Cursor cursor) {
        Map map;
        Uri uri = Uri.parse(cursor.getString(1));
        j0.h(uri, "parse(cursor.getString(1))");
        String string = cursor.getString(2);
        if (string == null) {
            map = x.f32010c;
        } else {
            List listQ = u.Q(string, new char[]{0}, false, 0, 6);
            if (listQ.isEmpty()) {
                int i10 = e9.a.f29114a;
                map = x.f32010c;
            } else {
                q.a aVar = new q.a(listQ.size());
                int size = listQ.size();
                int i11 = 0;
                while (i11 < size) {
                    int i12 = i11 + 1;
                    List listQ2 = u.Q((CharSequence) listQ.get(i11), new char[]{'\t'}, false, 0, 6);
                    if (listQ2.size() == 1) {
                        aVar.put(listQ2.get(0), "");
                    } else {
                        aVar.put(listQ2.get(0), listQ2.get(1));
                    }
                    i11 = i12;
                }
                map = aVar;
            }
        }
        JSONObject jSONObject = null;
        String string2 = cursor.isNull(4) ? null : cursor.getString(4);
        if (string2 != null) {
            if (string2.length() > 0) {
                try {
                    jSONObject = new JSONObject(string2);
                } catch (JSONException e10) {
                    j0.p("Payload parsing exception: ", e10);
                    int i13 = e9.a.f29114a;
                }
            }
        }
        return new m7.a.C0355a(uri, map, jSONObject, cursor.getLong(3), cursor.getLong(0));
    }

    public boolean b(m7.a.C0355a c0355a) {
        if (c0355a == null) {
            return false;
        }
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            int iDelete = writableDatabase.delete("items", "_id = ?", new String[]{String.valueOf(c0355a.f33233e)});
            c0.g(writableDatabase, null);
            return iDelete != 0;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0.g(writableDatabase, th);
                throw th2;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        j0.i(sQLiteDatabase, "sqLiteDatabase");
        sQLiteDatabase.execSQL("\n            CREATE TABLE items(\n            _id INTEGER PRIMARY KEY AUTOINCREMENT,\n            url TEXT NOT NULL,\n            headers TEXT,\n            add_timestamp INTEGER, \n            payload TEXT)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        j0.i(sQLiteDatabase, "sqLiteDatabase");
        if (i10 == 1) {
            sQLiteDatabase.execSQL("\n            ALTER TABLE items ADD COLUMN payload TEXT;\n        ");
        }
    }
}
