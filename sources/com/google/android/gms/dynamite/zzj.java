package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class zzj implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iZza = iVersions.zza(context, str);
        selectionResult.localVersion = iZza;
        int i10 = 0;
        int iZzb = iZza != 0 ? iVersions.zzb(context, str, false) : iVersions.zzb(context, str, true);
        selectionResult.remoteVersion = iZzb;
        int i11 = selectionResult.localVersion;
        if (i11 == 0) {
            if (iZzb == 0) {
                selectionResult.selection = 0;
            }
            return selectionResult;
        }
        i10 = i11;
        if (i10 >= iZzb) {
            selectionResult.selection = -1;
        } else {
            selectionResult.selection = 1;
        }
        return selectionResult;
    }
}
