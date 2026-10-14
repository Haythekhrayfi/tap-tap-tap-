package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class b extends com.google.android.play.core.internal.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.internal.af f11903a = new com.google.android.play.core.internal.af("AssetPackExtractionService");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f11904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AssetPackExtractionService f11905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bb f11906d;

    public b(Context context, AssetPackExtractionService assetPackExtractionService, bb bbVar) {
        this.f11904b = context;
        this.f11905c = assetPackExtractionService;
        this.f11906d = bbVar;
    }

    @Override // com.google.android.play.core.internal.w
    public final void a(Bundle bundle, com.google.android.play.core.internal.y yVar) throws RemoteException {
        String[] packagesForUid;
        this.f11903a.a("updateServiceState AIDL call", new Object[0]);
        if (com.google.android.play.core.internal.by.a(this.f11904b) && (packagesForUid = this.f11904b.getPackageManager().getPackagesForUid(Binder.getCallingUid())) != null && Arrays.asList(packagesForUid).contains("com.android.vending")) {
            yVar.a(this.f11905c.a(bundle), new Bundle());
        } else {
            yVar.a(new Bundle());
            this.f11905c.a();
        }
    }

    @Override // com.google.android.play.core.internal.w
    public final void a(com.google.android.play.core.internal.y yVar) throws RemoteException {
        this.f11906d.f();
        yVar.b(new Bundle());
    }
}
