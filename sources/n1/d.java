package n1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.Closeable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public interface d extends Closeable {

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33609a;

        public a(int i10) {
            this.f33609a = i10;
        }

        public final void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public void b(n1.b bVar) {
        }

        public abstract void c(n1.b bVar);

        public void d(n1.b bVar, int i10, int i11) {
            throw new SQLiteException(n1.c.a("Can't downgrade database from version ", i10, " to ", i11));
        }

        public void e(n1.b bVar) {
        }

        public abstract void f(n1.b bVar, int i10, int i11);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f33610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f33611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f33612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f33613d;

        public b(Context context, String str, a aVar, boolean z10) {
            this.f33610a = context;
            this.f33611b = str;
            this.f33612c = aVar;
            this.f33613d = z10;
        }
    }

    public interface c {
        d a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    n1.b getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z10);
}
