package com.zipoapps.permissions;

import androidx.activity.result.b;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.c;
import androidx.lifecycle.p;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BasePermissionRequester implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatActivity f28233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28234d;

    public BasePermissionRequester(AppCompatActivity appCompatActivity) {
        j0.i(appCompatActivity, "activity");
        this.f28233c = appCompatActivity;
        appCompatActivity.getLifecycle().a(this);
    }

    @Override // androidx.lifecycle.c, androidx.lifecycle.f
    public void e(p pVar) {
        j0.i(pVar, "owner");
        h().c();
        pVar.getLifecycle().c(this);
    }

    public abstract b<?> h();
}
