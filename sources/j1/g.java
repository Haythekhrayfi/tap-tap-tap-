package j1;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    private final androidx.room.g mDatabase;
    private final AtomicBoolean mLock = new AtomicBoolean(false);
    private volatile n1.g mStmt;

    public g(androidx.room.g gVar) {
        this.mDatabase = gVar;
    }

    public n1.g a() {
        this.mDatabase.a();
        if (!this.mLock.compareAndSet(false, true)) {
            return this.mDatabase.d(b());
        }
        if (this.mStmt == null) {
            this.mStmt = this.mDatabase.d(b());
        }
        return this.mStmt;
    }

    public abstract String b();

    public void c(n1.g gVar) {
        if (gVar == this.mStmt) {
            this.mLock.set(false);
        }
    }
}
