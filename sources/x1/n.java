package x1;

import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;

/* JADX INFO: loaded from: classes.dex */
public final class n extends u {

    public static final class a extends u.a<a, n> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f37419c.f29743d = OverwritingInputMerger.class.getName();
        }
    }

    public n(a aVar) {
        super(aVar.f37418b, aVar.f37419c, aVar.f37420d);
    }
}
