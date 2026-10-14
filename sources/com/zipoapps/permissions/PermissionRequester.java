package com.zipoapps.permissions;

import androidx.activity.result.b;
import androidx.appcompat.app.AppCompatActivity;
import c.c;
import d0.a;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class PermissionRequester extends BasePermissionRequester {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f28238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b<String> f28239f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionRequester(AppCompatActivity appCompatActivity, String str) {
        super(appCompatActivity);
        j0.i(appCompatActivity, "activity");
        j0.i(str, "permission");
        this.f28238e = str;
        b<String> bVarRegisterForActivityResult = appCompatActivity.registerForActivityResult(new c(), new a(this));
        j0.h(bVarRegisterForActivityResult, "activity.registerForActi…sult(isGranted)\n        }");
        this.f28239f = bVarRegisterForActivityResult;
    }

    @Override // com.zipoapps.permissions.BasePermissionRequester
    public b<?> h() {
        return this.f28239f;
    }
}
