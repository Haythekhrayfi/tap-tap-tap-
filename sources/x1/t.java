package x1;

import android.annotation.SuppressLint;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AddedAbstractMethod"})
public abstract class t {
    public final o a(u uVar) {
        List listSingletonList = Collections.singletonList(uVar);
        y1.k kVar = (y1.k) this;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new y1.g(kVar, listSingletonList).a();
    }

    public o b(String str, androidx.work.e eVar, n nVar) {
        return new y1.g((y1.k) this, str, eVar, Collections.singletonList(nVar)).a();
    }
}
