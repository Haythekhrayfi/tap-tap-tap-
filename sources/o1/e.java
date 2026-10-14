package o1;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: loaded from: classes.dex */
public class e implements n1.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SQLiteProgram f33885c;

    public e(SQLiteProgram sQLiteProgram) {
        this.f33885c = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f33885c.close();
    }
}
