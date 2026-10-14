package o1;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class a implements n1.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f33869d = new String[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SQLiteDatabase f33870c;

    /* JADX INFO: renamed from: o1.a$a, reason: collision with other inner class name */
    public class C0372a implements SQLiteDatabase.CursorFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n1.f f33871a;

        public C0372a(a aVar, n1.f fVar) {
            this.f33871a = fVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f33871a.a(new e(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f33870c = sQLiteDatabase;
    }

    public String a() {
        return this.f33870c.getPath();
    }

    public Cursor b(String str) {
        return c(new n1.a(str));
    }

    public Cursor c(n1.f fVar) {
        return this.f33870c.rawQueryWithFactory(new C0372a(this, fVar), fVar.b(), f33869d, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f33870c.close();
    }
}
