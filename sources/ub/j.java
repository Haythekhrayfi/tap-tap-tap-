package ub;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public enum j implements pb.b<me.c> {
    INSTANCE;

    @Override // pb.b
    public void accept(me.c cVar) throws Exception {
        cVar.request(RecyclerView.FOREVER_NS);
    }
}
