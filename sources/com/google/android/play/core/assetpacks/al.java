package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final class al extends ak<ParcelFileDescriptor> {
    public al(ar arVar, com.google.android.play.core.tasks.i<ParcelFileDescriptor> iVar) {
        super(arVar, iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.play.core.assetpacks.ak, com.google.android.play.core.internal.u
    public final void b(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.b(bundle, bundle2);
        this.f11856a.b((T) ((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor")));
    }
}
