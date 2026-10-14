package okhttp3.internal.cache;

import defpackage.a;
import fd.j0;
import java.io.IOException;
import jc.w;
import okhttp3.internal.Util;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends l implements uc.l<IOException, w> {
    public final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.this$0 = diskLruCache;
    }

    @Override // uc.l
    public /* bridge */ /* synthetic */ w invoke(IOException iOException) {
        invoke2(iOException);
        return w.f31842a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(IOException iOException) {
        j0.i(iOException, "it");
        DiskLruCache diskLruCache = this.this$0;
        if (!Util.assertionsEnabled || Thread.holdsLock(diskLruCache)) {
            this.this$0.hasJournalErrors = true;
            return;
        }
        StringBuilder sbA = a.a("Thread ");
        sbA.append((Object) Thread.currentThread().getName());
        sbA.append(" MUST hold lock on ");
        sbA.append(diskLruCache);
        throw new AssertionError(sbA.toString());
    }
}
