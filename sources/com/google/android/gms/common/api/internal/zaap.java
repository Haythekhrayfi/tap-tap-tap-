package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class zaap extends zaav {
    public final /* synthetic */ zaaw zaa;
    private final ArrayList<Api.Client> zac;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaap(zaaw zaawVar, ArrayList<Api.Client> arrayList) {
        super(zaawVar, null);
        this.zaa = zaawVar;
        this.zac = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.zaav
    public final void zaa() {
        zaaw zaawVar = this.zaa;
        zaawVar.zaa.zag.zad = zaaw.zao(zaawVar);
        ArrayList<Api.Client> arrayList = this.zac;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Api.Client client = arrayList.get(i10);
            zaaw zaawVar2 = this.zaa;
            client.getRemoteService(zaawVar2.zao, zaawVar2.zaa.zag.zad);
        }
    }
}
