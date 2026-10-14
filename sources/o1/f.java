package o1;

import android.database.sqlite.SQLiteStatement;
import n1.g;

/* JADX INFO: loaded from: classes.dex */
public class f extends e implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SQLiteStatement f33886d;

    public f(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f33886d = sQLiteStatement;
    }

    public int a() {
        return this.f33886d.executeUpdateDelete();
    }
}
