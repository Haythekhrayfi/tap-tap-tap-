package okhttp3.internal.cache;

import fd.j0;
import java.io.IOException;
import jc.w;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class DiskLruCache$Editor$newSink$1$1 extends l implements uc.l<IOException, w> {
    public final /* synthetic */ DiskLruCache this$0;
    public final /* synthetic */ DiskLruCache.Editor this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
        super(1);
        this.this$0 = diskLruCache;
        this.this$1 = editor;
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
        DiskLruCache.Editor editor = this.this$1;
        synchronized (diskLruCache) {
            editor.detach$okhttp();
        }
    }
}
