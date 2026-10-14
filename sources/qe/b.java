package qe;

import androidx.recyclerview.widget.RecyclerView;
import re.d;
import re.f;
import re.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends c implements d {
    public d c(long j10, l lVar) {
        return j10 == Long.MIN_VALUE ? b(RecyclerView.FOREVER_NS, lVar).b(1L, lVar) : b(-j10, lVar);
    }

    public d e(f fVar) {
        return fVar.adjustInto(this);
    }
}
