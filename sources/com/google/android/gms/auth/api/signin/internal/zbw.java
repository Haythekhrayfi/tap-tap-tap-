package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import f1.a;
import g1.b;

/* JADX INFO: loaded from: classes.dex */
final class zbw implements a.InterfaceC0253a {
    public final /* synthetic */ SignInHubActivity zba;

    public /* synthetic */ zbw(SignInHubActivity signInHubActivity, zbv zbvVar) {
        this.zba = signInHubActivity;
    }

    @Override // f1.a.InterfaceC0253a
    public final b onCreateLoader(int i10, Bundle bundle) {
        return new zbc(this.zba, GoogleApiClient.getAllClients());
    }

    @Override // f1.a.InterfaceC0253a
    public final /* bridge */ /* synthetic */ void onLoadFinished(b bVar, Object obj) {
        SignInHubActivity signInHubActivity = this.zba;
        signInHubActivity.setResult(signInHubActivity.zbe, signInHubActivity.zbf);
        this.zba.finish();
    }

    @Override // f1.a.InterfaceC0253a
    public final void onLoaderReset(b bVar) {
    }
}
