package o1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class c implements n1.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f33873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f33874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n1.d.a f33875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f33876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f33877g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f33878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f33879i;

    public static class a extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o1.a[] f33880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n1.d.a f33881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f33882e;

        /* JADX INFO: renamed from: o1.c$a$a, reason: collision with other inner class name */
        public class C0373a implements DatabaseErrorHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n1.d.a f33883a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o1.a[] f33884b;

            public C0373a(n1.d.a aVar, o1.a[] aVarArr) {
                this.f33883a = aVar;
                this.f33884b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                n1.d.a aVar = this.f33883a;
                o1.a aVarB = a.b(this.f33884b, sQLiteDatabase);
                Objects.requireNonNull(aVar);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + aVarB.a());
                if (aVarB.f33870c.isOpen()) {
                    List<Pair<String, String>> attachedDbs = null;
                    try {
                        try {
                            attachedDbs = aVarB.f33870c.getAttachedDbs();
                        } catch (SQLiteException unused) {
                        }
                        try {
                            aVarB.f33870c.close();
                        } catch (IOException unused2) {
                        }
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<Pair<String, String>> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                aVar.a((String) it.next().second);
                            }
                        } else {
                            aVar.a(aVarB.a());
                        }
                    }
                }
            }
        }

        public a(Context context, String str, o1.a[] aVarArr, n1.d.a aVar) {
            super(context, str, null, aVar.f33609a, new C0373a(aVar, aVarArr));
            this.f33881d = aVar;
            this.f33880c = aVarArr;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x000e  */
        public static o1.a b(o1.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            o1.a aVar = aVarArr[0];
            if (aVar == null) {
                aVarArr[0] = new o1.a(sQLiteDatabase);
            } else {
                if (!(aVar.f33870c == sQLiteDatabase)) {
                    aVarArr[0] = new o1.a(sQLiteDatabase);
                }
            }
            return aVarArr[0];
        }

        public o1.a a(SQLiteDatabase sQLiteDatabase) {
            return b(this.f33880c, sQLiteDatabase);
        }

        public synchronized n1.b c() {
            this.f33882e = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!this.f33882e) {
                return a(writableDatabase);
            }
            close();
            return c();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f33880c[0] = null;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f33881d.b(b(this.f33880c, sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f33881d.c(b(this.f33880c, sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f33882e = true;
            this.f33881d.d(b(this.f33880c, sQLiteDatabase), i10, i11);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f33882e) {
                return;
            }
            this.f33881d.e(b(this.f33880c, sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f33882e = true;
            this.f33881d.f(b(this.f33880c, sQLiteDatabase), i10, i11);
        }
    }

    public c(Context context, String str, n1.d.a aVar, boolean z10) {
        this.f33873c = context;
        this.f33874d = str;
        this.f33875e = aVar;
        this.f33876f = z10;
    }

    public final a a() {
        a aVar;
        synchronized (this.f33877g) {
            if (this.f33878h == null) {
                o1.a[] aVarArr = new o1.a[1];
                if (this.f33874d == null || !this.f33876f) {
                    this.f33878h = new a(this.f33873c, this.f33874d, aVarArr, this.f33875e);
                } else {
                    this.f33878h = new a(this.f33873c, new File(this.f33873c.getNoBackupFilesDir(), this.f33874d).getAbsolutePath(), aVarArr, this.f33875e);
                }
                this.f33878h.setWriteAheadLoggingEnabled(this.f33879i);
            }
            aVar = this.f33878h;
        }
        return aVar;
    }

    @Override // n1.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }

    @Override // n1.d
    public String getDatabaseName() {
        return this.f33874d;
    }

    @Override // n1.d
    public n1.b getWritableDatabase() {
        return a().c();
    }

    @Override // n1.d
    public void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.f33877g) {
            a aVar = this.f33878h;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z10);
            }
            this.f33879i = z10;
        }
    }
}
