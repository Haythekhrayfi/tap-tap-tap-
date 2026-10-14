package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class as extends au<List<SplitInstallSessionState>> {
    public as(av avVar, com.google.android.play.core.tasks.i<List<SplitInstallSessionState>> iVar) {
        super(avVar, iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.play.core.splitinstall.au, com.google.android.play.core.internal.bw
    public final void a(List<Bundle> list) throws RemoteException {
        super.a(list);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(SplitInstallSessionState.a(list.get(i10)));
        }
        this.f12411a.b((T) arrayList);
    }
}
